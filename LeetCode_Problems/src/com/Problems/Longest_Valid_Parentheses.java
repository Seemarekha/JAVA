/*
Given a string containing just the characters '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

Example 1:

Input: s = "(()"
Output: 2
Explanation: The longest valid parentheses substring is "()".


Example 2:

Input: s = ")()())"
Output: 4
Explanation: The longest valid parentheses substring is "()()".


Example 3:

Input: s = ""
Output: 0
 */

package com.Problems;

import java.util.Stack;

public class Longest_Valid_Parentheses {

	public static void main(String[] args) {
		System.out.println(longestValidParentheses("(()")); // 2
		System.out.println(longestValidParentheses(")()())")); // 4
		System.out.println(longestValidParentheses("")); // 0
		System.out.println(longestValidParentheses("(())")); // 4
		System.out.println(longestValidParentheses(")()(")); // 2

	}

	private static int longestValidParentheses(String s) {
		int maxLen = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(-1);

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == '(') {
				stack.push(i);
			} else {
				stack.pop();
				if (stack.isEmpty()) {
					stack.push(i);
				} else {
					maxLen = Math.max(maxLen, i - stack.peek());
				}
			}
		}

		return maxLen;
	}

}
