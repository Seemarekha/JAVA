package com.Problems;

import java.util.Arrays;

public class Maximum_SubArray {

	public static void main(String[] args) {
		int[] arr = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };
		System.out.println("Given Array : " + Arrays.toString(arr));
		int maxValue = maxSubArray(arr);
		System.out.println("Sum of maximum subArray : " + maxValue);

	}

	private static int maxSubArray(int[] arr) {
		int currSum = 0;
		int maxSum = arr[0];

		for (int i = 0; i < arr.length; i++) {
			if (currSum < 0)
				currSum = 0;
			currSum = currSum + arr[i];
			maxSum = Math.max(maxSum, currSum);
		}
		return maxSum;
	}

}






/******************** Output *********************/


/*
 
 
 
Given Array : [-2, 1, -3, 4, -1, 2, 1, -5, 4]
Sum of maximum subArray : 6 
 
 
 
 
 */
