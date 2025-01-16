package com.array_programs;

import java.util.HashSet;

public class DisjointArrays {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 6, 7, 8, 9, 10 };

		if (areDisjoint(arr1, arr2)) {
			System.out.println("The arrays are disjoint.");
		} else {
			System.out.println("The arrays are not disjoint.");
		}

	}

	private static boolean areDisjoint(int[] arr1, int[] arr2) {

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int n : arr1)
			hs.add(n);

		for (int n : arr2) {
			if (hs.contains(n))
				return false;
		}
		return true;
	}

}
