package com.OtherNumberPrograms;

import java.util.Scanner;

public class EvenOrOddNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();

		if (n % 2 == 0)
			System.out.println("Even Number");
		else
			System.out.println("Odd number");

	}

}
