package com.array_programs;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PrintDistinctElementPresentInTwoArray {

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

		Set<Integer> distinctEle = new HashSet<Integer>(s1);
		distinctEle.addAll(s2);

		Set<Integer> commonEle = new HashSet<Integer>(s1);
		commonEle.retainAll(s2);

		distinctEle.removeAll(commonEle);

		System.out.println("Distinct elements present in two array : " + distinctEle); // [34, 98, 67, 21, 89, 76]

	}

}
