package com.OtherNumberPrograms;

import java.util.Scanner;

public class AbundantNumberOrNot {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		for (int i = 1; i < n; i++) {
			if (n % i == 0)
				sum += i;
		}
		if (sum > n) {
			System.out.println(n + " is an Abundant Number");
			System.out.println("Abundance is : " + (sum - n));
		} else
			System.out.println(n + " is Not an Abundant Number");

	}

}
