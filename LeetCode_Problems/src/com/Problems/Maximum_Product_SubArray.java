package com.Problems;

import java.util.Arrays;

public class Maximum_Product_SubArray {

	public static void main(String[] args) {
		int[] arr = { 2, 3, -2, 4 };
		System.out.println("Given array : " + Arrays.toString(arr));
		int maxValue = maxProduct(arr);
		System.out.println("Maximum product subArray : " + maxValue);

	}

	private static int maxProduct(int[] arr) {
		if (arr.length == 0)
			return 0;
		int min = arr[0];
		int max = arr[0];
		int res = max;

		for (int i = 1; i < arr.length; i++) {
			int curr = arr[i];
			int temp = Math.max(curr, Math.max(max * curr, min * curr));
			min = Math.min(curr, Math.min(min * curr, max * curr));
			max = temp;

			res = Math.max(res, max);
		}
		return res;
	}

}





/************* Output ***************/


/*
  
  
  
  
Given array : [2, 3, -2, 4]
Maximum product subArray : 6  
  
  
  
 */
