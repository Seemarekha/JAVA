package com.string_programs;

import java.util.Scanner;

public class WordOfStringInReverse {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		String[] str = s.split(" ");
		String s2 = "";

		for (int i = 0; i < str.length; i++) {
			String word = str[i];
			String revWord = "";
			for (int j = word.length() - 1; j >= 0; j--) {
				revWord += word.charAt(j);
			}
			s2 += revWord;
			if (i < str.length - 1)
				s2 += " ";
		}

		System.out.println("Reverser string : " + s2);
	}

}

/*
 * 
 * i/p : java is very easy o/p : avaj si yrev ysae
 * 
 */