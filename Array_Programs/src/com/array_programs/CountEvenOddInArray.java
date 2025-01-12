package com.array_programs;

import java.util.Arrays;

public class CountEvenOddInArray {

	public static void main(String[] args) {
		int arr[] = { 1, 20, 60, 31, 75, 40, 80 };
		System.out.println("Given Array : " + Arrays.toString(arr));
		int evenCount = 0, oddCount = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] % 2 == 0)
				evenCount++;
			else
				oddCount++;
		}

		System.out.println("Count of even elements : " + evenCount);
		System.out.println("Count of odd elements : " + oddCount);
	}

}
