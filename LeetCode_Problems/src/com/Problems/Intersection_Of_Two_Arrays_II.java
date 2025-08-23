/*
Given two integer arrays nums1 and nums2, return an array of their intersection. Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.

Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2,2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [4,9]
Explanation: [9,4] is also accepted.
 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Intersection_Of_Two_Arrays_II {

	public static void main(String[] args) {
		int[] nums1 = { 1, 2, 2, 1 };
		int[] nums2 = { 2, 2 };
		System.out.println(Arrays.toString(intersect(nums1, nums2))); // [2, 2]

		int[] nums3 = { 4, 9, 5 };
		int[] nums4 = { 9, 4, 9, 8, 4 };
		System.out.println(Arrays.toString(intersect(nums3, nums4))); // [9, 4]

	}

	private static int[] intersect(int[] nums1, int[] nums2) {
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		for (int num : nums1)
			map.put(num, map.getOrDefault(num, 0) + 1);

		List<Integer> list = new ArrayList<Integer>();
		for (int num : nums2) {
			if (map.containsKey(num) && map.get(num) > 0) {
				list.add(num);
				map.put(num, map.get(num) - 1);
			}
		}

		int[] res = new int[list.size()];
		for (int i = 0; i < res.length; i++) {
			res[i] = list.get(i);
		}
		return res;
	}

}
