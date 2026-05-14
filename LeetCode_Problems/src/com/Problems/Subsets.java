/*
Given an integer array nums of unique elements, return all possible subsets (the power set).

The solution set must not contain duplicate subsets. Return the solution in any order.

 

Example 1:

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]


Example 2:

Input: nums = [0]
Output: [[],[0]]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		int[] nums2 = { 0 };

		System.out.println("Subsets of [1,2,3]:");
		System.out.println(subsets(nums1)); // [[], [1], [1, 2], [1, 2, 3], [1, 3], [2], [2, 3], [3]]

		System.out.println("\nSubsets of [0]:");
		System.out.println(subsets(nums2)); // [[], [0]]

	}

	private static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backTrack(res, new ArrayList<Integer>(), nums, 0);
		return res;
	}

	private static void backTrack(List<List<Integer>> res, ArrayList<Integer> temp, int[] nums, int start) {
		res.add(new ArrayList<Integer>(temp));

		for (int i = start; i < nums.length; i++) {
			temp.add(nums[i]);
			backTrack(res, temp, nums, i + 1);
			temp.remove(temp.size() - 1);
		}

	}

}
