package com.sorting_Algorithms;

import java.util.Arrays;

public class Bubble_Sort {

	public static void main(String[] args) {

		int[] a = { 5, 8, 1, 2, 4, 6, 8, 10, 5, 9 };
		System.out.println("Before sorting : " + Arrays.toString(a)); // [5, 8, 1, 2, 4, 6, 8, 10, 5, 9]

		sort(a);
		System.out.println("After sorting : " + Arrays.toString(a)); // [1, 2, 4, 5, 5, 6, 8, 8, 9, 10]

	}

	static void sort(int[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = 0; j < a.length - 1 - i; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
			}
		}

	}

}
