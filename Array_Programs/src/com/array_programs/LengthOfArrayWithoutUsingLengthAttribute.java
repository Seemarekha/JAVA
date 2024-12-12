package com.array_programs;

import java.util.Arrays;

public class LengthOfArrayWithoutUsingLengthAttribute {

	public static void main(String[] args) {
		int[] a = { 1, 0, 4, 3, 0, 6, 0, 0, 9, 8 };
		System.out.println("Given array : " + Arrays.toString(a));
		int len = 0;
		for (int num : a) {
			len++;
		}
		System.out.println("Length of the array : " + len);
	}

}
