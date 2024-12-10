package com.array_programs;

import java.util.HashMap;
import java.util.Map;

public class MinimumOccurredElementInArray {

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 4, 5, 3, 4, 2, 4, 2, 6, 6, 6 };
		int minOccurred = minOccElement(a);
		System.out.println("Minimum occurred element present in array : " + minOccurred);
	}

	private static int minOccElement(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : a)
			map.put(num, map.getOrDefault(num, 0) + 1);

		int minOccurredElement = a[0];
		int minCount = Integer.MAX_VALUE;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() < minCount) {
				minOccurredElement = entry.getKey();
				minCount = entry.getValue();
			}
		}
		return minOccurredElement;
	}

}
