package com.SpyNumber;

import java.util.Scanner;

public class SpyNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number :");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		int product = 1;

		while (n > 0) {
			int rem = n % 10;
			sum += rem;
			product *= rem;
			n /= 10;
		}
		if (sum == product)
			System.out.println("This a Spy Number");
		else
			System.out.println("This is Not a Spy Number");

	}

}
