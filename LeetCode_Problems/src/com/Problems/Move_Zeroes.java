package com.Problems;

import java.util.Arrays;

public class Move_Zeroes {

	public static void main(String[] args) {
		int[] a = { 3, 0, 15, 0, 0, 13 };
		int[] b = new int[a.length];
		int j = 0;
		for (int i = 0; i < a.length; i++) {
			if (a[i] != 0)
				b[j++] = a[i];

		}
		System.out.println(Arrays.toString(b));

	}

}
