package com.string_programs;

import java.util.Scanner;

public class StringToInteger {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next();
		
		/***********Approach-1*********/
		
		int num=0;
		for(int i=0;i<s.length();i++)
		{
			int n=s.charAt(i)-'0';
			num=num*10+n;
		}
		System.out.println("String to Integer conversion : "+num);

		/***********Approach-2*********/
		
		int num1=Integer.parseInt(s);
		System.out.println("String to Integer conversion : "+num1);
	}

}
