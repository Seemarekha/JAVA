/*
Given an unsorted array of integers nums, return the length of the longest continuous increasing subsequence (i.e. subarray). The subsequence must be strictly increasing.

A continuous increasing subsequence is defined by two indices l and r (l < r) such that it is [nums[l], nums[l + 1], ..., nums[r - 1], nums[r]] and for each l <= i < r, nums[i] < nums[i + 1].

 
Example 1:

Input: nums = [1,3,5,4,7]
Output: 3
Explanation: The longest continuous increasing subsequence is [1,3,5] with length 3.
Even though [1,3,5,7] is an increasing subsequence, it is not continuous as elements 5 and 7 are separated by element
4.


Example 2:

Input: nums = [2,2,2,2,2]
Output: 1
Explanation: The longest continuous increasing subsequence is [2] with length 1. Note that it must be strictly
increasing.
 */

package com.Problems;

public class Longest_Continuous_Increasing_Subsequence {

	public static void main(String[] args) {
		int[] nums1 = { 1, 3, 5, 4, 7 };
		int[] nums2 = { 2, 2, 2, 2, 2 };

		System.out.println(findLengthOfLCIS(nums1)); // Output: 3
		System.out.println(findLengthOfLCIS(nums2)); // Output: 1

	}

	private static int findLengthOfLCIS(int[] nums) {
		if (nums.length == 0)
			return 0;

		int currLen = 1, maxLen = 1;

		for (int i = 1; i < nums.length; i++) {
			if (nums[i] > nums[i - 1]) {
				currLen++;
				maxLen = Math.max(maxLen, currLen);
			} else {
				currLen = 1;
			}
		}
		return maxLen;
	}

}
