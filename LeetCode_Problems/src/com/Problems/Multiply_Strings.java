/*
Given two non-negative integers num1 and num2 represented as strings, return the product of num1 and num2, also represented as a string.

Note: You must not use any built-in BigInteger library or convert the inputs to integer directly.


Example 1:

Input: num1 = "2", num2 = "3"
Output: "6"


Example 2:

Input: num1 = "123", num2 = "456"
Output: "56088"
 */

package com.Problems;

public class Multiply_Strings {

	public static void main(String[] args) {
		System.out.println(multiply("2", "3")); // Output: "6"
		System.out.println(multiply("123", "456")); // Output: "56088"

	}

	private static String multiply(String s1, String s2) {
		if (s1.equals("0") || s2.equals("0"))
			return "0";

		int n1 = s1.length();
		int n2 = s2.length();
		int[] res = new int[n1 + n2];

		for (int i = n1 - 1; i >= 0; i--) {
			for (int j = n2 - 1; j >= 0; j--) {
				int digit1 = s1.charAt(i) - '0';
				int digit2 = s2.charAt(j) - '0';

				int product = digit1 * digit2;

				int sum = product + res[i + j + 1];

				res[i + j + 1] = sum % 10;
				res[i + j] += sum / 10;
			}
		}

		StringBuilder sb = new StringBuilder();
		for (int num : res) {
			if (!(sb.length() == 0 && num == 0))
				sb.append(num);
		}
		return sb.length() == 0 ? "0" : sb.toString();
	}

}
