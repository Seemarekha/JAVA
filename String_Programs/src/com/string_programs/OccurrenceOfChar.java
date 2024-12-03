// write a java program to find occurrence of a character in string using replace method?  



package com.string_programs;

import java.util.Scanner;

public class OccurrenceOfChar {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next();
		s=s.toLowerCase();
		String s2="";
		while(s.length()>0)
		{
			char c=s.charAt(0);
			s2=s.replace(c+"", "");
			int n=s.length()-s2.length();
			System.out.println(c+" occurs : "+n+" times");
			s=s2;
		}

	}

}

/*
 
  i/p : Sutuns
  o/p : s occurs : 2 times
        u occurs : 2 times
        t occurs : 1 times
        n occurs : 1 times
        
 */
