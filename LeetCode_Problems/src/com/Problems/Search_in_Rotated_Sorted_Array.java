package com.Problems;

import java.util.Arrays;

public class Search_in_Rotated_Sorted_Array {

	public static void main(String[] args) {
		int[] arr = { 3, 4, 5, 6, 7, 0, 1, 2 };
		System.out.println("Given array : " + Arrays.toString(arr));
		int target = 0;
		int index = search(arr, target);
		System.out.println("Target value found in rotated sorted array at the index : " + index);

	}

	private static int search(int[] arr, int target) {
		int left = 0;
		int right = arr.length - 1;

		while (left <= right) {
			int mid = (left + right) / 2;
			if (arr[mid] == target)
				return mid;

			if (arr[left] <= arr[mid]) {
				if (target < arr[left] || target > arr[mid])
					left = mid + 1;
				else
					right = mid - 1; 
			} else {
				if (target > arr[right] || target < arr[mid])
					right = mid - 1;
				else
					left = mid + 1;
			}
		}
		return -1;
	}

}


/********************** Output *********************/

/*
 
  
  
Given array : [3, 4, 5, 6, 7, 0, 1, 2]
Target value found in rotated sorted array at the index : 5 
  
  
  
  
 */