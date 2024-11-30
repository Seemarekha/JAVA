package com.string_programs;

import java.util.Scanner;

public class InitCharCapitalString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string : ");
		String ip=scn.nextLine();
		String[] str=ip.split(" ");
		String op="";
		for(int i=0;i<str.length;i++)
		{
			op+=convert(str[i]);
			if(i<str.length-1)
				op+=" ";
		}
		
		System.out.println(op);

	}

	static String convert(String s) {
		
		
		return s.substring(0,1).toUpperCase()+s.substring(1).toLowerCase();
	}

}







/*
  
input : java is very easy
output : Java Is Very Easy

*/


