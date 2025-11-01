/*
Given the roots of two binary trees root and subRoot, return true if there is a subtree of root with the same structure and node values of subRoot and false otherwise.

A subtree of a binary tree tree is a tree that consists of a node in tree and all of this node's descendants. The tree tree could also be considered as a subtree of itself.


Example 1:

Input: root = [3,4,5,1,2], subRoot = [4,1,2]
Output: true


Example 2:

Input: root = [3,4,5,1,2,null,null,null,null,0], subRoot = [4,1,2]
Output: false

 */

package com.Problems;

public class Subtree_Of_Another_Tree {

	public static void main(String[] args) {
		/*
		 * Example 1: root = [3,4,5,1,2] subRoot = [4,1,2] Expected Output: true
		 */

		// Build main tree (root)
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(4);
		root.right = new TreeNode(5);
		root.left.left = new TreeNode(1);
		root.left.right = new TreeNode(2);

		// Build subRoot tree
		TreeNode subRoot = new TreeNode(4);
		subRoot.left = new TreeNode(1);
		subRoot.right = new TreeNode(2);

		boolean result = isSubtree(root, subRoot);
		System.out.println("Is subRoot a subtree of root? " + result); // true

		/*
		 * Example 2: root = [3,4,5,1,2,null,null,null,null,0] subRoot = [4,1,2]
		 * Expected Output: false
		 */

		TreeNode root2 = new TreeNode(3);
		root2.left = new TreeNode(4);
		root2.right = new TreeNode(5);
		root2.left.left = new TreeNode(1);
		root2.left.right = new TreeNode(2);
		root2.left.right.left = new TreeNode(0); // extra node

		TreeNode subRoot2 = new TreeNode(4);
		subRoot2.left = new TreeNode(1);
		subRoot2.right = new TreeNode(2);

		boolean result2 = isSubtree(root2, subRoot2);
		System.out.println("Is subRoot2 a subtree of root2? " + result2); // false

	}

	private static boolean isSubtree(TreeNode root, TreeNode subRoot) {
		if (root == null)
			return false;

		if (isSameTree(root, subRoot))
			return true;

		return isSubtree(root.left, subRoot) || isSubtree(root.right, subRoot);
	}

	private static boolean isSameTree(TreeNode s, TreeNode t) {
		if (s == null && t == null)
			return true;
		if (s == null || t == null)
			return false;
		if (s.val != t.val)
			return false;

		return isSameTree(s.left, t.left) && isSameTree(s.right, t.right);
	}

}
