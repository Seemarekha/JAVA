package com.NeonNumber;

import java.util.Scanner;

public class NeonNumberUsingRecursion {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		if (n == isNeon(n * n, 0))
			System.out.println(n + " is a Neon Number");
		else
			System.out.println(n + " is Not a Neon Number");

	}

	private static int isNeon(int sq, int sum) {
		if (sq == 0)
			return sum;
		sum += sq % 10;
		return isNeon(sq / 10, sum);
	}

}
