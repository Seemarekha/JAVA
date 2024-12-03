//  write a java program to print missing vowels in a string? 



package com.string_programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingVowels {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).nextLine();
		
		printMissingVowels(s);			

	}

	static void printMissingVowels(String s) {
		
		s=s.toLowerCase();
		Set<Character> v=new HashSet<Character>();
		
		v.add('a');
		v.add('e');
		v.add('i');
		v.add('o');
		v.add('u');
		
		for(char c: s.toCharArray())
		{
			v.remove(c);
		}
		
		if(v.isEmpty())
		{
			System.out.println("No vowels are missing!");
		}
		else
		{
			System.out.print("Missing vowels : ");
			for(char misVowels:v)
			{
				System.out.print(misVowels+" ");
			}
		}
		
	}

}
