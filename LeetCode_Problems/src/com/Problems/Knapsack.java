/*
Problem Statement

You are given:

Weights = [1, 3, 4, 5]
Values  = [1, 4, 5, 7]
Bag Capacity = 7

Goal:

Put items into bag
such that total profit is maximum
without exceeding capacity.
 */

package com.Problems;

public class Knapsack {

	public static void main(String[] args) {
		int[] wt = { 1, 3, 4, 5 };
		int[] v = { 1, 4, 5, 7 };

		int W = 7;

		int n = wt.length;

		int[][] dp = new int[n + 1][W + 1];

		for (int i = 1; i <= n; i++) {
			for (int w = 1; w <= W; w++) {
				if (wt[i - 1] <= w) {
					dp[i][w] = Math.max(dp[i - 1][w], dp[i - 1][w - wt[i - 1]] + v[i - 1]);
				} else {
					dp[i][w] = dp[i - 1][w];
				}
			}
		}

		System.out.println(dp[n][W]);  // 9
	}

}
