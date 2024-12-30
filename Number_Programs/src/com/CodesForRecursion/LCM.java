package com.CodesForRecursion;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers :");
		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		System.out.println("LCM of " + n1 + " and " + n2 + " is " + lcm(n1, n2));

	}

	private static int lcm(int n1, int n2) {

		return (n1 / gcd(n1, n2)) * n2;
	}

	private static int gcd(int n1, int n2) {
		if (n1 == 0)
			return n2;
		return gcd(n2 % n1, n1);
	}

}
