package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class Longest_SubArray_With_Sum_K {

	public static void main(String[] args) {
		int[] arr = { 10, 5, 2, 7, 1, 9 };
		int k = 15;

		System.out.println("Longest Subarray Length = " + longestSubarrayWithSumK(arr, k));
		// Longest Subarray Length = 4

	}

	private static int longestSubarrayWithSumK(int[] arr, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		int sum = 0;
		int maxLen = 0;

		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];

			if (sum == k)
				maxLen = i + 1;

			if (map.containsKey(sum - k)) {
				maxLen = Math.max(maxLen, i - map.get(sum - k));
			}

			if (!map.containsKey(sum))
				map.put(sum, i);

		}
		return maxLen;
	}

}
