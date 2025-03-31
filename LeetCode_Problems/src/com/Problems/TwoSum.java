package com.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public static void main(String[] args) {

		int[] arr = { 1, 8, 15, 2, 5 };
		int targetValue = 13;

		int[] output = twoSum(arr, targetValue);
		System.out.println("Indices of two numbers that return target value : " + Arrays.toString(output));

	}

	private static int[] twoSum(int[] arr, int targetValue) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < arr.length; i++) {
			int diff = targetValue - arr[i];
			if (map.containsKey(diff))
				return new int[] { map.get(diff), i };
			map.put(arr[i], i);
		}
		return null;
	}

}

/************ Output ***************/

/*
 * 
 * 
 * Indices of two numbers that return target value : [1, 4]
 * 
 */
