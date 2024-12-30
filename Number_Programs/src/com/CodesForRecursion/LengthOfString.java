package com.CodesForRecursion;

import java.util.Scanner;

public class LengthOfString {

	public static void main(String[] args) {

		System.out.println("Enter a string :");
		String str = new Scanner(System.in).next();
		System.out.println("Length of given string : " + len(str));

	}

	private static int len(String str) {
		if (str == "")
			return 0;
		return len(str.substring(1)) + 1;
	}

}
