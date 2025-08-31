/*
Given a binary array nums, return the maximum number of consecutive 1's in the array.


Example 1:

Input: nums = [1,1,0,1,1,1]
Output: 3
Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.


Example 2:

Input: nums = [1,0,1,1,0,1]
Output: 2
 */

package com.Problems;

public class Max_Consecutive_Ones {

	public static void main(String[] args) {
		int[] nums1 = { 1, 1, 0, 1, 1, 1 };
		System.out.println(findMaxConsecutiveOnes(nums1)); // 3

		int[] nums2 = { 1, 0, 1, 1, 0, 1 };
		System.out.println(findMaxConsecutiveOnes(nums2)); // 2

	}

	private static int findMaxConsecutiveOnes(int[] nums) {
		int count = 0, maxCount = 0;

		for (int num : nums) {
			if (num == 1) {
				count++;
				maxCount = Math.max(count, maxCount);
			} else {
				count = 0;
			}
		}
		return maxCount;
	}

}
