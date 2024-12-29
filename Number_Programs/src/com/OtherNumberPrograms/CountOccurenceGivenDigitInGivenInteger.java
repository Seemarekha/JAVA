package com.OtherNumberPrograms;

import java.util.Scanner;

public class CountOccurenceGivenDigitInGivenInteger {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the integer: ");
		int n = scn.nextInt();

		System.out.print("Enter the digit to count: ");
		char b = scn.next().charAt(0);

		int c = 0;

		String s = Integer.toString(n);

		for (int i = 0; i < s.length(); i++) {

			if (s.charAt(i) == b)
				c = c + 1;
		}
		System.out.println("The digit " + b + " appears " + c + " times in " + n);
	}

}
