/*
Given an integer array of size n, find all elements that appear more than ⌊ n/3 ⌋ times.

 

Example 1:

Input: nums = [3,2,3]
Output: [3]


Example 2:

Input: nums = [1]
Output: [1]


Example 3:

Input: nums = [1,2]
Output: [1,2]
 

Constraints:

1 <= nums.length <= 5 * 104
-109 <= nums[i] <= 109
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Majority_Element_II {

	public static void main(String[] args) {
		int[] nums = { 1, 1, 1, 3, 3, 2, 2, 2 };

		System.out.println(majorityElement(nums)); // [1, 2]

	}

	private static List<Integer> majorityElement(int[] nums) {
		int count1 = 0;
		int count2 = 0;

		int candidate1 = 0;
		int candidate2 = 0;

		for (int num : nums) {
			if (candidate1 == num) {
				count1++;
			} else if (candidate2 == num) {
				count2++;
			}

			else if (count1 == 0) {
				candidate1 = num;
				count1 = 1;
			} else if (count2 == 0) {
				candidate2 = num;
				count2 = 1;
			}

			else {
				count1--;
				count2--;
			}
		}

		count1 = 0;
		count2 = 0;

		for (int num : nums) {
			if (num == candidate1)
				count1++;

			else if (num == candidate2)
				count2++;
		}

		List<Integer> res = new ArrayList<Integer>();

		if (count1 > nums.length / 3)
			res.add(candidate1);

		if (count2 > nums.length / 3)
			res.add(candidate2);

		return res;
	}

}
