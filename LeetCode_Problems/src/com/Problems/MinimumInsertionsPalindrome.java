/*
Problem

Find minimum insertions required to convert string into palindrome.

Example
Input: "abcda"

Output: 2

Possible:

"adcbcda"
 */

package com.Problems;

public class MinimumInsertionsPalindrome {

	public static void main(String[] args) {
		String s = "abcda";

		System.out.println(minInsertions(s)); // 2

	}

	private static int minInsertions(String s) {
		String rev = new StringBuilder(s).reverse().toString();
		int n = s.length();

		int[][] dp = new int[n + 1][n + 1];

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (s.charAt(i - 1) == rev.charAt(j - 1)) {
					dp[i][j] = 1 + dp[i - 1][j - 1];
				} else {
					dp[i][j] = Math.max(dp[i][j - 1], dp[i - 1][j]);
				}
			}

		}
		return n - dp[n][n];
	}

}
