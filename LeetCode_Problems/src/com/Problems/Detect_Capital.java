/*
We define the usage of capitals in a word to be right when one of the following cases holds:

All letters in this word are capitals, like "USA".
All letters in this word are not capitals, like "leetcode".
Only the first letter in this word is capital, like "Google".
Given a string word, return true if the usage of capitals in it is right.


Example 1:

Input: word = "USA"
Output: true


Example 2:

Input: word = "FlaG"
Output: false

 */

package com.Problems;

public class Detect_Capital {

	public static void main(String[] args) {
		System.out.println(detectCapitalUse("USA")); // true
		System.out.println(detectCapitalUse("Google")); // true
		System.out.println(detectCapitalUse("FlaG")); // false

	}

	private static boolean detectCapitalUse(String word) {
		int capitalCount = 0;

		for (char c : word.toCharArray()) {
			if (Character.isUpperCase(c))
				capitalCount++;
		}
		if (capitalCount == word.length() || capitalCount == 0
				|| (capitalCount == 1 && Character.isUpperCase(word.charAt(0))))
			return true;
		return false;
	}

}
