/*
Given an input string (s) and a pattern (p), implement wildcard pattern matching with support for '?' and '*' where:

'?' Matches any single character.
'*' Matches any sequence of characters (including the empty sequence).
The matching should cover the entire input string (not partial).

 

Example 1:

Input: s = "aa", p = "a"
Output: false
Explanation: "a" does not match the entire string "aa".


Example 2:

Input: s = "aa", p = "*"
Output: true
Explanation: '*' matches any sequence.


Example 3:

Input: s = "cb", p = "?a"
Output: false
Explanation: '?' matches 'c', but the second letter is 'a', which does not match 'b'.
 */

package com.Problems;

public class WildCard_Matching {

	public static void main(String[] args) {
		System.out.println(isMatch("aa", "a")); // false
		System.out.println(isMatch("aa", "*")); // true
		System.out.println(isMatch("cb", "?a")); // false
		System.out.println(isMatch("adceb", "*a*b"));// true
		System.out.println(isMatch("acdcb", "a*c?b"));// false

	}

	private static boolean isMatch(String s, String p) {
		int i = 0, j = 0;
		int starIndex = -1, matchIndex = -1;

		while (i < s.length()) {
			if (j < p.length() && (p.charAt(j) == s.charAt(i) || p.charAt(j) == '?')) {
				i++;
				j++;
			} else if (j < p.length() && p.charAt(j) == '*') {
				starIndex = j;
				matchIndex = i;
				j++;
			} else if (starIndex != -1) {
				j = starIndex + 1;
				matchIndex++;
				i = matchIndex;
			} else {
				return false;
			}
		}

		while (j < p.length() && p.charAt(j) == '*')
			j++;

		return j == p.length();
	}

}
