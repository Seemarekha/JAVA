/*
Given an integer n, return true if it is a power of two. Otherwise, return false.

An integer n is a power of two, if there exists an integer x such that n == 2x.

Example 1:

Input: n = 1
Output: true
Explanation: 20 = 1


Example 2:

Input: n = 16
Output: true
Explanation: 24 = 16


Example 3:

Input: n = 3
Output: false

 */

package com.Problems;

public class Power_Of_Two {

	public static void main(String[] args) {
		System.out.println(isPowerOfTwo(1)); // true
		System.out.println(isPowerOfTwo(16)); // true
		System.out.println(isPowerOfTwo(3)); // false

	}

	private static boolean isPowerOfTwo(int n) {

		return (n > 0) && (n & (n - 1)) == 0;
	}

}
