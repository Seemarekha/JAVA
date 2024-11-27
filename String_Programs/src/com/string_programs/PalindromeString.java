package com.string_programs;

import java.util.Scanner;

public class PalindromeString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		if(isPalindrome(s))
			System.out.println("It is a Palindrome string");
		else
			System.out.println("It is Not a Palindrome string");

	}

	 static boolean isPalindrome(String s) {
		s=s.toLowerCase();
		int i=0, j=s.length()-1;
		
		while(i<j)
		{
			if(s.charAt(i) != s.charAt(j))
				return false;
			i++;
			j--;
		}
		return true;
	}

}
