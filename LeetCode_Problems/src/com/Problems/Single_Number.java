/*
Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

You must implement a solution with a linear runtime complexity and use only constant extra space.


Example 1:

Input: nums = [2,2,1]
Output: 1


Example 2:

Input: nums = [4,1,2,1,2]
Output: 4


Example 3:

Input: nums = [1]
Output: 1

 */

package com.Problems;

public class Single_Number {
	public static void main(String[] args) {
		int[] nums1 = { 2, 2, 1 };
		int[] nums2 = { 4, 1, 2, 1, 2 };
		int[] nums3 = { 1 };

		System.out.println(singleNumber(nums1)); // Output: 1
		System.out.println(singleNumber(nums2)); // Output: 4
		System.out.println(singleNumber(nums3)); // Output: 1
	}

	private static int singleNumber(int[] nums) {
		int res = 0;

		for (int num : nums) {
			res ^= num;
		}
		return res;
	}
}
