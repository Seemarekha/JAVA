package com.Patterns;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Remove_Duplicates {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 1, 2, 2, 3, 5, 1 };

		int newLength = removeDuplicates(arr);
		System.out.println("Unique elements:");

		for (int i = 0; i < newLength; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	private static int removeDuplicates(int[] arr) {

		if (arr.length == 0)
			return 0;

		Arrays.sort(arr);

		int j = 0;
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] != arr[j]) {
				j++;
				arr[j] = arr[i];
			}
		}
		return j + 1;
	}

}
