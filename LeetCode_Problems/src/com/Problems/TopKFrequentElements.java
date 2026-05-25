/*
Given an integer array nums and an integer k, return the k most frequent elements.

Example:

Input: nums = [1,1,1,2,2,3], k = 2

Output: [1,2]

Because:

1 appears 3 times
2 appears 2 times
3 appears 1 time

Top 2 frequent elements are:

[1,2]

 */

package com.Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElements {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 2, 2, 3 };
		int k = 2;

		int[] ans = topKFrequent(nums, k);

		System.out.println(Arrays.toString(ans)); // [1, 2]

	}

	private static int[] topKFrequent(int[] nums, int k) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : nums) {
			map.put(num, map.getOrDefault(num, 0) + 1);
		}

		PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a, b) -> map.get(a) - map.get(b));

		for (int key : map.keySet()) {
			pq.offer(key);

			if (pq.size() > k)
				pq.poll();
		}

		int[] res = new int[k];

		for (int i = k - 1; i >= 0; i--)
			res[i] = pq.poll();

		return res;
	}

}
