package com.CodesForRecursion;

public class SumOfAllSubsetsOfGivenSet {

	public static void main(String[] args) {
		int[] arr = { 5, 7, 4, 9 };
		int len = arr.length;

		subsetSum(arr, 0, len - 1, 0);

	}

	private static void subsetSum(int[] arr, int l, int r, int sum) {
		if (l > r) {
			System.out.print(sum + " ");
			return;
		}
		subsetSum(arr, l + 1, r, sum + arr[l]);
		subsetSum(arr, l + 1, r, sum);

	}

}
