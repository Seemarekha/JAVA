package com.Problems;

import java.util.Arrays;

public class Find_min_value_in_Rotated_Sorted_Array {

	public static void main(String[] args) {

		int[] arr = { 3, 4, 5, 1, 2 };
		System.out.println("Given array : "+Arrays.toString(arr));
		int res = findMin(arr);
		System.out.println("Minimum value in rotated sorted array : " + res);

	}

	private static int findMin(int[] arr) {

		int left = 0;
		int right = arr.length - 1;
		int minValue = arr[0];

		if (arr.length == 1)
			return minValue;

		while (left <= right) {
			if (arr[left] < arr[right])
				minValue = Math.min(minValue, arr[left]);

			int mid = (left + right) / 2;

			minValue = Math.min(minValue, arr[mid]);
			if (arr[left] <= arr[mid])
				left = mid + 1;
			else
				right = mid - 1;

		}
		return minValue;
	}

}




/********************** Output *********************/

/*
 
  
  
Given array : [3, 4, 5, 1, 2]
Minimum value in rotated sorted array : 1  
  
  
  
  
 */
