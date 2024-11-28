package com.string_programs;

import java.util.Scanner;

public class FindIndexValue {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		System.out.print("Enter character u want to find : ");
		char c=scn.next().charAt(0);
		boolean found=false;
		for(int i=0;i<s.length();i++)
			
		{
			char ch=s.charAt(i);
			if(ch==c)
			{
				System.out.println(c+" found at index : "+i);
				found=true;
			}
			
		}
		 if (!found) {
	            System.out.println(c + " not found in the string.");
	        }

	}

}
