/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.

Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.


Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9


Example 3:

Input: nums = [1,0,1,2]
Output: 3
 */

package com.Problems;

import java.util.HashSet;

public class Longest_Consecutive_Sequence {

	public static void main(String[] args) {
		System.out.println(longestConsecutive(new int[] { 100, 4, 200, 1, 3, 2 })); // 4
		System.out.println(longestConsecutive(new int[] { 0, 3, 7, 2, 5, 8, 4, 6, 0, 1 })); // 9
		System.out.println(longestConsecutive(new int[] { 1, 0, 1, 2 })); //  3
	}

	private static int longestConsecutive(int[] nums) {
		if (nums == null || nums.length == 0)
			return 0;

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int num  : nums) {
			hs.add(num);
		}

		int longest = 0;

		for (int num : hs) {
			if (!hs.contains(num - 1)) {
				int currentNum = num;
				int length = 1;

				while (hs.contains(currentNum + 1)) {
					currentNum++;
					length++;
				}
				longest = Math.max(length, longest);
			}
		}

		return longest;
	}

}
