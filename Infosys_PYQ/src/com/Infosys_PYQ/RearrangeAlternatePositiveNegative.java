/*
Problem

Given an array containing positive and negative numbers,

rearrange it such that:

positive and negative numbers appear alternately

Example:

Input:
[-1, 2, -3, 4, -5, 6]

Output:
[-1, 2, -3, 4, -5, 6]

Another:

Input:
[1, 2, 3, -4, -1, 4]

Output:
[-4, 1, -1, 2, 3, 4]
 */

package com.Infosys_PYQ;

import java.util.Arrays;

public class RearrangeAlternatePositiveNegative {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, -4, -1, 4 };

		rearrange(arr);

		System.out.println(Arrays.toString(arr));

	}

	private static void rearrange(int[] arr) {
		int n = arr.length;
		int j = 0;

		for (int i = 0; i < n; i++) {
			if (arr[i] < 0) {
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;

				j++;
			}
		}

		int neg = 0;
		int pos = j;

		while (neg < pos && pos < n && arr[neg] < 0) {
			int temp = arr[neg];
			arr[neg] = arr[pos];
			arr[pos] = temp;

			neg += 2;
			pos++;
		}

	}

}
