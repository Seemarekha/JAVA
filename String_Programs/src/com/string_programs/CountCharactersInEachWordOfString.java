// Write a java program to count number of characters available in each word of a given String?  



package com.string_programs;

import java.util.Scanner;

public class CountCharactersInEachWordOfString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).nextLine();
		
		String[] str=s.split(" ");
		
		for(String word:str)
			System.out.println(word+" contains : "+word.length()+" characters");

	}

}
