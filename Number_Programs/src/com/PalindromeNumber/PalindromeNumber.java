package com.PalindromeNumber;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		int sum = 0;
		int m = n;
		while (n > 0) {
			int rem = n % 10;
			sum = sum * 10 + rem;
			n /= 10;
		}
		if (sum == m)
			System.out.println(m + " is a Palindrome Number");
		else
			System.out.println(m + " is Not a Palindrome Number");

	}

}
