package com.string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MinOccurCharInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a string : ");
		String s=scn.next();
		
		minimumOccurance(s);

	}

	 static void minimumOccurance(String s) {
		if(s.isEmpty() || s==null)
		{
			System.out.println("Given string is null or empty");
			return;
		}
		
		Map<Character, Integer> m=new HashMap<Character, Integer>();
		
		for(char c:s.toCharArray())
		{
			m.put(c, m.getOrDefault(c, 0)+1);
		}
		
		char minChar=' ';
		int minOcc=Integer.MAX_VALUE;
		
		for(Map.Entry<Character, Integer> entry:m.entrySet())
		{
			if(entry.getValue()<minOcc)
			{
				minChar=entry.getKey();
				minOcc=entry.getValue();
			}
		}
		System.out.println("Minimum occurred character : "+minChar+" and its count : "+minOcc);
	}

}
