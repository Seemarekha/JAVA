package com.array_programs;

import java.util.Arrays;

public class SquareOfEachElementInArray {

	public static void main(String[] args) {
		int[] a = { 2, 3, 4, 5, 1, 6, 7 };
		System.out.println(Arrays.toString(a));
		square(a);
		System.out.println(Arrays.toString(a));

	}

	private static void square(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = a[i] * a[i];
		}

	}

}
