//  write a java program smallest substring palindrome in a  given string? 

package com.string_programs;

import java.util.Scanner;

public class SmallestSubstring {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s = new Scanner(System.in).nextLine();
		String sps = findSmallestPalindromeSubstring(s);
		System.out.println("Smallest palindrome substring : " + sps);

	}

	static String findSmallestPalindromeSubstring(String s) {

		if (s == null || s.length() == 0) {
			return "";
		}
		String smallPalindrome = null;

		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 3; j <= s.length(); j++) {
				String substr = s.substring(i, j);
				if (isPalindrome(substr)) {
					if (smallPalindrome == null || substr.length() < smallPalindrome.length())
						smallPalindrome = substr;
				}
			}
		}
		return smallPalindrome;
	}

	static boolean isPalindrome(String s) {
		int i = 0, j = s.length() - 1;
		while (i < j) {
			if (s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
