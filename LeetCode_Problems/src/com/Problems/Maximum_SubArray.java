/*
Given an integer array nums, find the subarray with the largest sum, and return its sum.

Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.


Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.


Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.

 */

package com.Problems;

public class Maximum_SubArray {

	public static void main(String[] args) {
		int[] nums1 = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println(maxSubArray(nums1)); // 6

		int[] nums2 = { 1 };
		System.out.println(maxSubArray(nums2)); // 1

		int[] nums3 = { 5, 4, -1, 7, 8 };
		System.out.println(maxSubArray(nums3)); // 23

	}

	private static int maxSubArray(int[] arr) {
		int currSum = arr[0];
		int maxSum = arr[0];

		for (int i = 1; i < arr.length; i++) {
			currSum = Math.max(arr[i], currSum + arr[i]);
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}

}
