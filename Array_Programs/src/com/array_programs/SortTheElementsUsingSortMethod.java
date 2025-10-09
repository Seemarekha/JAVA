package com.array_programs;

import java.util.Arrays;

public class SortTheElementsUsingSortMethod {

	public static void main(String[] args) {
		int[] a = { 34, 23, 56, 46, 85, 90, 87, 54 };
		System.out.println("Before sorting : " + Arrays.toString(a)); // [34, 23, 56, 46, 85, 90, 87, 54]
		Arrays.sort(a);
		System.out.println("After sorting : " + Arrays.toString(a)); // [23, 34, 46, 54, 56, 85, 87, 90]

	}

}
