/*
Given a n-ary tree, find its maximum depth.

The maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.

Nary-Tree input serialization is represented in their level order traversal, each group of children is separated by the null value (See examples).

Example 1:

Input: root = [1,null,3,2,4,null,5,6]
Output: 3


Example 2:

Input: root = [1,null,2,3,4,5,null,null,6,7,null,8,null,9,10,null,null,11,null,12,null,13,null,null,14]
Output: 5
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class NodeII {
	public int val;
	public List<NodeII> children;

	public NodeII() {
	}

	public NodeII(int val) {
		this.val = val;
        this.children = new ArrayList<>();
	}

	public NodeII(int val, List<NodeII> children) {
		this.val = val;
        this.children = children;
	}
};

public class Maximum_Depth_Of_Nary_Tree {

	public static void main(String[] args) {
		NodeII root = new NodeII(1);
		NodeII node3 = new NodeII(3);
		NodeII node2 = new NodeII(2);
		NodeII node4 = new NodeII(4);
		root.children = Arrays.asList(node3, node2, node4);

		node3.children = Arrays.asList(new NodeII(5), new NodeII(6));

		System.out.println(maxDepth(root)); // Output: 3

	}

	private static int maxDepth(NodeII root) {
		if (root == null)
			return 0;

		int max = 0;

		for (NodeII child : root.children) {
			max = Math.max(max, maxDepth(child));
		}
		return max+1;
	}

}


/*


        1
      / | \
     3  2  4
    / \
   5   6



*/
