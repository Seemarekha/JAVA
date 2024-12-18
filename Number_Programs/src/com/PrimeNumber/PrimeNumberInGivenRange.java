package com.PrimeNumber;

import java.util.Scanner;

public class PrimeNumberInGivenRange {

	public static void main(String[] args) {
		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Prime numbers present in given range : ");

		for (int i = a; i <= b; i++) {
			if (isPrime(i))
				System.out.print(i + " ");
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
