/*
Given an array nums of distinct integers, return all the possible permutations. You can return the answer in any order.

Example 1:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]


Example 2:

Input: nums = [0,1]
Output: [[0,1],[1,0]]


Example 3:

Input: nums = [1]
Output: [[1]]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Permutations {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 3 };
		System.out.println(permute(nums1));
		// [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]

		int[] nums2 = { 0, 1 };
		System.out.println(permute(nums2));
		// [[0,1],[1,0]]

		int[] nums3 = { 1 };
		System.out.println(permute(nums3));
		// [[1]]

	}

	private static List<List<Integer>> permute(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backTrack(res, new ArrayList<>(), nums, new boolean[nums.length]);
		return res;
	}

	private static void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, boolean[] used) {
		if (temp.size() == nums.length) {
			res.add(new ArrayList<>(temp));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;
			used[i] = true;
			temp.add(nums[i]);
			backTrack(res, temp, nums, used);
			temp.remove(temp.size() - 1);
			used[i] = false;
		}

	}

}
