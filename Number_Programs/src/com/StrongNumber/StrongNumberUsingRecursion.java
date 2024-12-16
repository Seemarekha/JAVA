package com.StrongNumber;

import java.util.Scanner;

public class StrongNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		if (strong(n) == n)
			System.out.println(n + " is a Strong Number");
		else
			System.out.println(n + " is Not a Strong Number");

	}

	private static int strong(int n) {
		if (n == 0)
			return 0;

		return fact(n % 10) + strong(n / 10);
	}

	private static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

}
