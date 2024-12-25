package com.OtherNumberPrograms;

import java.util.Scanner;

public class SumOfDigitOfANumber {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			sum += r;
			n /= 10;
		}
		System.out.println("Sum of digits of a given number : " + sum);
	}

}
