package com.AutomorphicNumber;

import java.util.Scanner;

public class AutomorphicNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number : ");
		int n = new Scanner(System.in).nextInt();
		int sq = n * n;
		boolean flag = true;
		while (n > 0) {
			if (n % 10 != sq % 10) {
				flag = false;
				break;
			}
			n /= 10;
			sq /= 10;

		}

		if (flag)
			System.out.println("This is an Automorphic Number");
		else
			System.out.println("This is Not an Automorphic Number");

	}

}
