package com.CodesForRecursion;

import java.util.Scanner;

public class Power {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter value for base :");
		int b = scn.nextInt();
		System.out.println("Enter value for power :");
		int p = scn.nextInt();

		int res = power(b, p);
		System.out.println(b + " to the power " + p + " = " + res);

	}

	private static int power(int b, int p) {
		if (p == 0)
			return 1;
		return b * power(b, p - 1);
	}

}
