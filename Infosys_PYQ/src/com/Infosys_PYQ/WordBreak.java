/*
Problem

Given:

string s
dictionary of valid words

Determine if string can be segmented into valid dictionary words.

Example
s = "leetcode"

dict = ["leet", "code"]

Output:

true
 */

package com.Infosys_PYQ;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class WordBreak {

	public static void main(String[] args) {
		String s = "leetcode";

		List<String> dict = Arrays.asList("leet", "code");

		System.out.println(wordBreak(s, dict)); // true

	}

	private static boolean wordBreak(String s, List<String> dict) {
		int n = s.length();
		Set<String> set = new HashSet<String>(dict);

		boolean[] dp = new boolean[n + 1];
		dp[0] = true;

		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				if (dp[j] && set.contains(s.substring(j, i))) {
					dp[i] = true;
					break;
				}

			}
		}
		return dp[n];
	}

}
