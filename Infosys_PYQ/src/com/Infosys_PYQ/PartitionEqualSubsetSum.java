/*
Problem

Determine if array can be divided into:

two subsets with equal sum
Example
[1,5,11,5]

Output:

true

Because:

[1,5,5] = 11
[11] = 11
 */

package com.Infosys_PYQ;

public class PartitionEqualSubsetSum {

	public static void main(String[] args) {
		int[] nums = { 1, 5, 11, 5 };

		System.out.println(canPartition(nums)); // true

	}

	private static boolean canPartition(int[] nums) {
		int totalSum = 0;
		for (int n : nums)
			totalSum += n;

		if (totalSum % 2 != 0)
			return false;

		int target = totalSum / 2;

		boolean[] dp = new boolean[target + 1];
		dp[0] = true;

		for (int num : nums) {
			for (int i = target; i >= num; i--) {
				dp[i] = dp[i] || dp[i - num];
			}
		}
		return dp[target];
	}

}
