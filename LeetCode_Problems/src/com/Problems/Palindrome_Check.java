package com.Problems;

public class Palindrome_Check {

	public static void main(String[] args) {
		String str = "A man a plan a canal Panama";
		System.out.println(isPalindrome(str));

	}

	private static boolean isPalindrome(String str) {
		str = str.replaceAll("[a-zA-Z0-9]", "");
		int i = 0, j = str.length() - 1;
		while (i < j) {
			if (str.charAt(i) != str.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
