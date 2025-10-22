package com.Problems;

import java.util.Arrays;

public class PlusOne {

	public static void main(String[] args) {
		int[] nums = { 1, 9, 3, 9 };
		int[] res = plusOne(nums);
		System.out.println(Arrays.toString(res)); // [1, 9, 4, 0]

	}

	private static int[] plusOne(int[] nums) {
		int n = nums.length;
		for (int i = n - 1; i >= 0; i--) {
			if (nums[i] < 9) {
				nums[i]++;
				return nums;
			}
			nums[i] = 0;
		}
		int[] result = new int[n + 1];
		result[0] = 1;
		return result;

	}

}
