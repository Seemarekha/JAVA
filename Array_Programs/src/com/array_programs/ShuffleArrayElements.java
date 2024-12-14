package com.array_programs;

import java.util.Arrays;

public class ShuffleArrayElements {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		System.out.println("Original Array : " + Arrays.toString(a));
		shuffledArray(a);
		System.out.println("Shuffled Array : " + Arrays.toString(a));

	}

	public static void shuffledArray(int[] a) {

		for (int i = a.length - 1; i > 0; i--) {
			int j = (int) (Math.random() * (i + 1));

			int temp = a[i];
			a[i] = a[j];
			a[j] = temp;
		}

	}

}
