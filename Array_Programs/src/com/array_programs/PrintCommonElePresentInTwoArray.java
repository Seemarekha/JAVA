package com.array_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintCommonElePresentInTwoArray {

	public static void main(String[] args) {

		int[] arr1 = { 23, 67, 43, 21, 89, 90, 56 };
		System.out.println("Array-1 : " + Arrays.toString(arr1)); // Array-1 : [23, 67, 43, 21, 89, 90, 56]

		int[] arr2 = { 34, 56, 23, 76, 98, 90, 43 };
		System.out.println("Array-2 : " + Arrays.toString(arr2)); // Array-2 : [34, 56, 23, 76, 98, 90, 43]

		Set<Integer> s1 = new HashSet<Integer>();
		Set<Integer> s2 = new HashSet<Integer>();

		for (int num : arr1)
			s1.add(num);

		for (int num : arr2)
			s2.add(num);

		Set<Integer> commonElements = new HashSet<Integer>(s1);
		commonElements.retainAll(s2);

		System.out.println("Common elements present in two arrays : " + commonElements); // [23, 56, 90, 43]
	}

}
