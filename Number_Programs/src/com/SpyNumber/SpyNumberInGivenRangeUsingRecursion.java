package com.SpyNumber;

import java.util.Scanner;

public class SpyNumberInGivenRangeUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a range :");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Spy Numbers present in given range :");
		range(a, b);
	}

	private static void range(int a, int b) {
		if (a == b)
			return;
		if (isSpyNumber(a, 0, 1))
			System.out.print(a + " ");
		range(a + 1, b);
	}

	private static boolean isSpyNumber(int n, int sum, int product) {
		if (n == 0) {
			return sum == product;
		}
		sum += n % 10;
		product *= n % 10;
		return isSpyNumber(n / 10, sum, product);

	}

}
