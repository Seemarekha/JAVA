// Can a number be expressed as a sum of two prime numbers using Java?

package com.OtherNumberPrograms;

import java.util.Scanner;

public class NumberAsSumOfTwoPrimeNumbers {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		if (n < 4) {
			System.out.println(n + " can't be expressed as the sum of two prime numbers.");
		} else {
			boolean found = false;

			for (int i = 2; i <= n / 2; i++) {
				if (isPrime(i) && isPrime(n - i)) {
					System.out.println(n + " = " + i + " + " + (n - i));
					found = true;
					break;
				}
			}

			if (!found) {
				System.out.println(n + " can't be expressed as the sum of two prime numbers.");
			}
		}

	}

	private static boolean isPrime(int n) {
		if (n <= 1)
			return false;

		for (int i = 2; i <= n / 2; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}

}
