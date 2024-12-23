package com.OtherNumberPrograms;

import java.util.Scanner;

public class SumOfNumbersInGivenRange {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a range : ");

		int a = scn.nextInt();
		int b = scn.nextInt();

		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println("Sum of numbers present in given range : " + sum);

	}

}
