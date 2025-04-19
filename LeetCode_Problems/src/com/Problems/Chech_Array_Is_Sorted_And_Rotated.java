package com.Problems;

import java.util.Arrays;

public class Chech_Array_Is_Sorted_And_Rotated {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 1, 2 };
		System.out.println("Given array : " + Arrays.toString(arr));
		if (isSortedAndRotated(arr))
			System.out.println("Given array is sorted and rotated");
		else
			System.out.println("Given array is Not sorted and rotated");

	}

	private static boolean isSortedAndRotated(int[] arr) {
		int count = 0;
		int n = arr.length;
		for (int i = 0; i < n; i++) {
			if (arr[i] > arr[(i + 1) % n])
				count++;
		}
		return count <= 1;
		
	}

}




/**************** Output ****************/

/*

Given array : [3, 4, 5, 1, 2]
Given array is sorted and rotated

*/
