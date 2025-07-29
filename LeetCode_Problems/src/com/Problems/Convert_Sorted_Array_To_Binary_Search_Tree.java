/*
Given an integer array nums where the elements are sorted in ascending order, convert it to a height-balanced binary search tree.


Example 1:

Input: nums = [-10,-3,0,5,9]
Output: [0,-3,9,-10,null,5]
Explanation: [0,-10,5,null,-3,null,9] is also accepted:

Example 2:

Input: nums = [1,3]
Output: [3,1]
Explanation: [1,null,3] and [3,1] are both height-balanced BSTs.

 */

package com.Problems;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNodeA {
	int val;
	TreeNodeA left, right;

	TreeNodeA(int val) {
		this.val = val;
	}
}

public class Convert_Sorted_Array_To_Binary_Search_Tree {

	public static void main(String[] args) {
		Convert_Sorted_Array_To_Binary_Search_Tree res = new Convert_Sorted_Array_To_Binary_Search_Tree();

		int[] nums1 = { -10, -3, 0, 5, 9 };
		TreeNodeA bst1 = res.sortedArrayToBST(nums1);
		System.out.println("BST for [-10,-3,0,5,9] : " + res.levelOrder(bst1));

		int[] nums2 = { 1, 3 };
		TreeNodeA bst2 = res.sortedArrayToBST(nums2);
		System.out.println("BST for [1,3] : " + res.levelOrder(bst2));
	}

	private List<String> levelOrder(TreeNodeA root) {
		List<String> result = new ArrayList<>();
		if (root == null)
			return result;

		Queue<TreeNodeA> q = new LinkedList<TreeNodeA>();

		q.offer(root);

		while (!q.isEmpty()) {
			TreeNodeA n = (TreeNodeA) q.poll();
			if (n != null) {
				result.add(String.valueOf(n.val));
				q.offer(n.left);
				q.offer(n.right);
			} else {
				result.add("null");
			}
		}

		while (result.size() > 0 && result.get(result.size() - 1).equals("null")) {
			result.remove(result.size() - 1);
		}
		return result;
	}

	private TreeNodeA sortedArrayToBST(int[] nums) {

		return buildBST(nums, 0, nums.length - 1);
	}

	private TreeNodeA buildBST(int[] nums, int left, int right) {
		if (left > right)
			return null;

		int mid = left + (right - left) / 2;
		TreeNodeA node = new TreeNodeA(nums[mid]);
		node.left = buildBST(nums, left, mid - 1);
		node.right = buildBST(nums, mid + 1, right);

		return node;
	}

}
