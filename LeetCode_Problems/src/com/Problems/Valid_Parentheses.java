package com.Problems;

import java.util.Stack;

public class Valid_Parentheses {

	public static void main(String[] args) {
		System.out.println(validParentheses("{}[()]")); // true
		System.out.println(validParentheses("{[(){]")); // false
	}

	private static boolean validParentheses(String s) {

		Stack<Character> stack = new Stack<Character>();
		for (char c : s.toCharArray()) {
			if (c == '[' || c == '{' || c == '(')
				stack.push(c);
			else {
				if (stack.isEmpty())
					return false;
				char top = stack.pop();
				if ((c == ']' && top != '[') || (c == '}' && top != '{') || (c == ')' && top != '('))
					return false;
			}
		}

		return stack.isEmpty();
	}

}
