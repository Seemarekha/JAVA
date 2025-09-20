/*
Given a binary search tree (BST), find the lowest common ancestor (LCA) node of two given nodes in the BST.

According to the definition of LCA on Wikipedia: “The lowest common ancestor is defined between two nodes p and q as the lowest node in T that has both p and q as descendants (where we allow a node to be a descendant of itself).”

Example 1:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 8
Output: 6
Explanation: The LCA of nodes 2 and 8 is 6.


Example 2:

Input: root = [6,2,8,0,4,7,9,null,null,3,5], p = 2, q = 4
Output: 2
Explanation: The LCA of nodes 2 and 4 is 2, since a node can be a descendant of itself according to the LCA definition.


Example 3:

Input: root = [2,1], p = 2, q = 1
Output: 2
 */

package com.Problems;

class TreeNodeBST {
	int val;
	TreeNodeBST left, right;

	TreeNodeBST(int x) {
		val = x;
	}
}

public class Lowest_Common_Ancestor_Of_BST {

	public static void main(String[] args) {
		Integer[] arr = { 6, 2, 8, 0, 4, 7, 9, null, null, 3, 5 };
		TreeNodeBST root = insertLevelOrder(arr, 0);

		// Example 1: p=2, q=8 → LCA=6
		TreeNodeBST p = findNode(root, 2);
		TreeNodeBST q = findNode(root, 8);
		System.out.println("LCA of 2 and 8 = " + lowestCommonAncestor(root, p, q).val);

		// Example 2: p=2, q=4 → LCA=2
		p = findNode(root, 2);
		q = findNode(root, 4);
		System.out.println("LCA of 2 and 4 = " + lowestCommonAncestor(root, p, q).val);

		// Example 3: root=[2,1], p=2, q=1 → LCA=2
		Integer[] arr2 = { 2, 1 };
		TreeNodeBST root2 = insertLevelOrder(arr2, 0);
		p = findNode(root2, 2);
		q = findNode(root2, 1);
		System.out.println("LCA of 2 and 1 = " + lowestCommonAncestor(root2, p, q).val);

	}

	private static TreeNodeBST lowestCommonAncestor(TreeNodeBST root, TreeNodeBST p, TreeNodeBST q) {
		if (root == null)
			return null;

		if (p.val < root.val && q.val < root.val)
			return lowestCommonAncestor(root.left, p, q);
		else if (p.val > root.val && q.val > root.val)
			return lowestCommonAncestor(root.right, p, q);
		else
			return root;

	}

	private static TreeNodeBST findNode(TreeNodeBST root, int val) {
		if (root == null)
			return null;
		if (root.val == val)
			return root;
		return (val < root.val) ? findNode(root.left, val) : findNode(root.right, val);
	}

	private static TreeNodeBST insertLevelOrder(Integer[] arr, int i) {
		if (i >= arr.length || arr[i] == null)
			return null;
		TreeNodeBST root = new TreeNodeBST(arr[i]);
		root.left = insertLevelOrder(arr, 2 * i + 1);
		root.right = insertLevelOrder(arr, 2 * i + 2);
		return root;
	}

}
