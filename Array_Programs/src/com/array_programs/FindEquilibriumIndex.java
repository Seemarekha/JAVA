package com.array_programs;

public class FindEquilibriumIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
		int size = arr.length;
		System.out.print("Equilibrium Index : ");
		System.out.println(equilibrium_index(arr, size)); // 4

	}

	private static int equilibrium_index(int[] arr, int n) {

		int total = 0;

		for (int num : arr)
			total += num;

		int leftSum = 0;

		for (int i = 0; i < n; i++) {
			int rightSum = total - leftSum - arr[i];

			if (leftSum == rightSum)
				return i;

			leftSum += arr[i];
		}
		return -1;
	}

}

/************* Output **********/

/*
 * 
 * Equilibrium Index : 4
 * 
 */