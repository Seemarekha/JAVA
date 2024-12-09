package com.array_programs;

public class OddElementSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int sum = 0;
		for (int num : arr) {
			if (num % 2 != 0) {
				sum += num;
			}
		}
		System.out.println("Sum of Odd elements in the array:" + sum);

	}

}
