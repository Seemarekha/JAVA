package com.string_programs;

import java.util.Scanner;

public class PrintVowelsInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U')
				sb.append(c);
		}
		System.out.println("Print only vowels : "+sb.toString());
	}

}
