package com.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeriesInRecursion {

	public static void main(String[] args) {

		System.out.print("Enter the number of terms for Fibonacci series: ");

		int n = new Scanner(System.in).nextInt();
		System.out.println("Fibonacci series :");

		for (int i = 0; i < n; i++) {
			System.out.print(fib(i) + " ");
		}

	}

	private static int fib(int n) {
		if (n <= 1)
			return n;
		return fib(n - 1) + fib(n - 2);
	}

}
