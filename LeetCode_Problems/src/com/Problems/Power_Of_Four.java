/*
Given an integer n, return true if it is a power of four. Otherwise, return false.

An integer n is a power of four, if there exists an integer x such that n == 4x.


Example 1:

Input: n = 16
Output: true


Example 2:

Input: n = 5
Output: false


Example 3:

Input: n = 1
Output: true

 */

package com.Problems;

public class Power_Of_Four {

	public static void main(String[] args) {
		System.out.println(isPowerOfFour(16)); // true
		System.out.println(isPowerOfFour(0)); // false
		System.out.println(isPowerOfFour(5)); // false
		System.out.println(isPowerOfFour(64)); // true
	}

	private static boolean isPowerOfFour(int n) {
		if (n == 1)
			return true;
		if (n <= 0 || n % 4 != 0)
			return false;
		return isPowerOfFour(n / 4);
	}

}
