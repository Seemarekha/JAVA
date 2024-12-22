package com.FibonacciSeries;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		System.out.print("Enter the number of terms for Fibonacci series: ");

		int n = new Scanner(System.in).nextInt();
		int a = 0, b = 1;

		System.out.println("Fibonacci series :");
		for (int i = 0; i < n; i++) {

			System.out.print(a + " ");

			int c = a + b;
			a = b;
			b = c;

		}

	}

}
