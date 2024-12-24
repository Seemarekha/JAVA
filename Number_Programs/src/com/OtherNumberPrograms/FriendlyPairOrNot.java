package com.OtherNumberPrograms;

import java.util.Scanner;

public class FriendlyPairOrNot {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first number:");
		int n1 = scn.nextInt();

		System.out.println("Enter second number:");
		int n2 = scn.nextInt();

		// Get divisor sum of two numbers

		int sum1 = getDivisorSum(n1);
		int sum2 = getDivisorSum(n2);

		if (sum1 / n1 == sum2 / n2)
			System.out.println(n1 + " & " + n2 + " are friendly pairs");
		else
			System.out.println(n1 + " & " + n2 + " are Not friendly pairs");

	}

	private static int getDivisorSum(int n) {
		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		return sum;
	}

}
