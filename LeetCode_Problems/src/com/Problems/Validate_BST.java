package com.Problems;

public class Validate_BST {

	public static void main(String[] args) {

		TreeNode root = new TreeNode(10);
		root.left = new TreeNode(5);
		root.right = new TreeNode(15);
		root.right.left = new TreeNode(6);
		root.right.right = new TreeNode(20);

		System.out.println(isValidBST(root));

	}

	private static boolean isValidBST(TreeNode root) {

		return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
	}

	private static boolean validate(TreeNode node, long minValue, long maxValue) {
		if (node == null)
			return true;

		if (node.val <= minValue || node.val >= maxValue)
			return false;

		return validate(node.left, minValue, node.val) && validate(node.right, node.val, maxValue); // false
	}

}
