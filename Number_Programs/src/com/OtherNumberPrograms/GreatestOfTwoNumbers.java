package com.OtherNumberPrograms;

import java.util.Scanner;

public class GreatestOfTwoNumbers {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter two numbers : ");

		int a = scn.nextInt();
		int b = scn.nextInt();

		if (a == b)
			System.out.println("Both are equal");
		else {
			String res = a > b ? a + " is Greater than " + b : b + " is Greater than " + a;
			System.out.println(res);
		}
	}

}
