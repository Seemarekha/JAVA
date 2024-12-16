package com.ArmstrongNumber;

import java.util.Scanner;

public class AlternateArmstrongNumbersInGivenRange {

	public static void main(String[] args) {
		System.out.println("Enter a range : ");

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Armstrong numbers present in given range : ");
		range(a, b, 0);
	}

	private static void range(int a, int b, int count) {
		int c = countDigits(a);
		if (Armstrong(a, c) == a) {
			count++;
			if (count % 2 != 0)
				System.out.print(a + " ");
		}

		if (a == b)
			return;
		range(a + 1, b, count);

	}

	private static int Armstrong(int n, int c) {
		if (n == 0)
			return 0;
		return (int) Math.pow(n % 10, c) + Armstrong(n / 10, c);
	}

	private static int countDigits(int n) {
		if (n == 0)
			return 0;
		return 1 + countDigits(n / 10);

	}

}
