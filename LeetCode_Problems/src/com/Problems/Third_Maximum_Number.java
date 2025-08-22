/*
Given an integer array nums, return the third distinct maximum number in this array. If the third maximum does not exist, return the maximum number.

Example 1:

Input: nums = [3,2,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2.
The third distinct maximum is 1.
Example 2:

Input: nums = [1,2]
Output: 2
Explanation:
The first distinct maximum is 2.
The second distinct maximum is 1.
The third distinct maximum does not exist, so the maximum (2) is returned instead.
Example 3:

Input: nums = [2,2,3,1]
Output: 1
Explanation:
The first distinct maximum is 3.
The second distinct maximum is 2 (both 2's are counted together since they have the same value).
The third distinct maximum is 1.

 */

package com.Problems;

import java.util.TreeSet;

public class Third_Maximum_Number {

	public static void main(String[] args) {
		int[] nums1 = { 3, 2, 1 };
		System.out.println(thirdMax(nums1)); // Output: 1

		int[] nums2 = { 1, 2 };
		System.out.println(thirdMax(nums2)); // Output: 2

		int[] nums3 = { 2, 2, 3, 1 };
		System.out.println(thirdMax(nums3)); // Output: 1

	}

	private static int thirdMax(int[] nums) {
		TreeSet<Integer> set = new TreeSet<Integer>();

		for (int num : nums) {
			set.add(num);

			if (set.size() > 3)
				set.pollFirst();

		}

		if (set.size() < 3)
			return set.last();

		return set.first();
	}

}
