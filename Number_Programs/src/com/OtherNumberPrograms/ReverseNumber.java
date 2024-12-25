package com.OtherNumberPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		int rev = 0;
		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		System.out.println("Reverse of a  number : " + rev);
	}

}
