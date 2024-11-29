package com.string_programs;

import java.util.Scanner;

public class ReplaceCharInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		System.out.println("Enter character that u want to replace :");
		String c1=scn.next();
		System.out.println("Enter character value for replaced value :");
		String c2=scn.next();
		s=s.replace(c1, c2);
		System.out.println("After replacing : "+s);

	}

}
