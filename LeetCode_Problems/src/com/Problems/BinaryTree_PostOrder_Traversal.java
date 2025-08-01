package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class BinaryTree_PostOrder_Traversal {

	public static void main(String[] args) {
		TreeNode_T root = new TreeNode_T(1);
		root.left = new TreeNode_T(2);
		root.right = new TreeNode_T(3);

		root.left.left = new TreeNode_T(4);
		root.left.right = new TreeNode_T(5);
		root.left.right.left = new TreeNode_T(6);
		root.left.right.right = new TreeNode_T(7);

		root.right.right = new TreeNode_T(8);
		root.right.right.right = new TreeNode_T(9);

		BinaryTree_PostOrder_Traversal pt = new BinaryTree_PostOrder_Traversal();
		List<Integer> result = pt.postOrderTraversal(root);
		System.out.println("Postorder Traversal: " + result); // Output: [4, 6, 7, 5, 2, 9, 8, 3, 1]
	}

	private List<Integer> postOrderTraversal(TreeNode_T root) {
		List<Integer> res = new ArrayList<Integer>();
		postOrder(root, res);
		return res;
	}

	private void postOrder(TreeNode_T node, List<Integer> res) {
		if (node == null)
			return;
		postOrder(node.left, res);
		postOrder(node.right, res);
		res.add(node.val);

	}

}
