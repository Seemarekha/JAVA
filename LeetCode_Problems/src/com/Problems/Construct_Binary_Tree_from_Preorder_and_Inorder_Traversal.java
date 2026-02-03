/*
Given two integer arrays preorder and inorder where preorder is the preorder traversal of a binary tree and inorder is the inorder traversal of the same tree, construct and return the binary tree.


Example 1:


Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]


Example 2:

Input: preorder = [-1], inorder = [-1]
Output: [-1]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal {

	private int preIndex = 0;
	private Map<Integer, Integer> inorderMap = new HashMap<>();

	public static void main(String[] args) {
		Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal obj = new Construct_Binary_Tree_from_Preorder_and_Inorder_Traversal();

		int[] preorder = { 3, 9, 20, 15, 7 };
		int[] inorder = { 9, 3, 15, 20, 7 };

		TreeNode root = obj.buildTree(preorder, inorder);
		System.out.println(printLevelOrder(root)); // [3, 9, 20, null, null, 15, 7]

	}

	public static List<String> printLevelOrder(TreeNode root) {
		List<String> result = new ArrayList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);

		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			if (node == null) {
				result.add("null");
			} else {
				result.add(String.valueOf(node.val));
				queue.offer(node.left);
				queue.offer(node.right);
			}
		}

		int i = result.size() - 1;
		while (i >= 0 && result.get(i).equals("null")) {
			result.remove(i);
			i--;
		}

		return result;
	}

	private TreeNode buildTree(int[] preorder, int[] inorder) {
		for (int i = 0; i < inorder.length; i++) {
			inorderMap.put(inorder[i], i);
		}
		return build(preorder, 0, inorder.length - 1);
	}

	private TreeNode build(int[] preorder, int inStart, int inEnd) {
		if (inStart > inEnd)
			return null;

		int rootVal = preorder[preIndex++];

		TreeNode root = new TreeNode(rootVal);
		int mid = inorderMap.get(rootVal);

		root.left = build(preorder, inStart, mid - 1);
		root.right = build(preorder, mid + 1, inEnd);

		return root;
	}

}
