package com.array_programs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Leaders_InArray {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		List<Integer> leaders = findLeaders(arr);

		System.out.println("Leaders are: " + leaders); // [17, 5, 2]

	}

	private static List<Integer> findLeaders(int[] arr) {
		List<Integer> list = new ArrayList<Integer>();
		int n = arr.length;

		int maxFromRight = arr[n - 1];
		list.add(maxFromRight);

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] >= maxFromRight) {
				list.add(arr[i]);
				maxFromRight = arr[i];
			}
		}
		Collections.reverse(list);

		return list;
	}

}
