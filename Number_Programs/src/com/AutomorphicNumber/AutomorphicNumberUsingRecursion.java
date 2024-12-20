package com.AutomorphicNumber;

import java.util.Scanner;

public class AutomorphicNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		int n = new Scanner(System.in).nextInt();

		if (isAutomorphic(n, n * n))
			System.out.println(n + " is an Automorphic Number");
		else
			System.out.println(n + " is not an Automorphic Number");

	}

	private static boolean isAutomorphic(int n, int sq) {
		if (n == 0)
			return true;
		if (n % 10 != sq % 10)
			return false;
		return isAutomorphic(n / 10, sq / 10);
	}

}
