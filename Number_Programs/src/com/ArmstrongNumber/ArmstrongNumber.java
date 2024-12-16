package com.ArmstrongNumber;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		int count = 0;
		int m = n;
		while (n > 0) {
			n /= 10;
			count++;
		}
		n = m;
		int sum = 0;
		while (n > 0) {
			int rem = n % 10;
			int prod = 1;
			for (int i = 1; i <= count; i++)
				prod *= rem;
			sum += prod;
			n /= 10;
		}

		if (sum == m)
			System.out.println(m + " is a Armstrong Number");
		else
			System.out.println(m + " is not a Armstrong Number");

	}

}
