package com.NeonNumber;

import java.util.Scanner;

public class NeonNumberInGivenRangeUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a range :");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Neon numbers present in given range :");
		range(a, b);

	}

	private static void range(int a, int b) {
		if (a == b)
			return;
		if (a == isNeon(a * a, 0))
			System.out.print(a + " ");
		range(a + 1, b);

	}

	private static int isNeon(int sq, int sum) {
		if (sq == 0)
			return sum;
		sum += sq % 10;
		return isNeon(sq / 10, sum);
	}

}
