/*
Given n integers, 
find the minimum number of elements such that the lcm of the selected elements is equals to lcm of entire array.

Example

Input:

[2, 3, 4, 12]

Process:

Start LCM = 1

Take 2  -> LCM = 2
Take 3  -> LCM = 6
Take 4  -> LCM = 12
Done

Answer:

3
 */

package com.Problems;

public class Minimum_Elements_For_LCM {

	public static void main(String[] args) {
		int[] arr = { 2, 3, 4, 12 };

		int n = arr.length;

		int totalLcm = arr[0];
		for (int i = 1; i < n; i++) {
			totalLcm = lcm(totalLcm, arr[i]);
		}

		int currLcm = 1;
		int count = 0;

		for (int num : arr) {
			int newLcm = lcm(currLcm, num);
			if (newLcm != currLcm) {
				currLcm = newLcm;
				count++;
			}
			if (currLcm == totalLcm)
				break;
		}

		System.out.println(count);  // 3

	}

	private static int lcm(int a, int b) {
		return (a / gcd(a, b)) * b;
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}

}
