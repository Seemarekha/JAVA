package com.array_programs;

import java.util.HashSet;

public class ArrayIsSubsetOfAotherArray {

	public static void main(String[] args) {

		int arr1[] = { 11, 10, 13, 21, 30, 70 };
		int arr2[] = { 11, 30, 70, 10 };

		int m = arr1.length;
		int n = arr2.length;

		if (isSubset(arr1, arr2, m, n))
			System.out.println("arr2 is subset of arr1");
		else
			System.out.println("arr2 is not subset of arr1");
	}

	private static boolean isSubset(int[] arr1, int[] arr2, int m, int n) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int num : arr1)
			hs.add(num);

		for (int num : arr2) {
			if (!hs.contains(num))
				return false;
		}
		return true;
	}

}
