/*
Given an array of strings words, return the words that can be typed using letters of the alphabet on only one row of American keyboard like the image below.

Note that the strings are case-insensitive, both lowercased and uppercased of the same letter are treated as if they are at the same row.

In the American keyboard:

the first row consists of the characters "qwertyuiop",
the second row consists of the characters "asdfghjkl", and
the third row consists of the characters "zxcvbnm".

 

Example 1:

Input: words = ["Hello","Alaska","Dad","Peace"]

Output: ["Alaska","Dad"]

Explanation:

Both "a" and "A" are in the 2nd row of the American keyboard due to case insensitivity.

Example 2:

Input: words = ["omk"]

Output: []

Example 3:

Input: words = ["adsdf","sfd"]

Output: ["adsdf","sfd"]

 */

package com.Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Keyboard_Row {

	public static void main(String[] args) {

		Keyboard_Row krw = new Keyboard_Row();

		String[] words = { "Hello", "Alaska", "Dad", "Peace" };
		String[] result = krw.findWords(words);

		System.out.println(Arrays.toString(result));
		// Output: [Alaska, Dad]
	}

	private String[] findWords(String[] words) {
		String row1 = "qwertyuiop";
		String row2 = "asdfghjkl";
		String row3 = "zxcvbnm";

		List<String> res = new ArrayList<String>();

		for (String word : words) {
			String s = word.toLowerCase();
			if (isInOneRow(s, row1) || isInOneRow(s, row2) || isInOneRow(s, row3)) {
				res.add(word);
			}
		}
		return res.toArray(new String[0]);
	}

	private boolean isInOneRow(String word, String row) {
		for (char c : word.toCharArray()) {
			if (row.indexOf(c) == -1)
				return false;
		}
		return true;
	}

}
