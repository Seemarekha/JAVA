/*
Given an integer array nums, find a subarray that has the largest product, and return the product.

The test cases are generated so that the answer will fit in a 32-bit integer.

Example 1:

Input: nums = [2,3,-2,4]
Output: 6
Explanation: [2,3] has the largest product 6.


Example 2:

Input: nums = [-2,0,-1]
Output: 0
Explanation: The result cannot be 2, because [-2,-1] is not a subarray.
 */

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
		int res = arr[0];

		for (int i = 1; i < arr.length; i++) {
			if (arr[i] < 0) {
				int temp = max;
				max = min;
				min = temp;
			}

			max = Math.max(arr[i], max * arr[i]);
			min = Math.min(arr[i], min * arr[i]);

			res = Math.max(res, max);
		}
		return res;
	}

}

/************* Output ***************/

/*
 * 
 * 
 * 
 * 
 * Given array : [2, 3, -2, 4] Maximum product subArray : 6
 * 
 * 
 * 
 */
