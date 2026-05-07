/*
Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.

Example 1:

Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]


Example 2:

Input: n = 1
Output: ["()"]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Generate_Parentheses {

	public static void main(String[] args) {
		System.out.println(generateParenthesis(3)); // [((())), (()()), (())(), ()(()), ()()()]
		System.out.println(generateParenthesis(1)); // [()]

	}

	private static List<String> generateParenthesis(int n) {
		List<String> res = new ArrayList<String>();
		backTrack(res, "", 0, 0, n);
		return res;
	}

	private static void backTrack(List<String> res, String current, int open, int close, int max) {
		if (current.length() == max * 2) {
			res.add(current);
			return;
		}

		if (open < max) {
			backTrack(res, current + "(", open + 1, close, max);
		}

		if (close < open) {
			backTrack(res, current + ")", open, close + 1, max);
		}

	}

}
