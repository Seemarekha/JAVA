/*
Given an integer num, repeatedly add all its digits until the result has only one digit, and return it.

Example 1:

Input: num = 38
Output: 2
Explanation: The process is
38 --> 3 + 8 --> 11
11 --> 1 + 1 --> 2 
Since 2 has only one digit, return it.
Example 2:

Input: num = 0
Output: 0

 */

package com.Problems;

public class Add_Digits {

	public static void main(String[] args) {
		System.out.println(addDigits(38));  // 2
		System.out.println(addDigits(0));  //0
	}

	private static int addDigits(int n) {
		int sum = 0;
		do {
			while (n > 0) {
				sum += n % 10;
				n /= 10;
			}
			n = sum;
			sum = 0;
		} while (n > 9);
		return n;
	}

}
