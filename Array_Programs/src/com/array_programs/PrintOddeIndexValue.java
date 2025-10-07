package com.array_programs;

import java.util.Arrays;

public class PrintOddeIndexValue {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Given Array : " + Arrays.toString(arr));
		System.out.println("Values at odd indices:");
		int[] res = new int[arr.length / 2];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 != 0) {
				res[j++] += arr[i];
			}
		}

		System.out.println(Arrays.toString(res));

	}

}
