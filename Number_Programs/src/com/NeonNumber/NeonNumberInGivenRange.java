package com.NeonNumber;

import java.util.Scanner;

public class NeonNumberInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range :");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Neon numbers present in given range :");
		range(a, b);

	}

	private static void range(int a, int b) {
		for (int i = a; i <= b; i++) {
			int sum = 0;
			int sq = i * i;

			while (sq > 0) {
				int rem = sq % 10;
				sum += rem;
				sq /= 10;
			}
			if (sum == i)
				System.out.print(i + " ");
		}

	}

}
