package com.sorting_Algorithms;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int[] arr = { 5, 8, 1, 2, 4, 6, 8, 10, 5, 9 };
		System.out.println("Before sorting : " + Arrays.toString(arr));

		sort(arr);
		System.out.println("After sorting : " + Arrays.toString(arr));

	}

	static void sort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minIndex])
					minIndex = j;
			}
			if (i != minIndex) {
				int temp = arr[minIndex];
				arr[minIndex] = arr[i];
				arr[i] = temp;
			}
		}

	}

}
