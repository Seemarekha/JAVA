package com.array_programs;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PrintRepeatedElementInArray {

	public static void main(String[] args) {
		int[] a = { 10, 30, 20, 40, 30, 50, 10, 90, 60, 50 };
		System.out.println("Given array : " + Arrays.toString(a));
		System.out.print("Repeated elements present in given array : ");
		repeatedElement(a);

	}

	private static void repeatedElement(int[] a) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (int num : a)
			map.put(num, map.getOrDefault(num, 0) + 1);

		for (int num : map.keySet()) {
			if (map.get(num) > 1)
				System.out.print(num + " ");
		}

	}

}
