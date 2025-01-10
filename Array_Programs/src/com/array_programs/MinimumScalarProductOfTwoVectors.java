package com.array_programs;

public class MinimumScalarProductOfTwoVectors {

	public static void main(String[] args) {

		int arr1[] = { 1, 2, 6, 3, 7 };
		int arr2[] = { 10, 7, 45, 3, 7 };

		int size = arr1.length;

		// sort 1st array in ascending order

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr1[i] > arr1[j]) {
					int temp = arr1[i];
					arr1[i] = arr1[j];
					arr1[j] = temp;
				}
			}
		}

		// sort 2nd array in descending order

		for (int i = 0; i < size; i++) {
			for (int j = i + 1; j < size; j++) {
				if (arr2[i] < arr2[j]) {
					int temp = arr2[i];
					arr2[i] = arr2[j];
					arr2[j] = temp;
				}
			}
		}

		// scalar product

		int product = 0;
		for (int i = 0; i < size; i++)
			product += arr1[i] * arr2[i];

		System.out.println("Minimum scalar product : " + product);

	}

}
