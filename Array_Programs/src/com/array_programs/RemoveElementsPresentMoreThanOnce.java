package com.array_programs;

import java.util.Arrays;
import java.util.HashMap;

public class RemoveElementsPresentMoreThanOnce {

	public static void main(String[] args) {
		int[] a = { 1, 2, 1, 3, 2, 4 };
		System.out.println(Arrays.toString(a)); // [1, 2, 1, 3, 2, 4]
		int[] result = uniqueElement(a);
		System.out.println(Arrays.toString(result)); // [3, 4]

	}

	private static int[] uniqueElement(int[] a) {
		HashMap<Integer, Integer> mp = new HashMap<Integer, Integer>();
		for (int num : a) {
			mp.put(num, mp.getOrDefault(num, 0) + 1);
		}
		int uniqueCount = 0;
		for (int count : mp.values()) {
			if (count == 1)
				uniqueCount++;
		}
		int[] res = new int[uniqueCount];
		int i = 0;
		for (int num : a) {
			if (mp.get(num) == 1)
				res[i++] = num;
		}
		return res;
	}

}
