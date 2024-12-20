package com.SpyNumber;

import java.util.Scanner;

public class SpyNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		int n = new Scanner(System.in).nextInt();

		if (isSpyNumber(n, 0, 1))
			System.out.println(n + " is a Spy Number");
		else
			System.out.println(n + " is Not a Spy Number");

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
