/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must be unique and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

 */

package com.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Intersection_Of_Two_Arrays {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println(Arrays.toString(intersection(nums1, nums2))); // [2]

		int[] nums3 = { 4, 9, 5 };
		int[] nums4 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersection(nums3, nums4))); // [9, 4]

	}

	private static int[] intersection(int[] nums1, int[] nums2) {
		Set<Integer> set1 = new HashSet<Integer>();

		for (int num : nums1)
			set1.add(num);

		Set<Integer> resultSet = new HashSet<Integer>();
		for (int num : nums2) {
			if (set1.contains(num))
				resultSet.add(num);
		}

		int[] res = new int[resultSet.size()];
		int i = 0;
		for (int num : resultSet)
			res[i++] = num;

		return res;
	}

}
