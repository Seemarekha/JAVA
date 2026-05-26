package com.Infosys_PYQ;

import java.util.ArrayList;
import java.util.List;

public class PowerSet {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3 };

		System.out.println(subsets(nums));
	}

	private static List<List<Integer>> subsets(int[] nums) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		backTrack(res, new ArrayList<>(), nums, 0);

		return res;
	}

	private static void backTrack(List<List<Integer>> res, List<Integer> temp, int[] nums, int index) {
		if (index == nums.length) {
			res.add(new ArrayList<Integer>(temp));
			return;
		}

		temp.add(nums[index]);
		backTrack(res, temp, nums, index + 1);

		temp.remove(temp.size() - 1);

		backTrack(res, temp, nums, index + 1);

	}

}
