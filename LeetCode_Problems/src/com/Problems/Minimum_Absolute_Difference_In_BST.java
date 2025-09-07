/*
Given the root of a Binary Search Tree (BST), return the minimum absolute difference between the values of any two different nodes in the tree.

Example 1:


Input: root = [4,2,6,1,3]
Output: 1
Example 2:


Input: root = [1,0,48,null,null,12,49]
Output: 1
 */

package com.Problems;

class BST {

	private Integer prev;
	private int minDiff;

	public int getMinimumDifference(TreeNode root) {
		prev = null;
		minDiff = Integer.MAX_VALUE;
		inOrder(root);
		return minDiff;
	}

	private void inOrder(TreeNode node) {
		if (node == null)
			return;

		inOrder(node.left);

		if (prev != null)
			minDiff = Math.min(minDiff, node.val - prev);

		prev = node.val;

		inOrder(node.right);

	}

}

public class Minimum_Absolute_Difference_In_BST {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(4);
		root1.left = new TreeNode(2);
		root1.right = new TreeNode(6);
		root1.left.left = new TreeNode(1);
		root1.left.right = new TreeNode(3);

		BST sol = new BST();

		System.out.println("Minimum difference (Example 1): " + sol.getMinimumDifference(root1)); // Expected output: 1

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(0);
		root2.right = new TreeNode(48);
		root2.right.left = new TreeNode(12);
		root2.right.right = new TreeNode(49);

		System.out.println("Minimum difference (Example 2): " + sol.getMinimumDifference(root2)); // Expected output: 1

	}

}
