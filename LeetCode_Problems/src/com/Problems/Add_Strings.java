/*

Given two non-negative integers, num1 and num2 represented as string, return the sum of num1 and num2 as a string.

You must solve the problem without using any built-in library for handling large integers (such as BigInteger). You must also not convert the inputs to integers directly.

 
Example 1:

Input: num1 = "11", num2 = "123"
Output: "134"
Example 2:

Input: num1 = "456", num2 = "77"
Output: "533"
Example 3:

Input: num1 = "0", num2 = "0"
Output: "0"

 */

package com.Problems;

public class Add_Strings {

	public static void main(String[] args) {
		System.out.println(addStrings("11", "123")); // Output: "134"
		System.out.println(addStrings("456", "77")); // Output: "533"
		System.out.println(addStrings("0", "0")); // Output: "0"

	}

	private static String addStrings(String num1, String num2) {

		int i = num1.length() - 1;
		int j = num2.length() - 1;
		int carry = 0;

		StringBuilder res = new StringBuilder();

		while (i >= 0 || j >= 0 || carry != 0) {
			int d1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
			int d2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

			int sum = d1 + d2 + carry;

			res.append(sum % 10);
			carry = sum / 10;

			i--;
			j--;
		}
		return res.reverse().toString();
	}

}