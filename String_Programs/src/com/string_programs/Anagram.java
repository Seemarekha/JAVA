package com.string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter two strings :");
		String s1=scn.next();
		String s2=scn.next();
		
		if(isAnagram(s1,s2))
			System.out.println("Its Anagram");
		else
			System.out.println("Its Not Anagram");
		
		/***************************/
		
		if(Anagram(s1,s2))
			System.out.println("Its Anagram");
		else
			System.out.println("Its Not Anagram");

	}
	
	/*************Approach-1***************/

	static boolean isAnagram(String s1, String s2) {
		while(true)
		{
			if(s1.length()!=s2.length())
				return false;
			else if(s1.length()==0 && s2.length()==0)
				return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
		}
	}
	 
	 /*************Approach-2***************/
	
	static boolean Anagram(String s1, String s2)
	{
		char[] str1=s1.toCharArray();
		char[] str2=s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
		return Arrays.equals(str1, str2);
	}
	 


}
