package com.array_programs;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 22, 33, 40, 55, 60, 75, 80 };

		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}

		System.out.println("Sum of array elements present in array: " + sum);

	}

}
