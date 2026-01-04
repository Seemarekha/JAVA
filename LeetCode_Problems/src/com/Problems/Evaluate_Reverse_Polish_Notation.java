/*
You are given an array of strings tokens that represents an arithmetic expression in a Reverse Polish Notation.

Evaluate the expression. Return an integer that represents the value of the expression.

Note that:

The valid operators are '+', '-', '*', and '/'.
Each operand may be an integer or another expression.
The division between two integers always truncates toward zero.
There will not be any division by zero.
The input represents a valid arithmetic expression in a reverse polish notation.
The answer and all the intermediate calculations can be represented in a 32-bit integer.
 

Example 1:

Input: tokens = ["2","1","+","3","*"]
Output: 9
Explanation: ((2 + 1) * 3) = 9


Example 2:

Input: tokens = ["4","13","5","/","+"]
Output: 6
Explanation: (4 + (13 / 5)) = 6


Example 3:

Input: tokens = ["10","6","9","3","+","-11","*","/","*","17","+","5","+"]
Output: 22
Explanation: ((10 * (6 / ((9 + 3) * -11))) + 17) + 5
= ((10 * (6 / (12 * -11))) + 17) + 5
= ((10 * (6 / -132)) + 17) + 5
= ((10 * 0) + 17) + 5
= (0 + 17) + 5
= 17 + 5
= 22
 */
package com.Problems;

import java.util.Stack;

public class Evaluate_Reverse_Polish_Notation {

	public static void main(String[] args) {
		String[] tokens1 = { "2", "1", "+", "3", "*" };
		System.out.println(evalRPN(tokens1)); // 9

		String[] tokens2 = { "4", "13", "5", "/", "+" };
		System.out.println(evalRPN(tokens2)); // 6

		String[] tokens3 = { "10", "6", "9", "3", "+", "-11", "*", "/", "*", "17", "+", "5", "+" };
		System.out.println(evalRPN(tokens3)); // 22

	}

	private static int evalRPN(String[] tokens) {
		Stack<Integer> stack = new Stack<>();

		for (String token : tokens) {
			if (token.equals("+") || token.equals("-") || token.equals("*") || token.equals("/")) {
				int b = stack.pop();
				int a = stack.pop();
				int result = 0;

				switch (token) {
				case "+":
					result = a + b;
					break;
				case "-":
					result = a - b;
					break;
				case "*":
					result = a * b;
					break;
				case "/":
					result = a / b;
					break;
				}

				stack.push(result);
			} else {
				stack.push(Integer.parseInt(token));
			}

		}
		return stack.pop();
	}

}
