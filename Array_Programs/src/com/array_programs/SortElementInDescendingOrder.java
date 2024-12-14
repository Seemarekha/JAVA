package com.array_programs;

import java.util.Arrays;

public class SortElementInDescendingOrder {

	public static void main(String[] args) {
		int[] a = { 34, 23, 56, 46, 85, 90, 87, 54 };
		System.out.println("Before sorting : " + Arrays.toString(a));
		Arrays.sort(a);
		int[] res = new int[a.length];
		int j = 0;
		for (int i = a.length - 1; i >= 0; i--)
			res[j++] = a[i];
		System.out.println("After sorting : " + Arrays.toString(res));

	}

}
