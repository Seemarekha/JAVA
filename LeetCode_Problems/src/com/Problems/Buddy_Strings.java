/*
Given two strings s and goal, return true if you can swap two letters in s so the result is equal to goal, otherwise, return false.

Swapping letters is defined as taking two indices i and j (0-indexed) such that i != j and swapping the characters at s[i] and s[j].

For example, swapping at indices 0 and 2 in "abcd" results in "cbad".
 

Example 1:

Input: s = "ab", goal = "ba"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'b' to get "ba", which is equal to goal.


Example 2:

Input: s = "ab", goal = "ab"
Output: false
Explanation: The only letters you can swap are s[0] = 'a' and s[1] = 'b', which results in "ba" != goal.


Example 3:

Input: s = "aa", goal = "aa"
Output: true
Explanation: You can swap s[0] = 'a' and s[1] = 'a' to get "aa", which is equal to goal.

 */

package com.Problems;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Buddy_Strings {

	public static void main(String[] args) {
		System.out.println(buddyStrings("ab", "ba")); // true
		System.out.println(buddyStrings("ab", "ab")); // false
		System.out.println(buddyStrings("aa", "aa")); // true
		System.out.println(buddyStrings("abcd", "badc")); // false

	}

	private static boolean buddyStrings(String s, String goal) {
		if (s.length() != goal.length())
			return false;

		if (s.equals(goal)) {
			Set<Character> seen = new HashSet<Character>();
			for (char c : s.toCharArray()) {
				if (!seen.add(c))
					return true;
			}
			return false;
		}

		List<Integer> diff = new ArrayList<Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != goal.charAt(i))
				diff.add(i);
		}

		return diff.size() == 2 && s.charAt(diff.get(0)) == goal.charAt(diff.get(1))
				&& s.charAt(diff.get(1)) == goal.charAt(diff.get(0));
	}

}
