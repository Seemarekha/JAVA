package com.StrongNumber;

import java.util.Scanner;

public class StrongNumberInGivenRange {

	public static void main(String[] args) {
		System.out.println("Enter a range : ");

		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Strong numbers present in given range : ");

		for (int i = a; i <= b; i++) {

			int temp = i;
			int sum = 0;

			while (temp > 0) {
				int rem = temp % 10;
				int prod = 1;

				for (int j = 1; j <= rem; j++)
					prod *= j;

				sum += prod;
				temp /= 10;
			}

			if (sum == i)
				System.out.print(i + " ");
		}

	}

}
