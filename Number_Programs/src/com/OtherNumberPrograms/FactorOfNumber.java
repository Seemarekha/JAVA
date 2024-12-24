package com.OtherNumberPrograms;

import java.util.Scanner;

public class FactorOfNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		System.out.println("Factors of number : ");
		for (int i = 1; i <= n; i++) {
			if (n % i == 0)
				System.out.print(i + " ");
		}
	}

}
