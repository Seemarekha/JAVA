package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Combination_Sum {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 6, 7 };
		int target = 7;

		List<List<Integer>> res = new ArrayList<List<Integer>>();
		findCombinations(arr, target, 0, new ArrayList<Integer>(), res);
		System.out.println(res); // [[2, 2, 3], [7]]
	}

	private static void findCombinations(int[] arr, int target, int index, List<Integer> current,
			List<List<Integer>> res) {
		if (target == 0) {
			res.add(new ArrayList<Integer>(current));
			return;
		}

		if (target < 0 || index == arr.length)
			return;

		current.add(arr[index]);
		findCombinations(arr, target - arr[index], index, current, res);
		current.remove(current.size() - 1);

		findCombinations(arr, target, index + 1, current, res);
	}

}
