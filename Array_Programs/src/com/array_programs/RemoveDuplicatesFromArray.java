package com.array_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 1, 2, 4 };
		System.out.println("Before removing duplicates : " + Arrays.toString(a));
		Set<Integer> s = new HashSet<Integer>();
		for (int num : a)
			s.add(num);
		System.out.println("After removing duplicate : " + s);

	}

}
