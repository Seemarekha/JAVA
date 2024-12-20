package com.AutomorphicNumber;

import java.util.Scanner;

public class AutomorphicNumberInGivenRangeUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Automorphic numbers present in given range :");
		range(a, b);

	}

	private static void range(int a, int b) {
		if (a == b)
			return;
		if (isAutomorphic(a, a * a))
			System.out.print(a + " ");
		range(a + 1, b);

	}

	private static boolean isAutomorphic(int n, int sq) {
		if (n == 0)
			return true;
		if (n % 10 != sq % 10)
			return false;
		return isAutomorphic(n / 10, sq / 10);
	}

}
