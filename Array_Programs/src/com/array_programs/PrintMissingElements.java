package com.array_programs;

import java.util.Arrays;
import java.util.HashSet;

public class PrintMissingElements {

	public static void main(String[] args) {
		int[] a = { 2, 4, 6, 8, 13 };
		System.out.println("Given Array : " + Arrays.toString(a));

		if (a.length == 0)
			return;

		int min = a[0];
		int max = a[0];
		for (int n : a) {
			if (n < min)
				min = n;
			if (n > max)
				max = n;
		}
		// System.out.println(min+" "+max);

		HashSet<Integer> s = new HashSet<>();

		for (int num : a)
			s.add(num);

		System.out.print("Missing elements : ");
		for (int i = min; i <= max; i++) {
			if (!s.contains(i))
				System.out.print(i + " ");
		}
	}

}
