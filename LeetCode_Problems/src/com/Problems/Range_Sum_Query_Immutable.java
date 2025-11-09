/*
Given an integer array nums, handle multiple queries of the following type:

Calculate the sum of the elements of nums between indices left and right inclusive where left <= right.
Implement the NumArray class:

NumArray(int[] nums) Initializes the object with the integer array nums.
int sumRange(int left, int right) Returns the sum of the elements of nums between indices left and right inclusive (i.e. nums[left] + nums[left + 1] + ... + nums[right]).
 

Example 1:

Input
["NumArray", "sumRange", "sumRange", "sumRange"]
[[[-2, 0, 3, -5, 2, -1]], [0, 2], [2, 5], [0, 5]]
Output
[null, 1, -1, -3]

Explanation
NumArray numArray = new NumArray([-2, 0, 3, -5, 2, -1]);
numArray.sumRange(0, 2); // return (-2) + 0 + 3 = 1
numArray.sumRange(2, 5); // return 3 + (-5) + 2 + (-1) = -1
numArray.sumRange(0, 5); // return (-2) + 0 + 3 + (-5) + 2 + (-1) = -3
 */

package com.Problems;

public class Range_Sum_Query_Immutable {

	private int[] prefixSum;

	public Range_Sum_Query_Immutable(int[] nums) {
		prefixSum = new int[nums.length + 1];
		for (int i = 0; i < nums.length; i++) {
			prefixSum[i + 1] = prefixSum[i] + nums[i];
		}
	}

	public int sumRange(int left, int right) {
		return prefixSum[right + 1] - prefixSum[left];
	}

	public static void main(String[] args) {
		int[] nums = { -2, 0, 3, -5, 2, -1 };
		Range_Sum_Query_Immutable obj = new Range_Sum_Query_Immutable(nums);

		System.out.println("Sum of [0, 2] = " + obj.sumRange(0, 2)); // Output: 1
		System.out.println("Sum of [2, 5] = " + obj.sumRange(2, 5)); // Output: -1
		System.out.println("Sum of [0, 5] = " + obj.sumRange(0, 5)); // Output: -3
	}
}
