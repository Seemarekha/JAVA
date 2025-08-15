package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Binary_Tree_Path {

	public static void main(String[] args) {
		TreeNode root = new TreeNode(1);
		root.left = new TreeNode(2);
		root.right = new TreeNode(3);
		root.left.right = new TreeNode(5);

		List<String> paths = binaryTreePaths(root);
		System.out.println(paths);

	}

	private static List<String> binaryTreePaths(TreeNode root) {
		List<String> res = new ArrayList<String>();
		if (root != null) {
			dfs(root, "", res);
		}
		return res;
	}

	private static void dfs(TreeNode node, String path, List<String> res) {
		if (node == null)
			return;
		path += node.val;

		if (node.left == null && node.right == null)
			res.add(path);
		else {
			path += "->";
			dfs(node.left, path, res);
			dfs(node.right, path, res);
		}

	}

}

/*
 * 
 * 
 *   1
 *  / \ 
 * 2   3
 * \
 *  5
 * Output : [1->2->5, 1->3]
 * 
 */