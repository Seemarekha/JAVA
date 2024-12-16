package com.StrongNumber;

import java.util.Scanner;

public class StrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		int m = n;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			int prod = 1;
			for (int i = 1; i <= rem; i++)
				prod *= i;
			sum += prod;
			n /= 10;

		}
		if (sum == m)
			System.out.println(m + " is a Strong Number");
		else
			System.out.println(m + " is Not a Strong Number");

	}

}
