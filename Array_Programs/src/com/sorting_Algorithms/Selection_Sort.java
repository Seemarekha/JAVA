package com.sorting_Algorithms;

import java.util.Arrays;

public class Selection_Sort {

	public static void main(String[] args) {

		int[] a = { 5, 8, 1, 2, 4, 6, 8, 10, 5, 9 };
		System.out.println("Before sorting : " + Arrays.toString(a));

		sort(a);
		System.out.println("After sorting : " + Arrays.toString(a));

	}

	static void sort(int[] a) {

		for (int i = 0; i < a.length - 1; i++) {
			int minIndex = i;
			for (int j = i + 1; j < a.length; j++) {
				if (a[j] < a[minIndex])
					minIndex = j;
			}
			if (i != minIndex) {
				int temp = a[minIndex];
				a[minIndex] = a[i];
				a[i] = temp;
			}
		}

	}

}
