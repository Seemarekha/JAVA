/*
 Given a binary tree, find its minimum depth.

The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.

Note: A leaf is a node with no children.


Example 1:


Input: root = [3,9,20,null,null,15,7]
Output: 2
Example 2:

Input: root = [2,null,3,null,4,null,5,null,6]
Output: 5
 */

package com.Problems;

public class Minimum_Depth_Of_BinaryTree {

	public static void main(String[] args) {
		TreeNode root1 = new TreeNode(3);
		root1.left = new TreeNode(9);
		root1.right = new TreeNode(20);
		root1.right.left = new TreeNode(15);
		root1.right.right = new TreeNode(7);

		System.out.println("Minimum Depth (Example 1): " + minDepth(root1)); // Output: 2

		TreeNode root2 = new TreeNode(2);
		root2.right = new TreeNode(3);
		root2.right.right = new TreeNode(4);
		root2.right.right.right = new TreeNode(5);
		root2.right.right.right.right = new TreeNode(6);

		System.out.println("Minimum Depth (Example 2): " + minDepth(root2)); // Output: 5

	}

	private static int minDepth(TreeNode root) {
		if (root == null)
			return 0;

		if (root.left == null)
			return 1 + minDepth(root.right);

		if (root.right == null)
			return 1 + minDepth(root.left);

		return 1 + Math.min(minDepth(root.left), minDepth(root.right));
	}

}
