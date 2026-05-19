/*
Given the root of a binary search tree (BST) with duplicates, return all the mode(s) (i.e., the most frequently occurred element) 
in it.

If the tree has more than one mode, return them in any order.

Assume a BST is defined as follows:

The left subtree of a node contains only nodes with keys less than or equal to the node's key.
The right subtree of a node contains only nodes with keys greater than or equal to the node's key.
Both the left and right subtrees must also be binary search trees.
 

Example 1:


Input: root = [1,null,2,2]
Output: [2]


Example 2:

Input: root = [0]
Output: [0]
 

Constraints:

The number of nodes in the tree is in the range [1, 104].
-105 <= Node.val <= 105
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
	int val;
	TreeNode left, right;

	TreeNode(int val) {
		this.val = val;
	}
}

public class BSTModes {

	private int currentCount = 0;
	private int maxCount = 0;
	private Integer prev = null;
	private List<Integer> result = new ArrayList<Integer>();

	public static void main(String[] args) {

	/*
        Example 1:
        Input: [1, null, 2, 2]

            1
             \
              2
             /
            2
    */

		TreeNode root = new TreeNode(1);
		root.right = new TreeNode(2);
		root.right.left = new TreeNode(2);

		BSTModes obj = new BSTModes();
		int[] modes = obj.findMode(root);

		// Print result
		System.out.print("Modes: ");
		for (int num : modes) {
			System.out.print(num + " ");  // Modes: 2 
		}

	}

	private int[] findMode(TreeNode root) {

		inOrder(root);

		int[] ans = new int[result.size()];
		for (int i = 0; i < result.size(); i++) {
			ans[i] += result.get(i);
		}
		return ans;
	}

	private void inOrder(TreeNode node) {
		if (node == null)
			return;

		inOrder(node.left);

		if (prev == null || node.val != prev)
			currentCount = 1;
		else
			currentCount++;

		if (currentCount > maxCount) {
			maxCount = currentCount;
			result.clear();
			result.add(node.val);
		} else if (currentCount == maxCount)
			result.add(node.val);

		prev = node.val;

		inOrder(node.right);

	}

}
