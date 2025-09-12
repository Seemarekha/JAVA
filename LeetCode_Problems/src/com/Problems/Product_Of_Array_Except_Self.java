/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]


Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 
 */

package com.Problems;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println("Given array :" + Arrays.toString(arr));
		int[] result = productExceptSelf(arr);
		System.out.println("Product of array except self : " + Arrays.toString(result));

	}

	private static int[] productExceptSelf(int[] arr) {
		int[] res = new int[arr.length];
		int prefix = 1, suffix = 1;

		for (int i = 0; i < arr.length; i++) {
			res[i] = prefix;
			prefix *= arr[i];
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			res[i] *= suffix;
			suffix *= arr[i];
		}
		return res;
	}

}

/***************** Output ******************/

/*
 * 
 * Given array :[1, 2, 3, 4] 
 * Product of array except self : [24, 12, 8, 6]
 * 
 */