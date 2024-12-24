package com.OtherNumberPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		int fact = 1;

		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		System.out.println("Factorial of a number : " + fact);

	}

}
