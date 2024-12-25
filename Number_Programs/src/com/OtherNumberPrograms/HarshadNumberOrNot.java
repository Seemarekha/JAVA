package com.OtherNumberPrograms;

import java.util.Scanner;

public class HarshadNumberOrNot {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();
		int temp = n;

		int sumOfDigits = 0;

		while (temp > 0) {
			int r = temp % 10;
			sumOfDigits += r;
			temp /= 10;
		}

		if (n % sumOfDigits == 0)
			System.out.println(n + " is a Harshad Number");
		else
			System.out.println(n + " is Not a Harshad Number");

	}

}
