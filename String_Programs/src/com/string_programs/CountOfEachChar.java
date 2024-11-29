package com.string_programs;

import java.util.Scanner;

public class CountOfEachChar {
	
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		String s2="";
		
		while(s.length()>0)
		{
			char c=s.charAt(0);
			s2=s.replace(c+"", "");
			int n=s.length()-s2.length();
			System.out.println(c+" = "+n);
			s=s2;
		}
	}

}






/*
 input: “AssmnAN” 
 output: A=2, s=2, m=1, n=1, N=1 
*/		 