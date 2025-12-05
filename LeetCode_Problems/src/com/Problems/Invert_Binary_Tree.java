/*
Given the root of a binary tree, invert the tree, and return its root.

Example 1:

Input: root = [4,2,7,1,3,6,9]
Output: [4,7,2,9,6,3,1]


Example 2:

Input: root = [2,1,3]
Output: [2,3,1]


Example 3:

Input: root = []
Output: []

 */

package com.Problems;

public class Invert_Binary_Tree {
	public static void main(String[] args) {
		TreeNode root = new TreeNode(4);
		root.left = new TreeNode(2);
		root.right = new TreeNode(7);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(3);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(9);

		printTree(root); // 4 2 1 3 7 6 9
		invertTree(root);
		System.out.println();
		printTree(root); // 4 7 9 6 2 3 1
	}

	private static TreeNode invertTree(TreeNode root) {
		if (root == null)
			return null;

		TreeNode temp = root.left;
		root.left = root.right;
		root.right = temp;

		invertTree(root.left);
		invertTree(root.right);

		return root;
	}

	private static void printTree(TreeNode root) {
		if (root == null)
			return;

		System.out.print(root.val + " ");
		printTree(root.left);
		printTree(root.right);

	}
}
