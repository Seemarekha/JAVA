package com.PerfectNumber;

import java.util.Scanner;

public class AlternatePerfectNumbersInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();
		int count = 0;

		System.out.println("Alternate Perfect numbers present in given range : ");
		range(a, b, 0);

	}

	private static void range(int a, int b, int c) {
		if (isPerfect(a, a / 2, 0)) {
			c++;
			if (c % 2 != 0)
				System.out.print(a + " ");
		}

		if (a == b)
			return;
		range(a + 1, b, c);

	}

	private static boolean isPerfect(int n, int i, int sum) {
		if (i == 0)
			return sum == n;
		if (n % i == 0)
			sum += i;
		return isPerfect(n, i - 1, sum);
	}

}
