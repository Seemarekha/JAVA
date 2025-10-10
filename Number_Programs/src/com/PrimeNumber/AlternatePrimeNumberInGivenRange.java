package com.PrimeNumber;

import java.util.Scanner;

public class AlternatePrimeNumberInGivenRange {

	public static void main(String[] args) {
		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Prime numbers present in given range : ");
		range(a, b, 0);

	}

	private static void range(int a, int b, int c) {
		if (a == b)
			return;
		if (isPrime(a, a / 2)) {
			c++;
			if (c % 2 != 0)
				System.out.print(a + " ");
		}
		range(a + 1, b, c);

	}

	private static boolean isPrime(int n, int i) {
		if (n <= 1)
			return false;
		if (i == 1)
			return true;
		if (n % i == 0)
			return false;
		return isPrime(n, i - 1);
	}

}
