package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Three_Sum {

	public static void main(String[] args) {
		int[] arr = { -5, -5, -3, 0, 0, 1, 1, 2, 5 };
		System.out.println("Given array : " + Arrays.toString(arr));
		List<List<Integer>> res = threeSum(arr);
		System.out.println("Three sum that returns 0 as output : " + res);

	}

	private static List<List<Integer>> threeSum(int[] arr) {

		Arrays.sort(arr);
		List<List<Integer>> result = new ArrayList<List<Integer>>();

		for (int i = 0; i < arr.length && arr[i] <= 0; i++) {
			if (i == 0 || arr[i] != arr[i - 1]) {
				twoSum(arr, i, result);
			}
		}
		return result;
	}

	private static void twoSum(int[] arr, int i, List<List<Integer>> result) {

		int left = i + 1;
		int right = arr.length - 1;

		while (left < right) {
			int sum = arr[i] + arr[left] + arr[right];
			if (sum < 0) {
				left++;
			} else if (sum > 0) {
				right--;
			} else {
				result.add(Arrays.asList(arr[i], arr[left++], arr[right--]));
				while (left < right && arr[left] == arr[left - 1]) {
					++left;
				}
			}
		}

	}

}


/********************* Output ***********************/

/*


Given array : [-5, -5, -3, 0, 0, 1, 1, 2, 5]
Three sum that returns 0 as output : [[-5, 0, 5], [-3, 1, 2]]



*/
