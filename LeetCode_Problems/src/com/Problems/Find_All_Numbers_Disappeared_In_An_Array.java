/*
Given an array nums of n integers where nums[i] is in the range [1, n], return an array of all the integers in the range
 [1, n] that do not appear in nums.

Example 1:

Input: nums = [4,3,2,7,8,2,3,1]
Output: [5,6]


Example 2:

Input: nums = [1,1]
Output: [2]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Find_All_Numbers_Disappeared_In_An_Array {

	public static void main(String[] args) {
		int[] nums1 = { 4, 3, 2, 7, 8, 2, 3, 1 };
		int[] nums2 = { 1, 1 };

		System.out.println(findDisappearedNumbers(nums1)); // [5, 6]
		System.out.println(findDisappearedNumbers(nums2)); // [2]

	}

	private static List<Integer> findDisappearedNumbers(int[] nums) {

		List<Integer> res = new ArrayList<Integer>();

		for (int i = 0; i < nums.length; i++) {
			int index = Math.abs(nums[i]) - 1;
			if (nums[index] > 0)
				nums[index] = -nums[index];
		}

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] > 0)
				res.add(i + 1);
		}
		return res;
	}

}
