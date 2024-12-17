package com.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		if (n == reverse(n, 0))
			System.out.println(n + " is a Palindrome Number");
		else
			System.out.println(n + " is Not a Palindrome Number");

	}

	private static int reverse(int n, int sum) {
		if (n == 0)
			return sum;
		return reverse(n / 10, sum * 10 + (n % 10));
	}

}
