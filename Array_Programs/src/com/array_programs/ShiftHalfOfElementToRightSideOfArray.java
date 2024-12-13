package com.array_programs;

import java.util.Arrays;

public class ShiftHalfOfElementToRightSideOfArray {

	public static void main(String[] args) {

		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		System.out.println("Before shifting : " + Arrays.toString(arr));

		int[] newArr = new int[arr.length];
		int midIndex = arr.length / 2;

		if (arr.length % 2 == 0) {
			System.arraycopy(arr, 0, newArr, midIndex, midIndex);
			System.arraycopy(arr, midIndex, newArr, 0, midIndex);
		} else {
			System.arraycopy(arr, 0, newArr, midIndex + 1, midIndex);
			System.arraycopy(arr, midIndex + 1, newArr, 0, midIndex);
			newArr[midIndex] = arr[midIndex];
		}

		System.out.println("After shifting : " + Arrays.toString(newArr));

	}

}
