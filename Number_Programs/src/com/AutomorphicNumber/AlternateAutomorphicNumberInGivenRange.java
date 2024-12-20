package com.AutomorphicNumber;

import java.util.Scanner;

public class AlternateAutomorphicNumberInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Alternate Automorphic numbers present in given range :");
		range(a, b, 0);

	}

	private static void range(int a, int b, int c) {
		if (a == b)
			return;
		if (isAutomorphic(a, a * a)) {
			c++;
			if (c % 2 != 0)
				System.out.print(a + " ");
		}

		range(a + 1, b, c);

	}

	private static boolean isAutomorphic(int n, int sq) {
		if (n == 0)
			return true;
		if (n % 10 != sq % 10)
			return false;
		return isAutomorphic(n / 10, sq / 10);
	}

}
