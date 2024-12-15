package com.PerfectNumber;

import java.util.Scanner;

public class PerfectNumberUsingRecursion {

	public static void main(String[] args) {
		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		if (isPerfect(n, n / 2, 0))
			System.out.println(n + " is a Perfect Number");
		else
			System.out.println(n + " is Not a Perfect Number");

	}

	private static boolean isPerfect(int n, int i, int sum) {
		if (i == 0)
			return sum == n;
		if (n % i == 0)
			sum += i;
		return isPerfect(n, i - 1, sum);
	}

}
