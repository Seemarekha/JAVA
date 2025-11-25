
/*
Given two strings ransomNote and magazine, return true if ransomNote can be constructed by using the letters from magazine and false otherwise.

Each letter in magazine can only be used once in ransomNote.


Example 1:

Input: ransomNote = "a", magazine = "b"
Output: false


Example 2:

Input: ransomNote = "aa", magazine = "ab"
Output: false


Example 3:

Input: ransomNote = "aa", magazine = "aab"
Output: true

 */

package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class RansomNote {

	public static void main(String[] args) {

		String ransomNote = "aa";
		String magazine = "baa";

		System.out.println(canConstruct(ransomNote, magazine));  //true
	}

	private static boolean canConstruct(String ransomNote, String magazine) {
		Map<Character, Integer> magCount = new HashMap<Character, Integer>();

		for (char c : magazine.toCharArray()) {
			magCount.put(c, magCount.getOrDefault(c, 0) + 1);
		}

		for (char c : ransomNote.toCharArray()) {
			if (!magCount.containsKey(c) || magCount.get(c) == 0)
				return false;

			magCount.put(c, magCount.get(c) - 1);
		}
		return true;
	}

}
