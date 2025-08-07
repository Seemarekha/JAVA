 package com.array_programs;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortByFrequency {

	public static void main(String[] args) {
		int[] arr = { 4, 5, 6, 5, 4, 3, 2, 2, 8, 3, 3 };
		System.out.println("Before sorting : " + Arrays.toString(arr));
		sortByFrequency(arr);
		System.out.println("After sorting by frequency : " + Arrays.toString(arr));

	}

	private static int[] sortByFrequency(int[] arr) {

		Map<Integer, Integer> m = new HashMap<>();

		for (int n : arr)
			m.put(n, m.getOrDefault(n, 0) + 1);

		List<Integer> list = new ArrayList<Integer>();

		for (int n : arr)
			list.add(n);

		list.sort((a, b) -> {

			int freqA = m.get(a);
			int freqB = m.get(b);

			if (freqA == freqB) {
				return Integer.compare(a, b);
			}

			return Integer.compare(freqB, freqA);

		});

		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}

		return arr;
	}

}
