package com.sorting_Algorithms;

import java.util.Arrays;

public class Merge_Sort {

	public static void main(String[] args) {

		int[] a = { 5, 8, 1, 2, 4, 6, 8, 10, 5, 9 };
		System.out.println("Before sorting : " + Arrays.toString(a)); // [5, 8, 1, 2, 4, 6, 8, 10, 5, 9]

		sort(a);
		System.out.println("After sorting : " + Arrays.toString(a)); // [1, 2, 4, 5, 5, 6, 8, 8, 9, 10]

	}

	static void sort(int[] a) {

		if (a.length == 1)
			return;

		int[] left = new int[a.length / 2];
		int[] right = new int[a.length - left.length];

		System.arraycopy(a, 0, left, 0, left.length);
		System.arraycopy(a, left.length, right, 0, right.length);

		sort(left);
		sort(right);

		merge(left, right, a);

	}

	static void merge(int[] a, int[] b, int[] c) {

		int i = 0, j = 0, k = 0;

		while (i < a.length && j < b.length) {
			if (a[i] < b[j])
				c[k++] = a[i++];
			else
				c[k++] = b[j++];
		}

		while (i < a.length)
			c[k++] = a[i++];
		while (j < b.length)
			c[k++] = b[j++];
	}

}
