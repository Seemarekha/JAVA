/*
Given an integer num, return a string of its base 7 representation.


Example 1:

Input: num = 100
Output: "202"


Example 2:

Input: num = -7
Output: "-10"

 */

package com.Problems;

public class Base7Converter {

	public static void main(String[] args) {
		Base7Converter converter = new Base7Converter();

		System.out.println(converter.convertToBase7(100)); // Output: "202"
		System.out.println(converter.convertToBase7(-7)); // Output: "-10"

	}

	private String convertToBase7(int num) {
		if (num == 0)
			return "0";

		boolean isNegative = num < 0;
		num = Math.abs(num);

		StringBuilder sb = new StringBuilder();

		while (num > 0) {
			sb.append(num % 7);
			num /= 7;
		}
		if (isNegative)
			sb.append("-");

		return sb.reverse().toString();
	}

}
