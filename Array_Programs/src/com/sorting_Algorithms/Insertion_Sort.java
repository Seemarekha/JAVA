package com.sorting_Algorithms;

import java.util.Arrays;

public class Insertion_Sort {

	public static void main(String[] args) {

		int[] a = { 5, 8, 1, 2, 4, 6, 8, 10, 5, 9 };
		System.out.println("Before sorting : " + Arrays.toString(a)); // [5, 8, 1, 2, 4, 6, 8, 10, 5, 9]

		sort(a);
		System.out.println("After sorting : " + Arrays.toString(a)); // [1, 2, 4, 5, 5, 6, 8, 8, 9, 10]

	}

	static void sort(int[] a) {
		for (int i = 1; i < a.length; i++) {
			int key = a[i];
			int j = i - 1;
			while (j >= 0 && a[j] > key) {
				a[j + 1] = a[j];
				j--;
			}
			a[j + 1] = key;
		}

	}

}
