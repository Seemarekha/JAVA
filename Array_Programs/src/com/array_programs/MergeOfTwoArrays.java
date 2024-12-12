package com.array_programs;

import java.util.Arrays;

public class MergeOfTwoArrays {

	public static void main(String[] args) {
		int[] a1 = { 1, 2, 3 };
		System.out.println("Array-1 :" + Arrays.toString(a1));
		int[] a2 = { 4, 5, 6 };
		System.out.println("Array-2 :" + Arrays.toString(a2));

		int[] res = merge(a1, a2);
		System.out.println("After merging two arrays : " + Arrays.toString(res));

	}

	private static int[] merge(int[] a1, int[] a2) {
		int len = a1.length + a2.length;
		int[] res = new int[len];

		System.arraycopy(a1, 0, res, 0, a1.length);
		System.arraycopy(a2, 0, res, a1.length, a2.length);

		return res;
	}

}
