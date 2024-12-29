package com.OtherNumberPrograms;

import java.util.Scanner;

public class RootsOfQuadraticEquation {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter value for a, b, c :");
		int a = scn.nextInt();
		int b = scn.nextInt();
		int c = scn.nextInt();

		findRoots(a, b, c);

	}

	static void findRoots(int a, int b, int c) {
		if (a == 0) {
			System.out.println("Invalid");
			return;
		}

		int d = b * b - 4 * a * c;
		double sqrt_val = Math.sqrt(d);

		if (d > 0) {
			System.out.println("Roots are real and different");
			System.out.println((double) (-b + sqrt_val) / (2 * a) + "\n" + (double) (-b - sqrt_val) / (2 * a));
		} else if (d == 0) {
			System.out.println("Roots are real and same ");
			System.out.println(-(double) b / (2 * a) + "\n" + -(double) b / (2 * a));
		} else // d < 0
		{
			System.out.println("Roots are complex");

			System.out.println(
					-(double) b / (2 * a) + " + i" + sqrt_val + "\n" + -(double) b / (2 * a) + " - i" + sqrt_val);
		}
	}

}
