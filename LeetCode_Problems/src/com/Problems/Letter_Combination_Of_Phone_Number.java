/*
Given a string containing digits from 2-9 inclusive, return all possible letter combinations that the number could represent. Return the answer in any order.

A mapping of digits to letters (just like on the telephone buttons) is given below. Note that 1 does not map to any letters.


Example 1:

Input: digits = "23"
Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]


Example 2:

Input: digits = "2"
Output: ["a","b","c"]
 */

package com.Problems;

import java.util.ArrayList;
import java.util.List;

public class Letter_Combination_Of_Phone_Number {

	public static void main(String[] args) {
		String digits = "23"; // You can change this input to test
		List<String> combinations = letterCombinations(digits);
		System.out.println("Input Digits: " + digits); // 23
		System.out.println("Possible Combinations: " + combinations); // [ad, ae, af, bd, be, bf, cd, ce, cf]

	}

	private static List<String> letterCombinations(String digits) {
		List<String> res = new ArrayList<String>();
		if (digits == null || digits.length() == 0)
			return res;

		String[] mapping = { "", "", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz" };

		backTrack(res, digits, mapping, new StringBuilder(), 0);
		return res;
	}

	private static void backTrack(List<String> res, String digits, String[] mapping, StringBuilder combination,
			int index) {

		if (index == digits.length()) {
			res.add(combination.toString());
			return;
		}

		String letters = mapping[digits.charAt(index) - '0'];

		for (char ch : letters.toCharArray()) {
			combination.append(ch);
			backTrack(res, digits, mapping, combination, index + 1);
			combination.deleteCharAt(combination.length() - 1);
		}

	}

}
