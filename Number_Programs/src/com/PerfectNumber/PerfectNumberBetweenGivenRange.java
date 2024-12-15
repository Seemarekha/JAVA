package com.PerfectNumber;

import java.util.Scanner;

public class PerfectNumberBetweenGivenRange {

	public static void main(String[] args) {
		System.out.println("Enter a range : ");
		Scanner scn = new Scanner(System.in);
		int a = scn.nextInt();
		int b = scn.nextInt();

		System.out.println("Perfect numbers present in given range : ");
		for (int i = a; i <= b; i++) {
			int sum = 0;
			for (int j = 1; j <= i / 2; j++) {
				if (i % j == 0)
					sum += j;
			}
			if (sum == i)
				System.out.print(i + " ");
		}

	}

}
