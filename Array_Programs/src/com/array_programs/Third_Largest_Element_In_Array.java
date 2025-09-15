package com.array_programs;

import java.util.Arrays;

public class Third_Largest_Element_In_Array {

	public static void main(String[] args) {
		int[] arr = { 10, 4, 3, 50, 23, 90 };

		/* Approach - 1 */

//		Arrays.sort(arr);
//		int n = arr.length;
//		if (n < 3) {
//			System.out.println("Array doesn't have at least 3 elements");
//		} else {
//			System.out.println("3rd largest element : " + arr[n - 3]);  //23
//		}

		/* Approach - 2 */

		int n = arr.length;
		int first = Integer.MIN_VALUE, second = Integer.MIN_VALUE, third = Integer.MIN_VALUE;

		for (int num : arr) {
			if (num > first) {
				third = second;
				second = first;
				first = num;
			} else if (num > second && num < first) {
				third = second;
				second = num;
			} else if (num > third && num < second) {
				third = num;
			}
		}
		if (third == Integer.MIN_VALUE) {
			System.out.println("No third largest element (array has duplicates or too small)");
		} else {
			System.out.println("Third largest: " + third);  // 23
		}

	}

}
