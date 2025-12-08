package com.Problems;

public class Longest_Palindromic_Substring {

	public static void main(String[] args) {
		String s = "ba bd";
		System.out.println(longestPalindrome(s));  // bab
	}

	private static String longestPalindrome(String s) {
		if (s.length() < 2)
			return s;

		int start = 0, max = 1;

		for (int i = 0; i < s.length(); i++) {
			int left = i, right = i;

			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > max) {
					max = right - left + 1;
					start = left;
				}
				left--;
				right++;
			}

			left = i;
			right = i + 1;

			while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
				if (right - left + 1 > max) {
					max = right - left + 1;
					start = left;
				}
				left--;
				right++;
			}
		}
		return s.substring(start, start + max);
	}

}
