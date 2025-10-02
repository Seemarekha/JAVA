/*
Given an integer array nums and an integer k, return true if there are two distinct indices i and j in the array such that nums[i] == nums[j] and abs(i - j) <= k.

Example 1:

Input: nums = [1,2,3,1], k = 3
Output: true


Example 2:

Input: nums = [1,0,1,1], k = 1
Output: true


Example 3:

Input: nums = [1,2,3,1,2,3], k = 2
Output: false

 */

package com.Problems;

import java.util.HashSet;
import java.util.Set;

public class Contains_Duplicates_III {

	public static void main(String[] args) {
		System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1 }, 3)); // true
		System.out.println(containsNearbyDuplicate(new int[] { 1, 0, 1, 1 }, 1)); // true
		System.out.println(containsNearbyDuplicate(new int[] { 1, 2, 3, 1, 2, 3 }, 2)); // false

	}

	private static boolean containsNearbyDuplicate(int[] nums, int k) {
		Set<Integer> s = new HashSet<Integer>();

		for (int i = 0; i < nums.length; i++) {
			if (s.contains(nums[i]))
				return true;

			s.add(nums[i]);
			if (s.size() > k)
				s.remove(nums[i - k]);
		}
		return false;
	}

}
