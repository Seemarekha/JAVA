/*
Given an integer n, return the number of trailing zeroes in n!.

Note that n! = n * (n - 1) * (n - 2) * ... * 3 * 2 * 1.


Example 1:

Input: n = 3
Output: 0
Explanation: 3! = 6, no trailing zero.


Example 2:

Input: n = 5
Output: 1
Explanation: 5! = 120, one trailing zero.


Example 3:

Input: n = 0
Output: 0
 */

package com.Problems;

public class Factorial_Trailing_Zeroes {

	public static void main(String[] args) {
		System.out.println(trailingZeroes(3)); // 0
		System.out.println(trailingZeroes(5)); // 1
		System.out.println(trailingZeroes(0)); // 0
		System.out.println(trailingZeroes(25)); // 6

	}

	private static int trailingZeroes(int n) {
		int count = 0;

		while (n > 0) {
			n = n / 5;
			count += n;
		}

		return count;
	}

}
