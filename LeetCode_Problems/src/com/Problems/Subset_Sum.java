/*
Problem Statement

Given:

arr = [3, 34, 4, 12, 5, 2]
sum = 9

Find:

Is there any subset
whose sum equals 9 ?

Possible subsets:

4 + 5 = 9

OR

3 + 4 + 2 = 9

So answer:

true
 */

package com.Problems;

public class Subset_Sum {

	public static void main(String[] args) {
		int[] arr = { 3, 34, 4, 12, 5, 2 };

		int sum = 9;

		boolean[][] dp = new boolean[arr.length][sum + 1];
		for (int i = 0; i < arr.length; i++) {
			dp[i][0] = true;
		}

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j <= sum; j++) {
				if (arr[i] <= j) {
					dp[i][j] = dp[i - 1][j] || dp[i - 1][j - arr[i]];
				} else {
					dp[i][j] = dp[i - 1][j];
				}
			}
		}

		System.out.println(dp[arr.length - 1][sum]);  // true
 
	}

}
