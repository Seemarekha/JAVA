package com.PalindromeNumber;

import java.util.Scanner;

public class AlternatePalindromeNumberInGivenRange {

	public static void main(String[] args) {
		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Alternate Palindrome numbers present in given range : ");
		range(a, b, 0);

	}

	private static void range(int a, int b, int count) {
		if (a == b)
			return;
		if (a == reverse(a, 0)) {
			count++;
			if (count % 2 != 0)
				System.out.print(a + " ");
		}

		range(a + 1, b, count);

	}

	private static int reverse(int n, int sum) {
		if (n == 0)
			return sum;
		return reverse(n / 10, sum * 10 + (n % 10));

	}

}
