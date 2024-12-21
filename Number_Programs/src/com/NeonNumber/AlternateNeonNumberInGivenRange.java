package com.NeonNumber;

import java.util.Scanner;

public class AlternateNeonNumberInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range :");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Alternate Neon numbers present in given range :");
		range(a, b, 0);

	}

	private static void range(int a, int b, int c) {
		if (a == b)
			return;
		if (a == isNeon(a * a, 0)) {
			c++;
			if (c % 2 != 0)
				System.out.print(a + " ");
		}

		range(a + 1, b, c);

	}

	private static int isNeon(int sq, int sum) {
		if (sq == 0)
			return sum;
		sum += sq % 10;
		return isNeon(sq / 10, sum);

	}

}
