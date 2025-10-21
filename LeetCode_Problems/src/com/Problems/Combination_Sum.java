/*
Given an array of distinct integers candidates and a target integer target, return a list of all unique combinations of candidates where the chosen numbers sum to target. You may return the combinations in any order.

The same number may be chosen from candidates an unlimited number of times. Two combinations are unique if the frequency of at least one of the chosen numbers is different.

The test cases are generated such that the number of unique combinations that sum up to target is less than 150 combinations for the given input.
 

Example 1:

Input: candidates = [2,3,6,7], target = 7
Output: [[2,2,3],[7]]
Explanation:
2 and 3 are candidates, and 2 + 2 + 3 = 7. Note that 2 can be used multiple times.
7 is a candidate, and 7 = 7.
These are the only two combinations.


Example 2:

Input: candidates = [2,3,5], target = 8
Output: [[2,2,2,2],[2,3,3],[3,5]]


Example 3:

Input: candidates = [2], target = 1
Output: []
 */

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
