//write a java program to find missing alphabet in a string by using indexOf method?


package com.string_programs;

import java.util.Scanner;

public class MissingAlphabetInString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next().toLowerCase();
		String alpha="abcdefghijklmnopqrstuvwxyz";
		boolean flag=true;
		System.out.println("Missing alphabets are : ");
		for(int i=0;i<alpha.length();i++)
		{
			char c=alpha.charAt(i);
			
			if(s.indexOf(c)==-1)
			{
				System.out.print(c+" ");
				flag=false;
			}
		}
		if(flag)
			System.out.println("All alphabets are present");
		

	}

}
