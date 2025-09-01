/*
Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.

Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:

Input: x = 123
Output: 321


Example 2:

Input: x = -123
Output: -321


Example 3:

Input: x = 120
Output: 21
 */

package com.Problems;

public class Reverse_Integer {

	public static void main(String[] args) {
		int x1 = 123;
		int x2 = -123;
		int x3 = 120;
		int x4 = 1534236469;

		System.out.println("Input: " + x1 + " → Output: " + reverse(x1)); // Input: 123 → Output: 321
		System.out.println("Input: " + x2 + " → Output: " + reverse(x2)); // Input: -123 → Output: -321
		System.out.println("Input: " + x3 + " → Output: " + reverse(x3)); // Input: 120 → Output: 21
		System.out.println("Input: " + x4 + " → Output: " + reverse(x4)); // Input: 1534236469 → Output: 0

	}

	private static int reverse(int x) {
		int rev = 0;

		while (x != 0) {
			int d = x % 10;
			x /= 10;

			if (rev > Integer.MAX_VALUE / 10 || (rev == Integer.MAX_VALUE / 10 && rev > 7))
				return 0;
			if (rev < Integer.MIN_VALUE / 10 || (rev == Integer.MIN_VALUE / 10 && rev < -8))
				return 0;

			rev = rev * 10 + d;
		}
		return rev;
	}

}
