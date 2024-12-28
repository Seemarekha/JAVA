// Permutations in which n people can occupy r seats in a classroom

package com.OtherNumberPrograms;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.println("Enter value number of people :");
		int n = scn.nextInt();

		System.out.println("Enter value number of seats :");
		int r = scn.nextInt();

		if (n < 0 || r < 0) {
			System.out.println("n and r must be non-negative integers.");

		} else if (n < r) {
			System.out.println("n must be greater than or equal to r.");

		} else {

			long per = fact(n) / fact(n - r);
			System.out.println("Total possible arrangements: " + per);
		}

	}

	private static long fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

}
