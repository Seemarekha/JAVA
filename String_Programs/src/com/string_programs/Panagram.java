package com.string_programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Panagram {

	public static void main(String[] args) {
		System.out.println("Enter a string: ");
		String s=new Scanner(System.in).nextLine();
		
		System.out.println("String is Panagram : "+isPanagram(s));
	}

	static boolean isPanagram(String s) {
		s=s.toLowerCase();
		Set<Character> set=new HashSet<>();
		for(char c: s.toCharArray())
		{
			if(Character.isLetter(c))
				set.add(c);
		}
		return set.size()==26;
	}
}












/*
 
i/p : The quick brown fox jumps over the lazy dog
o/p : true

i/p : Java is Object oriented programming language
o/p : false

*/