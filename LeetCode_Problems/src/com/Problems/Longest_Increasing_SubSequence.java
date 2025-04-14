package com.Problems;

import java.util.Arrays;

public class Longest_Increasing_SubSequence {

	public static void main(String[] args) {
		int[] arr = { 10, 9, 2, 5, 3, 7, 101, 18 };
		System.out.println("Length of longest increasing subsequence : " + lengthOf(arr));

	}

	private static int lengthOf(int[] arr) {
		int[] lis = new int[arr.length];
		Arrays.fill(lis, 1);
		int max = 0;

		for (int i = 1; i < arr.length; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j]) {
					lis[i] = Math.max(lis[i], 1 + lis[j]);
					max = Math.max(max, lis[i]);
				}
			}
		}
		return max;
	}

}



/***************** Output ***************/


/*



Length of longest increasing subsequence : 4




*/