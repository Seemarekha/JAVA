/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.

Example 1:

Input: nums = [-4,-1,0,3,10]
Output: [0,1,9,16,100]
Explanation: After squaring, the array becomes [16,1,0,9,100].
After sorting, it becomes [0,1,9,16,100].


Example 2:

Input: nums = [-7,-3,2,3,11]
Output: [4,9,9,49,121]
 */

package com.Problems;

import java.util.Arrays;

public class Squares_Of_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1 = { -4, -1, 0, 3, 10 };
		int[] nums2 = { -7, -3, 2, 3, 11 };

		System.out.println(Arrays.toString(sortedSquares(nums1))); // [0, 1, 9, 16, 100]
		System.out.println(Arrays.toString(sortedSquares(nums2))); // [4, 9, 9, 49, 121]

	}

	private static int[] sortedSquares(int[] nums) {
		int n = nums.length;
		int[] res = new int[n];
		int left = 0, right = n - 1;
		int pos = n - 1;

		while (left <= right) {
			int leftSq = nums[left] * nums[left];
			int rightSq = nums[right] * nums[right];

			if (leftSq > rightSq) {
				res[pos] = leftSq;
				left++;
			} else {
				res[pos] = rightSq;
				right--;
			}
			pos--;
		}
		return res;
	}

}
