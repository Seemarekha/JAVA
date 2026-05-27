/*
Problem

Convert sorted array into:

Height Balanced BST
Key Observation

Middle element should become root.

Because:

left half smaller
right half larger

Creates balanced structure.

Example
[-10,-3,0,5,9]

Possible BST:

        0
       / \
     -3   9
     /   /
   -10  5
 */

package com.Infosys_PYQ;

import java.util.LinkedList;
import java.util.Queue;

public class SortedArrayToBST {

	public static void main(String[] args) {
		int[] nums = { -10, -3, 0, 5, 9 };
		TreeNode root = sortedArrayToBST(nums);
		printTree(root);

	}

	private static TreeNode sortedArrayToBST(int[] nums) {
		return build(nums, 0, nums.length - 1);
	}

	private static TreeNode build(int[] nums, int left, int right) {

		if (left > right)
			return null;

		int mid = left + (right - left) / 2;

		TreeNode root = new TreeNode(nums[mid]);
		root.left = build(nums, left, mid - 1);
		root.right = build(nums, mid + 1, right);

		return root;
	}

	private static void printTree(TreeNode root) {
		if (root == null)
			return;

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();
			System.out.print(node.val + " ");

			if (node.left != null)
				q.offer(node.left);

			if (node.right != null)
				q.offer(node.right);
		}
		System.out.println();

	}

}
