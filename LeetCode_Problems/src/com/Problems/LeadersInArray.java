package com.Problems;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LeadersInArray {

	public static void main(String[] args) {
		int[] arr = { 16, 17, 4, 3, 5, 2 };
		List<Integer> leaders = findLeaders(arr);
		System.out.println("Leaders are : " + leaders); // Leaders are : [17, 5, 2]

	}

	private static List<Integer> findLeaders(int[] arr) {
		List<Integer> res = new ArrayList<Integer>();
		int n = arr.length;

		int maxFromRight = arr[n - 1];
		res.add(maxFromRight);

		for (int i = n - 2; i >= 0; i--) {
			if (arr[i] >= maxFromRight) {
				res.add(arr[i]);
				maxFromRight = arr[i];
			}

		}

		Collections.reverse(res);
		return res;
	}

}
