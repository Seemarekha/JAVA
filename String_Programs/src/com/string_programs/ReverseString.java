package com.string_programs;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s=scn.next();
		StringBuilder sb=new StringBuilder();
		
		for(int i=s.length()-1;i>=0;i--)
		{
			sb.append(s.charAt(i));
		}
		String s2=sb.toString();
		System.out.println("Reversed string : "+s2);

	}

}
