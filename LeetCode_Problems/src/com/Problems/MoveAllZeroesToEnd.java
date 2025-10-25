package com.Problems;

import java.util.Arrays;

public class MoveAllZeroesToEnd {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 9, 8, 0, 6, 0, 0, 4 };
		System.out.println("Original array : " + Arrays.toString(arr));
		int[] res = moveZeroes(arr);
		System.out.println("After moving all zeroes to the end : " + Arrays.toString(res));

	}
 
	private static int[] moveZeroes(int[] arr) {
		int[] res = new int[arr.length];
		int j = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0)
				res[j++] = arr[i];
		}
		return res;
	}

}



/**************** Output ******************/


/*



Original array : [1, 0, 9, 8, 0, 6, 0, 0, 4]
After moving all zeroes to the end : [1, 9, 8, 6, 4, 0, 0, 0, 0]




*/