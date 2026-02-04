/*
Given a collection of numbers, nums, that might contain duplicates, return all possible unique permutations in any order.

 

Example 1:

Input: nums = [1,1,2]
Output:
[[1,1,2],
 [1,2,1],
 [2,1,1]]
 
 
Example 2:

Input: nums = [1,2,3]
Output: [[1,2,3],[1,3,2],[2,1,3],[2,3,1],[3,1,2],[3,2,1]]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Permutation_II {

	public static void main(String[] args) {
		int[] nums = { 3, 3, 0, 3 };
		List<List<Integer>> permutations = permuteUnique(nums);

		System.out.println("Unique Permutations:");
		for (List<Integer> perm : permutations) {
			System.out.println(perm);
		}

	}

	private static List<List<Integer>> permuteUnique(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(nums);
		boolean[] used = new boolean[nums.length];
		backTrack(nums, used, new ArrayList<>(), res);
		return res;
	}

	private static void backTrack(int[] nums, boolean[] used, List<Integer> temp, List<List<Integer>> res) {

		if (temp.size() == nums.length) {
			res.add(new ArrayList<Integer>(temp));
			return;
		}

		for (int i = 0; i < nums.length; i++) {
			if (used[i])
				continue;

			if (i > 0 && nums[i] == nums[i - 1] && !used[i - 1])
				continue;

			used[i] = true;
			temp.add(nums[i]);
			backTrack(nums, used, temp, res);
			temp.remove(temp.size() - 1);
			used[i] = false;
		}

	}

}
