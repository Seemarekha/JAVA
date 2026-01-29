/*
Given a collection of candidate numbers (candidates) and a target number (target), find all unique combinations in candidates where the candidate numbers sum to target.

Each number in candidates may only be used once in the combination.

Note: The solution set must not contain duplicate combinations.

 

Example 1:

Input: candidates = [10,1,2,7,6,1,5], target = 8
Output: 
[
[1,1,6],
[1,2,5],
[1,7],
[2,6]
]


Example 2:

Input: candidates = [2,5,2,1,2], target = 5
Output: 
[
[1,2,2],
[5]
]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Combination_Sum_II {

	public static void main(String[] args) {
		int[] candidates1 = { 10, 1, 2, 7, 6, 1, 5 };
		int target1 = 8;

		List<List<Integer>> result1 = combinationSum2(candidates1, target1);
		System.out.println("Output 1: " + result1); // [[1, 1, 6], [1, 2, 5], [1, 7], [2, 6]]

		int[] candidates2 = { 2, 5, 2, 1, 2 };
		int target2 = 5;

		List<List<Integer>> result2 = combinationSum2(candidates2, target2);
		System.out.println("Output 2: " + result2); // [[1, 2, 2], [5]]
	}

	private static List<List<Integer>> combinationSum2(int[] candidates, int target) {
		List<List<Integer>> res = new ArrayList<List<Integer>>();
		Arrays.sort(candidates);
		backTrack(candidates, target, 0, new ArrayList<Integer>(), res);
		return res;
	}

	private static void backTrack(int[] candidates, int target, int start, List<Integer> current,
			List<List<Integer>> res) {
		if (target == 0) {
			res.add(new ArrayList<Integer>(current));
			return;
		}

		for (int i = start; i < candidates.length; i++) {
			if (i > start && candidates[i] == candidates[i - 1])
				continue;

			if (candidates[i] > target)
				break;

			current.add(candidates[i]);
			backTrack(candidates, target - candidates[i], i + 1, current, res);
			current.remove(current.size() - 1);
		}

	}

}
