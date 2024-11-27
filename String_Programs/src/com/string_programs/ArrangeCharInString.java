package com.string_programs;

import java.util.Scanner;

public class ArrangeCharInString {

	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		Scanner scn=new Scanner(System.in);
		String s=scn.next();
		String alph="";
		String num="";
		String spchar="";
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='a' && c<='z') || (c>='A' && c<='Z'))
				alph+=c;
			else if(c>='0' && c<='9')
				num+=c;
			else
				spchar+=c;
		}
		System.out.println("Arranged character of string : "+num+spchar+alph);

	}

}


/*
i/p : ram#123
o/p : 123#ram
*/