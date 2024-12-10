package com.array_programs;

import java.util.HashMap;
import java.util.Map;

public class OccurrenceOfEachElemetInArray {

	public static void main(String[] args) {
		int[] a = { 1, 4, 1, 3, 3, 5, 6, 4, 2, 6, 2, 1, 7, 5, 9, 4 };
		int n = a.length;
		countOccur(a, n);

	}

	private static void countOccur(int[] a, int n) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int i = 0; i < n; i++) {
			if (map.containsKey(a[i]))
				map.put(a[i], map.get(a[i]) + 1);
			else
				map.put(a[i], 1);
		}

		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
			System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times");
		}

	}

}
