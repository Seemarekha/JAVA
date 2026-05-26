/*
Problem

Find the:

longest path between any two nodes

in a binary tree.

Path may or may not pass through root.

Example
        1
       / \
      2   3
     / \
    4   5

Diameter:

4 → 2 → 1 → 3

Length:

3 edges
 */

package com.Infosys_PYQ;

public class Diameter_of_Binary_Tree {

	static int diameter = 0;

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.left = new TreeNode(4);
		root.left.right = new TreeNode(5);

		System.out.println("Diameter of Binary Tree : " + findDiameter(root)); // 3

	}

	private static int findDiameter(TreeNode root) {
		height(root);
		return diameter;
	}

	private static int height(TreeNode root) {
		if (root == null)
			return 0;

		int left = height(root.left);
		int right = height(root.right);
		diameter = Math.max(diameter, left + right);

		return 1 + Math.max(left, right);
	}

}
