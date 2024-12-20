package com.AutomorphicNumber;

import java.util.Scanner;

public class AutomorphicNumberInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Automorphic numbers present in given range :");
		range(a, b);

	}

	private static void range(int a, int b) {
		for (int i = a; i <= b; i++) {
			if (isAutomorphic(i, i * i))
				System.out.print(i + " ");
		}

	}

	private static boolean isAutomorphic(int n, int sq) {
		while (n > 0) {
			if (n % 10 != sq % 10)
				return false;
			n /= 10;
			sq /= 10;
		}
		return true;
	}

}
