/*
Problem Statement

You are given balloons:

nums[i]

When you burst balloon i, coins gained are:

nums[left]×nums[i]×nums[right]

where:

left = nearest unburst balloon on left
right = nearest unburst balloon on right
Important Rule

If no left/right balloon exists:

use:

1
Example

Input:

[3,1,5,8]

Output:

167
 */

package com.Infosys_PYQ;

public class BurstBalloons {

	public static void main(String[] args) {
		int[] nums = { 3, 1, 5, 8 };

		System.out.println(maxCoins(nums));  // 167

	}

	private static int maxCoins(int[] nums) {
		int n = nums.length;

		int[] arr = new int[n + 2];
		arr[0] = arr[n + 1] = 1;

		for (int i = 0; i < n; i++) {
			arr[i + 1] = nums[i];
		}

		int[][] dp = new int[n + 2][n + 2];

		for (int len = 1; len <= n; len++) {
			for (int i = 1; i <= n - len + 1; i++) {
				int j = i + len - 1;
				for (int k = i; k <= j; k++) {
					int cost = dp[i][k - 1] + dp[k + 1][j] + arr[i - 1] * arr[k] * arr[j + 1];
					dp[i][j] = Math.max(dp[i][j], cost);
				}

			}
		}

		return dp[1][n];
	}

}
