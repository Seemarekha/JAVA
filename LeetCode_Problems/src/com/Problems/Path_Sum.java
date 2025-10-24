/*
Given the root of a binary tree and an integer targetSum, return true if the tree has a root-to-leaf path such that adding up all the values along the path equals targetSum.

A leaf is a node with no children.


Example 1:


Input: root = [5,4,8,11,null,13,4,7,2,null,null,null,1], targetSum = 22
Output: true
Explanation: The root-to-leaf path with the target sum is shown.


Example 2:


Input: root = [1,2,3], targetSum = 5
Output: false
Explanation: There are two root-to-leaf paths in the tree:
(1 --> 2): The sum is 3.
(1 --> 3): The sum is 4.
There is no root-to-leaf path with sum = 5.


Example 3:

Input: root = [], targetSum = 0
Output: false
Explanation: Since the tree is empty, there are no root-to-leaf paths.

 */

package com.Problems;

public class Path_Sum {

	public static void main(String[] args) {

		TreeNode root1 = new TreeNode(5);
		root1.left = new TreeNode(4);
		root1.right = new TreeNode(8);
		root1.left.left = new TreeNode(11);
		root1.left.left.left = new TreeNode(7);
		root1.left.left.right = new TreeNode(2);
		root1.right.left = new TreeNode(13);
		root1.right.right = new TreeNode(4);
		root1.right.right.right = new TreeNode(1);
		int targetSum1 = 22;
		System.out.println("Example 1: " + hasPathSum(root1, targetSum1)); // true

		TreeNode root2 = new TreeNode(1);
		root2.left = new TreeNode(2);
		root2.right = new TreeNode(3);
		int targetSum2 = 5;
		System.out.println("Example 2: " + hasPathSum(root2, targetSum2)); // false

		TreeNode root3 = null;
		int targetSum3 = 0;
		System.out.println("Example 3: " + hasPathSum(root3, targetSum3)); // false

	}

	private static boolean hasPathSum(TreeNode root, int targetSum) {
		if (root == null)
			return false;

		if (root.left == null && root.right == null)
			return root.val == targetSum;

		int newTarget = targetSum - root.val;
		return hasPathSum(root.left, newTarget) || hasPathSum(root.right, newTarget);
	}

}


