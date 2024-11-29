package com.string_programs;

import java.util.Scanner;

public class CountVowels {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		s=s.toLowerCase();
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				count++;
		}
		System.out.println("Count of vowels : "+count);

	}

}
