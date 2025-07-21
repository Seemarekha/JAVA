/*
Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.

Example 1:

Input: s = "abab"
Output: true
Explanation: It is the substring "ab" twice.
Example 2:

Input: s = "aba"
Output: false
Example 3:

Input: s = "abcabcabcabc"
Output: true
Explanation: It is the substring "abc" four times or the substring "abcabc" twice.

 */

package com.Problems;

public class Repeated_Substring_Pattern {

	public static void main(String[] args) {
		System.out.println(repeatedSubstringPattern("abab")); // true
		System.out.println(repeatedSubstringPattern("aba")); // false
		System.out.println(repeatedSubstringPattern("abcabcabcabc")); // true

	}

	private static boolean repeatedSubstringPattern(String s) {
		String doubled = s + s;
		String sliced = doubled.substring(1, doubled.length() - 1);
		return sliced.contains(s);
	}

}
