package com.OtherNumberPrograms;

import java.util.Scanner;

public class PowerOfNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a number:");
		int n = scn.nextInt();

		System.out.println("Enter power:");
		int p = scn.nextInt();

		int pow = 1;
		for (int i = 1; i <= p; i++)
			pow *= n;

		System.out.println(n + " to the power " + p + " = " + pow);

	}

}
