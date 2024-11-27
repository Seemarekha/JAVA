package com.string_programs;

import java.util.Scanner;

public class CountWordsInString {

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		Scanner scn=new Scanner(System.in);
		String s=scn.nextLine();
		String[] str=s.split(" ");
		int count=str.length;
		System.out.println("Count of words in given string : "+count);

	}

}
