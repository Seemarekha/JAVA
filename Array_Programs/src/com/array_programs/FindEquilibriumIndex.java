package com.array_programs;

public class FindEquilibriumIndex {

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 1, 3, 2, 4 };
		int size = arr.length;
		System.out.print("Equilibrium Index : ");
		System.out.println(equilibrium_index(arr, size));

	}

	private static int equilibrium_index(int[] arr, int n) {
		for (int i = 0; i < n; i++) {
			int left_sum = 0;
			for (int j = 0; j < i; j++) {
				left_sum += arr[i];
			}
			int right_sum = 0;
			for (int j = i + 1; j < n; j++) {
				right_sum += arr[i];
			}
			if (right_sum == left_sum)
				return i;
		}
		return -1;
	}

}



/************* Output **********/

/*

Equilibrium Index : 4

*/