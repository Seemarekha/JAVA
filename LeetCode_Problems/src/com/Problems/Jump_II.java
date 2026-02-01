/*
You are given a 0-indexed array of integers nums of length n. You are initially positioned at index 0.

Each element nums[i] represents the maximum length of a forward jump from index i. In other words, if you are at index i, you can jump to any index (i + j) where:

0 <= j <= nums[i] and
i + j < n
Return the minimum number of jumps to reach index n - 1. The test cases are generated such that you can reach index n - 1.

 

Example 1:

Input: nums = [2,3,1,1,4]
Output: 2
Explanation: The minimum number of jumps to reach the last index is 2. Jump 1 step from index 0 to 1, then 3 steps to the last index.

Example 2:

Input: nums = [2,3,0,1,4]
Output: 2
 */
package com.Problems;

public class Jump_II {

	public static void main(String[] args) {
		int[] nums1 = { 2, 3, 1, 1, 4 };
		int[] nums2 = { 2, 3, 0, 1, 4 };

		System.out.println("Minimum jumps (Example 1): " + jump(nums1)); // 2
		System.out.println("Minimum jumps (Example 2): " + jump(nums2)); // 2

	}

	private static int jump(int[] nums) {
		int jumps = 0, currentEnd = 0, farthest = 0;

		for (int i = 0; i < nums.length - 1; i++) {
			farthest = Math.max(farthest, i + nums[i]);

			if (i == currentEnd) {
				jumps++;
				currentEnd = farthest;
			}
		}
		return jumps;
	}

}
