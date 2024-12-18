package com.PrimeNumber;

import java.util.Scanner;

public class PrimeNumberUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		if (isPrime(n, n / 2))
			System.out.println(n + " is a Prime Number");
		else
			System.out.println(n + " is Not a Prime Number");
	}

	private static boolean isPrime(int n, int i) {
		if (n <= 1)
			return false;
		if (i == 1)
			return true;
		if (n % i == 0)
			return false;
		return isPrime(n, i - 1);
	}

}
