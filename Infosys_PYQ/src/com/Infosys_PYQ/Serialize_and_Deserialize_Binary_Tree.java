/*
Problem

Convert a binary tree into:

string representation

and reconstruct the same tree back.

Example

Tree:

       1
      / \
     2   3
        / \
       4   5

Serialized:

1,2,3,null,null,4,5,null,null,null,null
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Serialize_and_Deserialize_Binary_Tree {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.right.left = new TreeNode(4);
		root.right.right = new TreeNode(5);

		String serialized = serialize(root);

		System.out.println("Serialized:");
		System.out.println(serialized);

		TreeNode droot = deserialize(serialized);

		System.out.println("Level Order:");
		printTree(droot);

	}

	private static String serialize(TreeNode root) {
		if (root == null)
			return "";

		StringBuilder sb = new StringBuilder();

		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			if (node == null) {
				sb.append("null,");
			} else {
				sb.append(node.val).append(",");

				q.offer(node.left);
				q.offer(node.right);
			}

		}
		return sb.toString();
	}

	private static TreeNode deserialize(String data) {

		if (data == null || data.isEmpty())
			return null;

		String[] values = data.split(",");

		TreeNode root = new TreeNode(Integer.parseInt(values[0]));
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);

		int i = 1;
		while (!q.isEmpty() && i < values.length) {
			TreeNode parent = q.poll();

			if (!values[i].equals("null")) {
				TreeNode left = new TreeNode(Integer.parseInt(values[i]));
				parent.left = left;
				q.offer(left);
			}
			i++;

			if (!values[i].equals("null")) {
				TreeNode right = new TreeNode(Integer.parseInt(values[i]));
				parent.right = right;
				q.offer(right);
			}
			i++;
		}
		return root;
	}

	private static void printTree(TreeNode root) {
		if (root == null)
			return;
		Queue<TreeNode> q = new LinkedList<TreeNode>();
		q.offer(root);
		while (!q.isEmpty()) {
			TreeNode node = q.poll();

			System.out.print(node.val + " ");

			if (node.left != null)
				q.offer(node.left);

			if (node.right != null)
				q.offer(node.right);
		}
		System.out.println();

	}

}
