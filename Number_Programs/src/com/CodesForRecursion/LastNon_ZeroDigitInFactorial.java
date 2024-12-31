package com.CodesForRecursion;

import java.util.Scanner;

public class LastNon_ZeroDigitInFactorial {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		int n = new Scanner(System.in).nextInt();
		int fact = factorial(n);

		while (fact % 10 == 0)
			fact /= 10;
		System.out.println("Last non-zero digit of "+n+"! = "+fact % 10);

	}

	private static int factorial(int n) {
		if (n == 0)
			return 1;
		return n * factorial(n - 1);
	}

}
