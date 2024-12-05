// write a java program , when count of vowels becomes greater than 3 , then replace all vowels with space else keep it as it was earlier? 
// Input:abeijho if count of vowels> 3 output:  b  jh 



package com.string_programs;

import java.util.Scanner;

public class ReplaceVowelsToSpaces {

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine().toLowerCase();
		
		int countVowels=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u')
				countVowels++;
		}
		
		if(countVowels>3)
			s=s.replaceAll("[aeiou]", " ");
		System.out.println("After replacing : "+s);
	}

}
