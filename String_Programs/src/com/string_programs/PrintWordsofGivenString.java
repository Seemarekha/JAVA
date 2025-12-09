package com.string_programs;

import java.util.Scanner;

public class PrintWordsofGivenString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		String[] str=s.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.println(str[i]);
		}

	}

}


/*

i/p : java is very easy
o/p : java
      is
      very
      easy

*/