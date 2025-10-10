package com.array_programs;

import java.util.Arrays;

public class SumOfTwoArrays {

	public static void main(String[] args) {
		int[] a1 = { 2, 5 };
		System.out.println("Array-1 : " + Arrays.toString(a1)); // [2, 5]
		int[] a2 = { 6, 78, 34 };
		System.out.println("Array-2 : " + Arrays.toString(a2)); // [6, 78, 34]

		int[] sum = addArrays(a1, a2);
		System.out.println("Sum of two arrays : " + Arrays.toString(sum)); // [8, 83, 34]

	}

	private static int[] addArrays(int[] a1, int[] a2) {
		int maxLen = Math.max(a1.length, a2.length);
		int[] res = new int[maxLen];

		for (int i = 0; i < maxLen; i++) {
			int v1 = (i < a1.length ? a1[i] : 0);
			int v2 = (i < a2.length ? a2[i] : 0);
			res[i] = v1 + v2;
		}
		return res;
	}

}
