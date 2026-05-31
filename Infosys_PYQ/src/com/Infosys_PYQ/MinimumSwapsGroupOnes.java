/*
Problem

Given a binary string/array:

Group all:

1s together
OR
same characters together

using minimum swaps.

Example
arr = [1,0,1,0,1]

Output:

1

Because one swap groups all 1s.
 */

package com.Infosys_PYQ;

public class MinimumSwapsGroupOnes {

	public static void main(String[] args) {
		int[] arr = { 1, 0, 1, 0, 1 };

		System.out.println(minSwaps(arr)); // 1
	}

	private static int minSwaps(int[] arr) {
		int ones = 0;
		for (int num : arr) {
			if (num == 1)
				ones++;
		}

		if (ones <= 1)
			return 0;

		int currOnes = 0;

		for (int i = 0; i < ones; i++) {
			if (arr[i] == 1)
				currOnes++;
		}

		int maxOnes = currOnes;

		for (int i = ones; i < arr.length; i++) {
			if (arr[i] == 1)
				currOnes++;

			if (arr[i - ones] == 1)
				currOnes--;

			maxOnes = Math.max(maxOnes, currOnes);
		}

		return ones - maxOnes;
	}

}
