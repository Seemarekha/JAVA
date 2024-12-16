package com.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		int c = count(n);
		if (Armstrong(n, c) == n)
			System.out.println(n + " is a Armstrong Number");
		else
			System.out.println(n + " is Not a Armstrong Number");
	}

	private static int Armstrong(int n, int c) {
		if (n == 0)
			return 0;
		return (int) Math.pow(n % 10, c) + Armstrong(n / 10, c);
	}

	private static int count(int n) {

		if (n == 0)
			return 0;
		return 1 + count(n / 10);
	}

}
