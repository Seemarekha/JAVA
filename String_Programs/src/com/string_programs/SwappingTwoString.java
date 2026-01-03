// write a java program to swap two string variables without using third variable? 

package com.string_programs;

public class SwappingTwoString {

	public static void main(String[] args) {
		String s1 = "Hello";
		String s2 = "World";

		System.out.println("Before swapping ...");
		System.out.println(s1 + " " + s2); // Hello World

		System.out.println("After swapping ...");

		s1 = s1 + s2;
		s2 = s1.substring(0, s1.length() - s2.length());
		s1 = s1.substring(s2.length());

		System.out.println(s1 + " " + s2); // World Hello

	}

}
