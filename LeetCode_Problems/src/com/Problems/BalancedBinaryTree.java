package com.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class BalancedBinaryTree {

	public static void main(String[] args) {
		BalancedBinaryTree treeChecker = new BalancedBinaryTree();

		Integer[] input1 = { 3, 9, 20, null, null, 15, 7 };
		Integer[] input2 = { 1, 2, 2, 3, 3, null, null, 4, 4 };
		Integer[] input3 = {};

		TreeNodeA root1 = treeChecker.buildTree(input1);
		TreeNodeA root2 = treeChecker.buildTree(input2);
		TreeNodeA root3 = treeChecker.buildTree(input3);

		System.out.println("Tree 1 is balanced? " + treeChecker.isBalanced(root1)); // true
		System.out.println("Tree 2 is balanced? " + treeChecker.isBalanced(root2)); // false
		System.out.println("Tree 3 is balanced? " + treeChecker.isBalanced(root3)); // true

	}

	private boolean isBalanced(TreeNodeA root) {

		return checkHeight(root) != -1;
	}

	private int checkHeight(TreeNodeA node) {
		if (node == null)
			return 0;

		int left = checkHeight(node.left);
		if (left == -1)
			return -1;

		int right = checkHeight(node.right);
		if (right == -1)
			return 0;

		if (Math.abs(left - right) > 1)
			return -1;

		return Math.max(left, right) + 1;
	}

	private TreeNodeA buildTree(Integer[] arr) {
		if (arr.length == 0 || arr[0] == null)
			return null;

		TreeNodeA root = new TreeNodeA(arr[0]);
		Queue<TreeNodeA> q = new LinkedList<TreeNodeA>();
		q.offer(root);

		int i = 1;
		while (i < arr.length) {
			TreeNodeA curr = q.poll();
			if (i < arr.length && arr[i] != null) {
				curr.left = new TreeNodeA(arr[i]);
				q.offer(curr.left);
			}
			i++;

			if (i < arr.length && arr[i] != null) {
				curr.right = new TreeNodeA(arr[i]);
				q.offer(curr.right);
			}
			i++;

		}
		return root;
	}

}
