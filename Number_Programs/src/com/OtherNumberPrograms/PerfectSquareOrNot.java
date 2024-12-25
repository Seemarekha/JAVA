package com.OtherNumberPrograms;

import java.util.Scanner;

public class PerfectSquareOrNot {

	public static void main(String[] args) {

		System.out.println("Enter a number:");
		int n = new Scanner(System.in).nextInt();

		if (isPerfectSquare(n))
			System.out.println(n + " is a Perfect Square");
		else
			System.out.println(n + " is Not a Perfect Square");

	}

	private static boolean isPerfectSquare(int n) {
		if (n >= 0) {
			int sqroot = (int) Math.sqrt(n);
			return (sqroot * sqroot) == n;
		}

		return false;
	}

}
