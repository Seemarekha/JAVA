package com.string_programs;

import java.util.Scanner;

public class PalindromeWordsInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		String[] str = s.split(" ");
		for (int i = 0; i < str.length; i++) {
			if (isPalindrome(str[i]))
				System.out.println(str[i]);
		}

	}

	static boolean isPalindrome(String s) {
		s = s.toLowerCase();
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









/*

i/p : eye level car boy
o/p : eye,level


*/