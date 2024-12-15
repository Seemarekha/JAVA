package com.PerfectNumber;

import java.util.Scanner;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		for (int i = 1; i <= n / 2; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum == n)
			System.out.println(n + " is a Perfect Number");
		else
			System.out.println(n + " is not a Perfect Number");

	}

}
