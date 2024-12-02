package com.string_programs;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MissingCharacter {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next();
		
		Set<Character> set=new HashSet<>();
		
		for(char c:s.toCharArray())
		{
			if(Character.isLetter(c))
				set.add(c);
		}
		StringBuilder sb=new StringBuilder();
		
		for(char i='a';i<='z';i++)
		{
			if(!set.contains(i))
				sb.append(i).append(" ");
		}
		System.out.println("Missing characters : "+sb.toString().trim());

	}

}
