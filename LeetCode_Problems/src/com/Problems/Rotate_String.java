/*
Given two strings s and goal, return true if and only if s can become goal after some number of shifts on s.

A shift on s consists of moving the leftmost character of s to the rightmost position.

For example, if s = "abcde", then it will be "bcdea" after one shift.
 

Example 1:

Input: s = "abcde", goal = "cdeab"
Output: true


Example 2:

Input: s = "abcde", goal = "abced"
Output: false

 */

package com.Problems;

public class Rotate_String {

	public static void main(String[] args) {
		String s1 = "abcde";
		String goal1 = "cdeab";
		System.out.println(rotateString(s1, goal1)); // Output: true

		String s2 = "abcde";
		String goal2 = "abced";
		System.out.println(rotateString(s2, goal2)); // Output: false
	}

	private static boolean rotateString(String s, String goal) {
		if (s.length() != goal.length())
			return false;

		String doubles = s + s;
		return doubles.contains(goal);
	}

}
