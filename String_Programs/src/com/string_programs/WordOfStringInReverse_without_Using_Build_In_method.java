package com.string_programs;

import java.util.Scanner;

public class WordOfStringInReverse_without_Using_Build_In_method {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s = new Scanner(System.in).nextLine();
		String s2 = "";
		int i = 0, j = 0;
		while (i < s.length()) {
			while (j < s.length() && s.charAt(j) != ' ') {
				j++;
			}
			int k = j - 1;
			String temp = "";
			while (k >= i) {
				temp += s.charAt(k);
				k--;
			}
			s2 += temp;
			if (j < s.length())
				s2 += " ";
			j++;
			i = j;
		}

		System.out.println(s2);
	}

}

/****************** Output ****************/

/*
 *
 * 
 * Enter a string : java is oop lang
 * 
 * Output : avaj si poo gnal
 *
 * 
 */
