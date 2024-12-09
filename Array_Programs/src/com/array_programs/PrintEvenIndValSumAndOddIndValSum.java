package com.array_programs;

public class PrintEvenIndValSumAndOddIndValSum {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 22, 33, 40, 55, 60, 75, 80 };

		int sum1 = 0, sum2 = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0)
				sum1 += arr[i];
			else
				sum2 += arr[i];
		}
		System.out.println("Sum of even index values : " + sum1);
		System.out.println("Sum of odd index values : " + sum2);

	}

}
