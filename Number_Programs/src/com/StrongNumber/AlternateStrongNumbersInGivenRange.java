package com.StrongNumber;

import java.util.Scanner;

public class AlternateStrongNumbersInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Strong numbers present in given range : ");
		range(a, b, 0);
	}

	private static void range(int a, int b, int c) {
		if (strong(a) == a) {
			c++;
			if (c % 2 != 0)
				System.out.print(a + " ");
		}

		if (a == b)
			return;
		range(a + 1, b, c);

	}

	private static int strong(int n) {
		if (n == 0)
			return 0;
		return fact(n % 10) + strong(n / 10);
	}

	private static int fact(int n) {
		if (n == 0 || n == 1)
			return 1;
		return n * fact(n - 1);
	}

}
