package com.SpyNumber;

import java.util.Scanner;

public class SpyNumberInGivenRange {

	public static void main(String[] args) {

		System.out.println("Enter a range :");
		Scanner scn = new Scanner(System.in);

		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Spy Numbers present in given range :");
		
		for (int i = a; i <= b; i++) {
			int sum = 0;
			int product = 1;
			int temp = i;
			while (temp > 0) {
				int rem = temp % 10;
				sum += rem;
				product *= rem;
				temp /= 10;
			}
			if (sum == product)
				System.out.print(i + " ");
		}

	}

}
