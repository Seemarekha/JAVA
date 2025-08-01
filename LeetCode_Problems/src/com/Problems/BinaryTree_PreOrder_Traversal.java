package com.Problems;

import java.util.ArrayList;
import java.util.List;

class TreeNode_T {
	      int val;
	      TreeNode_T left;
	      TreeNode_T right;
	      TreeNode_T() {}
	      TreeNode_T(int val) { this.val = val; }
	      TreeNode_T(int val, TreeNode_T left, TreeNode_T right) {
	          this.val = val;
	          this.left = left;
	          this.right = right;
	     }
	 }
 
 
public class BinaryTree_PreOrder_Traversal {

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

        BinaryTree_PreOrder_Traversal pt=new BinaryTree_PreOrder_Traversal();
        List<Integer> result = pt.preOrderTraversal(root);
        System.out.println("Preorder Traversal: " + result);  // Output: [1, 2, 4, 5, 6, 7, 3, 8, 9]
	}

	private List<Integer> preOrderTraversal(TreeNode_T root) {
		List<Integer> res=new ArrayList<Integer>();
		preOrder(root,res);
		return res;
	}

	private void preOrder(TreeNode_T node, List<Integer> res) {
		if(node==null) return;
		
		res.add(node.val);
		preOrder(node.left,res);
		preOrder(node.right,res);
		
	}

}
