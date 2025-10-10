package com.array_programs;

import java.util.ArrayList;
import java.util.List;

public class Two_Sum {

	public static void main(String[] args) {
		int[] arr = { 3, 6, 2, 7, 5, 4 };
		int target = 9;
		List<List<Integer>> res = twoSum(arr, target);
		System.out.println(res); // [[3, 6], [2, 7], [5, 4]]

	}

	private static List<List<Integer>> twoSum(int[] arr, int target) {
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {

				if (arr[i] + arr[j] == target) {
					List<Integer> res = new ArrayList<Integer>();
					res.add(arr[i]);
					res.add(arr[j]);
					result.add(res);
				}
			}

		}
		return result;
	}

}
