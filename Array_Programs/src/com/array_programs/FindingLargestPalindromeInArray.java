package com.array_programs;

public class FindingLargestPalindromeInArray {

	public static void main(String[] args) {
		String[] words = { "racecar", "level", "hello", "world", "madam", "rotor" };
		String longestPalindrome = findLongestPalindrome(words);

		if (longestPalindrome != null) {
			System.out.println("The longest palindrome is: " + longestPalindrome);
		} else {
			System.out.println("No palindrome found in the array.");
		}

	}

	private static String findLongestPalindrome(String[] words) {
		String longestPalindrome = null;

		for (String word : words) {
			if (isPalindrome(word)) {
				if (longestPalindrome == null || word.length() > longestPalindrome.length())
					longestPalindrome = word;
			}
		}
		return longestPalindrome;
	}

	private static boolean isPalindrome(String str) {
		int start = 0;
		int end = str.length() - 1;

		while (start < end) {
			if (str.charAt(start) != str.charAt(end))
				return false;
			start++;
			end--;
		}
		return true;
	}

}
