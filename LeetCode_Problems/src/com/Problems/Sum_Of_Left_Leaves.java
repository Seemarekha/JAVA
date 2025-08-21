/*
Given the root of a binary tree, return the sum of all left leaves.

A leaf is a node with no children. A left leaf is a leaf that is the left child of another node.

Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 24
Explanation: There are two left leaves in the binary tree, with values 9 and 15 respectively.
Example 2:

Input: root = [1]
Output: 0

 */

package com.Problems;

public class Sum_Of_Left_Leaves {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);

		int result = sumOfLeftLeaves(root);
		System.out.println("Sum of Left Leaves = " + result); // 24

	}

	private static int sumOfLeftLeaves(TreeNode root) {
		return dfs(root, false);
	}

	private static int dfs(TreeNode node, boolean isLeft) {
		if (node == null)
			return 0;

		if (node.left == null && node.right == null) {
			return isLeft ? node.val : 0;
		}

		return dfs(node.left, true) + dfs(node.right, false);
	}

}
