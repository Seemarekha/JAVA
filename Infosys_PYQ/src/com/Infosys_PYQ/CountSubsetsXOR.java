/*
Problem

Count subsets whose XOR equals target K.

Example
arr = [6,9,4,2]
K = 6

Output
2
 */

package com.Infosys_PYQ;

public class CountSubsetsXOR {

	public static void main(String[] args) {
		int[] arr = { 6, 9, 4, 2 };

		System.out.println(countSubsets(arr, 6)); // 2

	}

	private static int countSubsets(int[] arr, int k) {
		int n = arr.length;
		int XOR_MAX = 1024;

		int[][] dp = new int[n + 1][XOR_MAX];
		dp[0][0] = 1;

		for (int i = 1; i <= n; i++) {
			for (int x = 0; x < XOR_MAX; x++) {
				dp[i][x] = dp[i - 1][x] + dp[i - 1][x ^ arr[i - 1]];
			}
		}
		return dp[n][k];
	}

}
