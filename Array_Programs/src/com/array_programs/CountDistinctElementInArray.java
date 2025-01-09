package com.array_programs;

import java.util.HashSet;

public class CountDistinctElementInArray {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 2, 1, 4, 5, 6, 3, 4 };

		HashSet<Integer> distinctElemets = new HashSet<Integer>();

		for (int num : arr) {
			distinctElemets.add(num);
		}
		System.out.println("Number of distinct elements : " + distinctElemets.size());
	}

}
