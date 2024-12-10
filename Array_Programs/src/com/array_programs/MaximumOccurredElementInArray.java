package com.array_programs;

import java.util.HashMap;
import java.util.Map;

public class MaximumOccurredElementInArray {

	public static void main(String[] args) {
		int[] a = { 4, 5, 6, 7, 4, 5, 3, 6, 4, 2, 4, 2, 6, 6, 6 };
		int maxOccurred = maxOccElement(a);
		System.out.println("Maximum occurred element present in given array : " + maxOccurred);

	}

	private static int maxOccElement(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : a)
			map.put(num, map.getOrDefault(num, 0) + 1);

		int maxOccurredElement = a[0];
		int maxCount = 0;

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			if (entry.getValue() > maxCount) {
				maxOccurredElement = entry.getKey();
				maxCount = entry.getValue();
			}
		}
		return maxOccurredElement;
	}

}
