package com.SpyNumber;

import java.util.Scanner;

public class AlternateSpyNumberInRange {

	public static void main(String[] args) {

		System.out.println("Enter a range :");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Alternate Spy Numbers present in given range :");
		range(a, b, 0);
	}

	private static void range(int a, int b, int count) {
		if (a == b)
			return;
		if (isSpyNumber(a, 0, 1)) {
			count++;
			if (count % 2 != 0)
				System.out.print(a + " ");
		}
		range(a + 1, b, count);
	}

	private static boolean isSpyNumber(int n, int sum, int product) {
		if (n == 0) {
			if (sum == product)
				return true;
			return false;
		}
		sum += n % 10;
		product *= n % 10;
		return isSpyNumber(n /= 10, sum, product);

	}

}
