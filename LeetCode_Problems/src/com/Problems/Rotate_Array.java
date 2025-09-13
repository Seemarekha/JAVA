/*
Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]


Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
 */

package com.Problems;

import java.util.Arrays;

public class Rotate_Array {

	/************* Approach -1 ********************/

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
		rotate(arr, 3);
		System.out.println(Arrays.toString(arr));

	}

	private static void rotate(int[] arr, int k) {
		k %= arr.length;
		reverse(arr, 0, arr.length - 1);
		reverse(arr, 0, k - 1);
		reverse(arr, k, arr.length - 1);

	}

	private static void reverse(int[] arr, int i, int j) {
		while (i < j) {
			int temp = arr[i];
			arr[i] = arr[j];
			arr[j] = temp;
			i++;
			j--;
		}

	}

	/************* Approach -2 ********************/

	/*
	 * public static void main(String[] args) { int[] arr = { 1, 2, 3, 4, 5, 6, 7 };
	 * for(int i=1;i<=3;i++) { rotate(arr); }
	 * 
	 * System.out.println(Arrays.toString(arr));
	 * 
	 * }
	 * 
	 * private static void rotate(int[] arr) { int temp=arr[arr.length-1]; for(int
	 * j=arr.length-2;j>=0;j--) { arr[j+1]=arr[j]; } arr[0]=temp;
	 * 
	 * }
	 */

}
