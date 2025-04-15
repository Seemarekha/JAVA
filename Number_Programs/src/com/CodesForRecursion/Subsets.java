package com.CodesForRecursion;

import java.util.ArrayList;
import java.util.List;

public class Subsets {

	public static void main(String[] args) {
		int[] nums = { 1, 2, 3, 4 };
		List<List<Integer>> result = findSubsets(nums);

		System.out.println("Subsets : "+result);


	}

	private static List<List<Integer>> findSubsets(int[] nums) {
		List<List<Integer>> subsets = new ArrayList<>();
		generateSubsets(0, nums, new ArrayList<>(), subsets);
		return subsets;
	}

	private static void generateSubsets(int index, int[] nums, List<Integer> curr, List<List<Integer>> subsets) {
		if (index == nums.length) {
			subsets.add(new ArrayList<Integer>(curr));
			return;
		}
		generateSubsets(index + 1, nums, curr, subsets);

		curr.add(nums[index]);

		generateSubsets(index + 1, nums, curr, subsets);

		curr.remove(curr.size() - 1);

	}

}
