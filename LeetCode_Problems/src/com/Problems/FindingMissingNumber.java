package com.Problems;

import java.util.Arrays;
import java.util.HashSet;

public class FindingMissingNumber {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 3, 5 };
		System.out.println("Given array : " + Arrays.toString(arr));

		if (arr.length == 0)
			return;

		int min = arr[0];
		int max = arr[0];
		for (int n : arr) {
			if (min > n)
				min = n;
			if (max < n)
				max = n;
		}

		HashSet<Integer> hs = new HashSet<Integer>();

		for (int n : arr)
			hs.add(n);
		System.out.print("Missing numbers : ");
		for (int i = min; i <= max; i++) {
			if (!hs.contains(i))
				System.out.print(i + " ");
		}
	}

}
