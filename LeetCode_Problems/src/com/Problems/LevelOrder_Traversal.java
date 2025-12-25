package com.Problems;

import java.util.LinkedList;
import java.util.Queue;

public class LevelOrder_Traversal {

	static class Node {
		int data;
		Node left, right;

		Node(int data) {
			this.data = data;
			left = right = null;
		}
	}

	public static void main(String[] args) {
		Node root = new Node(1);
		root.left = new Node(2);
		root.right = new Node(3);
		root.left.left = new Node(4);
		root.left.right = new Node(5);

		System.out.print("Level Order Traversal: ");
		levelOrder(root); // Level Order Traversal: 1 2 3 4 5

	}

	private static void levelOrder(Node root) {
		if (root == null)
			return;

		Queue<Node> q = new LinkedList<>();
		q.add(root);

		while (!q.isEmpty()) {
			Node curr = q.poll();

			System.out.print(curr.data + " ");

			if (curr.left != null)
				q.add(curr.left);

			if (curr.right != null)
				q.add(curr.right);
		}

	}

}
