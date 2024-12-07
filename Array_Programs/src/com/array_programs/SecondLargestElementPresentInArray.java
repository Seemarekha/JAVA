package com.array_programs;

public class SecondLargestElementPresentInArray {

	public static void main(String[] args) {
		int[] arr = { 7, 9, 4, 7, 2, 6, 2, 3, 8 };

		int max = arr[0];
		int secMax = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == max)
				continue;

			if (arr[i] > max) {
				secMax = max;
				max = arr[i];
			} else if (arr[i] > secMax || max == secMax) {
				secMax = arr[i];
			}
		}
		System.out.println("Second smallest element present in given array : " + secMax);

	}

}
