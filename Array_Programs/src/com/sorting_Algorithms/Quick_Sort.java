package com.sorting_Algorithms;

import java.util.Arrays;

public class Quick_Sort {

	public static void main(String[] args) {

		int[] a = { 5, 3, 8, 1, 2, 4, 6, 7, 10, 5, 9 };
		System.out.println("Before sorting : " + Arrays.toString(a)); // [5, 8, 1, 2, 4, 6, 8, 10, 5, 9]

		sort(a, 0, a.length - 1);
		System.out.println("After sorting : " + Arrays.toString(a)); // [1, 2, 4, 5, 5, 6, 8, 8, 9, 10]

	}

	static void sort(int[] a, int start, int end) {

		if (start >= end)
			return;

		int i = start;
		int j = end;

		int pivot = a[(start + end) / 2];

		while (i <= j) {
			while (a[i] < pivot)
				i++;
			while (a[j] > pivot)
				j--;

			if (i <= j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;

				i++;
				j--;
			}
		}

		sort(a, start, j);
		sort(a, i, end);

	}

}
