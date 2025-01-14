package com.array_programs;

public class MaxProductSubarray {
	public static int maxProduct(int[] nums) {
		if (nums == null || nums.length == 0) {
			throw new IllegalArgumentException("Array must not be null or empty");
		}

		int maxProduct = nums[0];
		int currentMax = nums[0];
		int currentMin = nums[0];

		for (int i = 1; i < nums.length; i++) {
			int tempMax = currentMax;

			// Update the current maximum and minimum
			currentMax = Math.max(nums[i], Math.max(currentMax * nums[i], currentMin * nums[i]));
			currentMin = Math.min(nums[i], Math.min(tempMax * nums[i], currentMin * nums[i]));

			// Update the global maximum product
			maxProduct = Math.max(maxProduct, currentMax);
		}

		return maxProduct;
	}

	public static void main(String[] args) {
		int[] nums = { 2, 3, -2, 4, -1 };
		System.out.println("Maximum product of subarray: " + maxProduct(nums));
	}
}
