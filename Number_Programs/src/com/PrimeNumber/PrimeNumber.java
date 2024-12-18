package com.PrimeNumber;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();

		if (n <= 1)
			System.out.println(n + " is Not a Prime Number");
		else {
			boolean flag = true;
			for (int i = 2; i <= n / 2; i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}

			}

			if (flag)
				System.out.println(n + " is a Prime Number");
			else
				System.out.println(n + " is Not a Prime Number");
		}

	}

}
