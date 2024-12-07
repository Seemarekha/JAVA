package com.array_programs;

public class LargestElementPresentInArray {

	public static void main(String[] args) {
		int[] arr = { 7, 9, 4, 7, 2, 6, 2, 3 };

		int max = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] > max)
				max = arr[i];
		}
		System.out.println("Smallest element in a given array : " + max);

	}

}
