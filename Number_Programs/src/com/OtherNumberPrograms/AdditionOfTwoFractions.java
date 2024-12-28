package com.OtherNumberPrograms;

import java.util.Scanner;

public class AdditionOfTwoFractions {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter first fraction's numerator and denominator :");
		int n1 = scn.nextInt();
		int d1 = scn.nextInt();

		System.out.println("Enter second fraction's numerator and denominator :");
		int n2 = scn.nextInt();
		int d2 = scn.nextInt();

		int den = lcm(d1, d2);
		int num = ((den / d1) * n1) + ((den / d2) * n2);

		// simplified fraction

		int n = 1;
		int x = num;
		int y = den;
		if (num != den) {
			while (n != 0) {
				n = num % den;
				if (n != 0) {
					num = den;
					den = n;
				}
			}
		}
		System.out.print("(" + n1 + " / " + d1 + ") + (" + n2 + " / " + d2 + ") = " + x / den + " / " + y / den);

	}

	private static int lcm(int d1, int d2) {
		int lcm = 0;

		int max = (d1 > d2) ? d1 : d2;

		for (int i = max; i <= d1 * d2; i++) {
			if (i % d1 == 0 && i % d2 == 0) {
				lcm = i;
				break;
			}
		}
		return lcm;
	}

}
