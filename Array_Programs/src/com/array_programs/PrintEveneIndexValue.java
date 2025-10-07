package com.array_programs;

import java.util.Arrays;

public class PrintEveneIndexValue {

	public static void main(String[] args) {

		int[] arr = { 10, 20, 30, 40, 50, 60, 70 };
		System.out.println("Given Array :" + Arrays.toString(arr)); // [10, 20, 30, 40, 50, 60, 70]
		System.out.print("Values at even indices:");
		int[] res = new int[arr.length / 2 + 1];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (i % 2 == 0) {
				res[j++] += arr[i];
			}
		}

		System.out.print(Arrays.toString(res)); // [10, 30, 50, 70]
	}

}
