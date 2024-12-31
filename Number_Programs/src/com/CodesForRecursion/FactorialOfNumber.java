package com.CodesForRecursion;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		System.out.println("Enter a number :");
		int n = new Scanner(System.in).nextInt();
		System.out.println(n + "! = " + fact(n));

	}

	private static int fact(int n) {
		if (n == 0)
			return 1;
		return n * fact(n - 1);
	}

}
