/*
Print nodes vertically.

Example

Tree:

        3
       / \
      9   20
         /  \
        15   7

Vertical order:

[
 [9],
 [3,15],
 [20],
 [7]
]
 */

package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.TreeMap;

class Pair {
	TreeNode node;
	int hd;

	public Pair(TreeNode node, int hd) {
		this.node = node;
		this.hd = hd;
	}
}

public class VerticalTraversal {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(3);
		root.left = new TreeNode(9);
		root.right = new TreeNode(20);
		root.right.left = new TreeNode(15);
		root.right.right = new TreeNode(7);
		List<List<Integer>> res = verticalOrder(root);
		System.out.println(res);
	}

	private static List<List<Integer>> verticalOrder(TreeNode root) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();

		if (root == null)
			return res;

		TreeMap<Integer, List<Integer>> tmap = new TreeMap<Integer, List<Integer>>();

		Queue<Pair> q = new LinkedList<Pair>();
		q.offer(new Pair(root, 0));

		while (!q.isEmpty()) {
			Pair curr = q.poll();

			TreeNode node = curr.node;
			int hd = curr.hd;

			tmap.putIfAbsent(hd, new ArrayList<>());

			tmap.get(hd).add(node.val);

			if (node.left != null)
				q.offer(new Pair(node.left, hd - 1));

			if (node.right != null) {
				q.offer(new Pair(node.right, hd + 1));
			}
		}

		res.addAll(tmap.values());

		return res;
	}

}
