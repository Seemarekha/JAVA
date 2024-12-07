package com.array_programs;

public class SecondSmallestElementInArray {

	public static void main(String[] args) {
		int[] arr = { 7, 9, 4, 7, 2, 6, 2, 3 };

		int min = arr[0];
		int secMin = arr[0];
		for (int i = 1; i < arr.length; i++) {
			if (arr[i] == min)
				continue;

			if (arr[i] < min) {
				secMin = min;
				min = arr[i];
			} else if (arr[i] < secMin || min == secMin) {
				secMin = arr[i];
			}
		}
		System.out.println("Second smallest element present in given array : " + secMin);

	}

}
