package com.Problems;

public class BinaryTreeToDLL {

	TreeNode root;
	TreeNode head;
	TreeNode prev;

	public static void main(String[] args) {
		BinaryTreeToDLL tree = new BinaryTreeToDLL();

		tree.root = new TreeNode(10);
		tree.root.left = new TreeNode(12);
		tree.root.right = new TreeNode(15);
		tree.root.left.left = new TreeNode(25);
		tree.root.left.right = new TreeNode(30);
		tree.root.right.left = new TreeNode(36);

		tree.convertToDLL(tree.root);
		tree.printDLL(tree.head);

	}

	private void convertToDLL(TreeNode node) {
		if (node == null)
			return;

		convertToDLL(node.left);

		if (prev == null) {
			head = node;
		} else {
			node.left = prev;
			prev.right = node;
		}

		prev = node;

		convertToDLL(node.right);

	}

	private void printDLL(TreeNode node) {
		TreeNode last = null;
		System.out.println("Doubly LinkedList (Forward) : ");
		while (node != null) {
			System.out.print(node.val + " ");
			last = node;
			node = node.right;
		}
		System.out.println();
		System.out.println("Doubly LinkedList (Backward) : ");
		while (last != null) {
			System.out.print(last.val + " ");
			last = last.left;
		}
	}

}


/************ Output **************/

/*

input: 

         10
        /  \
      12    15
     /  \   /
    25  30 36


output:

Doubly LinkedList (Forward) : 
25 12 30 10 36 15 
Doubly LinkedList (Backward) : 
15 36 10 30 12 25 


*/