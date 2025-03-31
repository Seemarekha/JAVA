package com.Problems;

import java.util.Arrays;

public class Product_Of_Array_Except_Self {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4 };
		System.out.println("Given array :" + Arrays.toString(arr));
		int[] result = productExceptSelf(arr);
		System.out.println("Product of array except self : " + Arrays.toString(result));

	}

	private static int[] productExceptSelf(int[] arr) {
		int[] res = new int[arr.length];
		Arrays.fill(res, 1);
		int pre = 1, post = 1;

		for (int i = 0; i < arr.length; i++) {
			res[i] = pre;
			pre = arr[i] * pre;
		}

		for (int i = arr.length - 1; i >= 0; i--) {
			res[i] = res[i] * post;
			post = arr[i] * post;
		}
		return res;
	}

}

/***************** Output ******************/

/*
 * 
 * Given array :[1, 2, 3, 4] 
 * Product of array except self : [24, 12, 8, 6]
 * 
 */