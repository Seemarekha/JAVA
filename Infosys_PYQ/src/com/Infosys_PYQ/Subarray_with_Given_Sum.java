/*
Problem

Given an array and a target sum k,
find whether a subarray exists whose sum equals k.

You can also return:

count
longest length
indexes
Core Idea — Prefix Sum

Prefix Sum:

prefixSum[i] = sum of elements from 0 to i

If:

currentPrefixSum - previousPrefixSum = k

then:

subarray sum = k

So we store prefix sums in HashMap.

Formula

If:

prefixSum
i
	​

−prefixSum
j
	​

=k

then subarray (j+1 → i) has sum k.

Example
arr = [10, 2, -2, -20, 10]
k = -10
Prefix sums
10
12
10
-10
0

At index 3:

currentSum = -10

Since:

currentSum == k

Subarray from 0 → 3 exists.
 */

package com.Infosys_PYQ;

import java.util.HashMap;

public class Subarray_with_Given_Sum {

	public static void main(String[] args) {
		int[] arr = { 10, 2, -2, -20, 10 };
		int k = -10;

		System.out.println(subarraySum(arr, k));  // true

	}

	private static boolean subarraySum(int[] arr, int k) {
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		int prefixSum = 0;

		for (int i = 0; i < arr.length; i++) {
			prefixSum += arr[i];

			if (prefixSum == k)
				return true;

			if (hm.containsKey(prefixSum - k))
				return true;

			hm.put(prefixSum, i);
		}
		return false;
	}

}
