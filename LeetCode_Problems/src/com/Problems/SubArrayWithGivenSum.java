package com.Problems;

public class SubArrayWithGivenSum {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 7, 5 };
		findSubarray(arr, 15);
	}

	private static void findSubarray(int[] arr, int sum) {
		int i = 0, currSum = 0;
		for (int j = 0; j < arr.length; j++) {
			currSum += arr[j];
			while (currSum > sum && i < j) {
				currSum -= arr[i++];
			}
			if (currSum == sum) {
				System.out.println("Subarray from index " + i + " to " + j);  // Subarray from index 2 to 4
				return;
			}
		}
		System.out.println("Not found");

	}

}
