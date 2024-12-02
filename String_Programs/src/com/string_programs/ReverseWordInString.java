package com.string_programs;

import java.util.Scanner;

public class ReverseWordInString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.nextLine();
		String s2=" ";
		String[] str=s.split(" ");
		for(int i=str.length-1;i>=0;i--)
		{
			s2+=" "+str[i];
		}
		System.out.println(s2.trim());
	}

}


/*

i/p : java is easy
o/p : easy is java

*/