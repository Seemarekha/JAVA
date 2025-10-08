package com.array_programs;

import java.util.Arrays;

public class ReplaceEachElementByItsRankInGivenArray {

	public static void main(String[] args) {
		int[] arr = { 100, 2, 70, 12, 90 };
		System.out.println("Given Array : " + Arrays.toString(arr)); // [100, 2, 70, 12, 90]
		resultArray(arr);
		System.out.println(Arrays.toString(arr)); // [5, 1, 3, 2, 4]

	}

	private static void resultArray(int[] arr) {
		int[] res = new int[arr.length];
		System.arraycopy(arr, 0, res, 0, arr.length);
		Arrays.sort(res);

		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
				if (res[j] == arr[i]) {
					arr[i] = j + 1;
					break;
				}
			}
		}

	}

}

/***************** Output ******************/

/*
 * 
 * [5, 1, 3, 2, 4]
 * 
 * 
 */