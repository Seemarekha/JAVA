package com.array_programs;

public class PrintOddElementPresentInArray {

	public static void main(String[] args) {
		int[] arr = { 10, 15, 22, 33, 40, 55, 60, 75, 80 };

		System.out.println("Array values:");
		for (int num : arr) {
			System.out.print(num + " ");
		}

		System.out.println("\nOdd elements in the array:");
		for (int num : arr) {
			if (num % 2 != 0) {
				System.out.print(num + " ");
			}
		}

	}

}
