/*
Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.


Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]


Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]


Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
 */

package com.Problems;

import java.util.Arrays;

public class Find_First_and_Last_Position_of_Element_in_Sorted_Array {

	public static void main(String[] args) {

		int[] nums1 = { 5, 7, 7, 8, 8, 10 };
		int target1 = 8;
		System.out.println(Arrays.toString(searchRange(nums1, target1))); // [3, 4]

		int[] nums2 = { 5, 7, 7, 8, 8, 10 };
		int target2 = 6;
		System.out.println(Arrays.toString(searchRange(nums2, target2))); // [-1, -1]

		int[] nums3 = {};
		int target3 = 0;
		System.out.println(Arrays.toString(searchRange(nums3, target3))); // [-1, -1]

	}

	private static int[] searchRange(int[] nums, int target) {
		int first = findFirst(nums, target);
		int last = findLast(nums, target);
		return new int[] { first, last };
	}

	private static int findFirst(int[] nums, int target) {
		int low = 0, high = nums.length - 1, index = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;
			if (nums[mid] >= target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}

			if (nums[mid] == target)
				index = mid;
		}
		return index;
	}

	private static int findLast(int[] nums, int target) {
		int low = 0, high = nums.length - 1, index = -1;

		while (low <= high) {
			int mid = low + (high - low) / 2;

			if (nums[mid] <= target) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}

			if (nums[mid] == target)
				index = mid;
		}
		return index;
	}

}
