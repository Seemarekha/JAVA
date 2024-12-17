package com.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberInGivenRangeUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Palindrome numbers present in given range : ");
		range(a, b);

	}

	private static void range(int a, int b) {
		if (a == b)
			return;
		if (a == reverse(a, 0))
			System.out.print(a + " ");
		range(a + 1, b);

	}

	private static int reverse(int n, int sum) {
		if (n == 0)
			return sum;
		return reverse(n / 10, sum * 10 + (n % 10));
	}

}
