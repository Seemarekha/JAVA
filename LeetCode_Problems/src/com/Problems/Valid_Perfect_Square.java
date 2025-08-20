/*
Given a positive integer num, return true if num is a perfect square or false otherwise.

A perfect square is an integer that is the square of an integer. In other words, it is the product of some integer with itself.

You must not use any built-in library function, such as sqrt.

 

Example 1:

Input: num = 16
Output: true
Explanation: We return true because 4 * 4 = 16 and 4 is an integer.
Example 2:

Input: num = 14
Output: false
Explanation: We return false because 3.742 * 3.742 = 14 and 3.742 is not an integer.

 */

package com.Problems;

public class Valid_Perfect_Square {

	public static void main(String[] args) {
		System.out.println(isPerfectSquare(16)); // true
		System.out.println(isPerfectSquare(14)); // false
		System.out.println(isPerfectSquare(64)); // true
	}

	private static boolean isPerfectSquare(int n) {
		if (n < 2)
			return true;

		long left = 2, right = n / 2;
		while (left <= right) {
			long mid = left + (right - left) / 2;
			long square = mid * mid;

			if (square == n)
				return true;
			else if (square < n)
				left = mid + 1;
			else
				right = mid - 1;
		}
		return false;
	}

}
