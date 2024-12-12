package com.array_programs;

import java.util.Arrays;

public class ShiftAllZeroesToRightSideOfArray {

	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 3, 0, 6, 0, 0, 9, 8 };
		System.out.println("Before shifting : " + Arrays.toString(a));
		int[] b = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0) {
				b[j] = a[i];
				j++;
			}
		}
		System.out.println("After shifting :" + Arrays.toString(b));

	}

}
