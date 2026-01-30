/*
Given a string s representing a valid expression, implement a basic calculator to evaluate it, and return the result of the evaluation.

Note: You are not allowed to use any built-in function which evaluates strings as mathematical expressions, such as eval().


Example 1:

Input: s = "1 + 1"
Output: 2


Example 2:

Input: s = " 2-1 + 2 "
Output: 3


Example 3:

Input: s = "(1+(4+5+2)-3)+(6+8)"
Output: 23
 */

package com.Problems;

import java.util.Stack;

public class Basic_Calculator {

	public static void main(String[] args) {
		System.out.println(calculate("1 + 1")); // 2
		System.out.println(calculate(" 2-1 + 2 ")); // 3
		System.out.println(calculate("(1+(4+5+2)-3)+(6+8)")); // 23
	}

	private static int calculate(String s) {
		int res = 0, sign = 1, num = 0;

		Stack<Integer> stack = new Stack<Integer>();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			if (Character.isDigit(ch)) {
				num = num * 10 + (ch - '0');
			} else if (ch == '+') {
				res += sign * num;
				num = 0;
				sign = 1;
			} else if (ch == '-') {
				res += sign * num;
				num = 0;
				sign = -1;
			} else if (ch == '(') {
				stack.push(res);
				stack.push(sign);
				res = 0;
				sign = 1;
			} else if (ch == ')') {
				res += sign * num;
				num = 0;
				res *= stack.pop();
				res += stack.pop();
			}
		}
		return res + sign * num;
	}

}
