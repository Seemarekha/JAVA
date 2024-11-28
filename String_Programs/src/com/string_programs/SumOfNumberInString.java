package com.string_programs;

import java.util.Scanner;

public class SumOfNumberInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s=scn.next();
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
				sum+=c-'0';
			
		}
		System.out.println("Sum : "+sum);

	}

}






/*
i/p : hd45ku8@e32
o/p : 4+5+8+3+2 = 22
*/
