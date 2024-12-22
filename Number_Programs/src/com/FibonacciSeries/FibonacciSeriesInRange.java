package com.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeriesInRange {

	public static void main(String[] args) {

		System.out.println("Enter range :");
		Scanner scn = new Scanner(System.in);

		int min = scn.nextInt();
		int max = scn.nextInt();

		int a = 0, b = 1;

		System.out.println("Fibonacci Series in the range:");

		while (a <= max) {
			if (a >= min)
				System.out.print(a + " ");
			int c = a + b;
			a = b;
			b = c;

		}

	}

}
