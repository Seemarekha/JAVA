// write a java program to find palindrome substring in a program? 

package com.string_programs;

import java.util.Scanner;

public class PalindromeSubstring {

	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String s = new Scanner(System.in).next();

		System.out.println("Palindrome substrings : ");
		for (int i = 0; i < s.length() - 1; i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (palindrome(s, i, j)) {
					System.out.println(s.substring(i, j + 1));
				}
			}
		}

	}

	static boolean palindrome(String s, int i, int j) {
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
i/p :
 
Enter a string : malayalam

o/p :

Palindrome substrings : 

malayalam
ala
alayala
layal
aya
ala

 */