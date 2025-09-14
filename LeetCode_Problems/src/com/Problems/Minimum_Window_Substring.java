/*
Given two strings s and t of lengths m and n respectively, return the minimum window substring of s such that every character in t (including duplicates) is included in the window. If there is no such substring, return the empty string "".

The testcases will be generated such that the answer is unique.

Example 1:

Input: s = "ADOBECODEBANC", t = "ABC"
Output: "BANC"
Explanation: The minimum window substring "BANC" includes 'A', 'B', and 'C' from string t.


Example 2:

Input: s = "a", t = "a"
Output: "a"
Explanation: The entire string s is the minimum window.


Example 3:

Input: s = "a", t = "aa"
Output: ""
Explanation: Both 'a's from t must be included in the window.
Since the largest window of s only has one 'a', return empty string.
 */

package com.Problems;

import java.util.HashMap;

public class Minimum_Window_Substring {

	public static void main(String[] args) {
		System.out.println(minWindow("ADOBECODEBANC", "ABC")); // "BANC"
		System.out.println(minWindow("a", "a")); // "a"
		System.out.println(minWindow("a", "aa")); // ""

	}

	private static String minWindow(String s, String t) {
		if (s == null || t == null || s.length() < t.length())
			return "";

		HashMap<Character, Integer> need = new HashMap<Character, Integer>();
		for (char c : t.toCharArray()) {
			need.put(c, need.getOrDefault(c, 0) + 1);
		}

		int have = 0, needCount = need.size();
		int left = 0, minLen = Integer.MAX_VALUE, start = 0;
		HashMap<Character, Integer> window = new HashMap<Character, Integer>();

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			window.put(c, window.getOrDefault(c, 0) + 1);

			if (need.containsKey(c) && window.get(c).intValue() == need.get(c).intValue()) {
				have++;
			}

			while (have == needCount) {
				if ((right - left + 1) < minLen) {
					minLen = right - left + 1;
					start = left;
				}

				char leftChar = s.charAt(left);
				window.put(leftChar, window.get(leftChar) - 1);

				if (need.containsKey(leftChar) && window.get(leftChar) < need.get(leftChar)) {
					have--;
				}
				left++;
			}

		}
		return minLen == Integer.MAX_VALUE ? "" : s.substring(start, start + minLen);
	}

}
