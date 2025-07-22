/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.


Example 1:

Input: s = "Let's take LeetCode contest"
Output: "s'teL ekat edoCteeL tsetnoc"
Example 2:

Input: s = "Mr Ding"
Output: "rM gniD"
 */

package com.Problems;

public class Reverse_Words_In_A_String {

	public static void main(String[] args) {
		String input1 = "Let's take LeetCode contest";
		String input2 = "Mr Ding";

		System.out.println(reverseWords(input1)); // s'teL ekat edoCteeL tsetnoc
		System.out.println(reverseWords(input2)); // rM gniD

	}

	private static String reverseWords(String s) {
		String[] words = s.split(" ");
		StringBuilder res = new StringBuilder();

		for (String word : words) {
			StringBuilder sb = new StringBuilder(word);
			res.append(sb.reverse()).append(" ");
		}
		return res.toString().trim();
	}

}
