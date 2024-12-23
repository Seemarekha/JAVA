package com.OtherNumberPrograms;

import java.util.Scanner;

public class Sum_of_First_N_Natural_Numbers {

	public static void main(String[] args) {

		System.out.println("Enter the value of N:");
		int N = new Scanner(System.in).nextInt();

		/************* Approach-1 *******************/

		int sum = 0;
		for (int i = 0; i <= N; i++)
			sum += i;

		System.out.println("Sum of first N natural numbers : " + sum);

		/************* Approach-2 *******************/

		int sum1 = (N * (N + 1)) / 2;
		System.out.println("Sum of first N natural numbers : " + sum1);

	}

}
