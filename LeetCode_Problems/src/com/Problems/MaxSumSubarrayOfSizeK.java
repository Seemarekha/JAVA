package com.Problems;

public class MaxSumSubarrayOfSizeK {

	public static void main(String[] args) {
		int[] arr = { 2, 1, 5, 1, 3, 2 };
		int k = 3;

		System.out.println("Maximum sum of size k window = " + maxSum(arr, k)); // 9;

	}

	private static int maxSum(int[] arr, int k) {
		int windowSum = 0, maxSum = Integer.MIN_VALUE;

		for (int i = 0; i < k; i++) {
			windowSum += arr[i];
		}

		maxSum = windowSum;

		for (int i = k; i < arr.length; i++) {
			windowSum += arr[i] - arr[i - k];
			maxSum = Math.max(maxSum, windowSum);
		}
		return maxSum;
	}

}
