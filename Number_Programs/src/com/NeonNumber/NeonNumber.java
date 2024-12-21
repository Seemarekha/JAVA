package com.NeonNumber;

import java.util.Scanner;

public class NeonNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		int sq = n * n;

		while (sq > 0) {
			int rem = sq % 10;
			sum += rem;
			sq /= 10;
		}
		if (sum == n)
			System.out.println(n + " is a Neon Number");
		else
			System.out.println(n + " is Not a Neon Number");

	}

}
