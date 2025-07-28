/*
 In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order. The order of the alphabet is some permutation of lowercase letters.

Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only if the given words are sorted lexicographically in this alien language.


Example 1:

Input: words = ["hello","leetcode"], order = "hlabcdefgijkmnopqrstuvwxyz"
Output: true
Explanation: As 'h' comes before 'l' in this language, then the sequence is sorted.
Example 2:

Input: words = ["word","world","row"], order = "worldabcefghijkmnpqstuvxyz"
Output: false
Explanation: As 'd' comes after 'l' in this language, then words[0] > words[1], hence the sequence is unsorted.
Example 3:

Input: words = ["apple","app"], order = "abcdefghijklmnopqrstuvwxyz"
Output: false
Explanation: The first three characters "app" match, and the second string is shorter (in size.) According to lexicographical rules "apple" > "app", because 'l' > '∅', where '∅' is defined as the blank character which is less than any other character (More info).

 */

package com.Problems;

public class Verifying_An_Alien_Dictionary {

	public static void main(String[] args) {
		System.out.println(isAlienSorted(new String[] { "hello", "leetcode" }, "hlabcdefgijkmnopqrstuvwxyz")); // true
		System.out.println(isAlienSorted(new String[] { "word", "world", "row" }, "worldabcefghijkmnpqstuvxyz")); // false
		System.out.println(isAlienSorted(new String[] { "apple", "app" }, "abcdefghijklmnopqrstuvwxyz")); // false

	}

	private static boolean isAlienSorted(String[] words, String order) {
		int[] charOrder = new int[26];
		for (int i = 0; i < order.length(); i++) {
			charOrder[order.charAt(i) - 'a'] = i;
		}

		// Step 2: Compare each adjacent pair of words
		for (int i = 0; i < words.length - 1; i++) {
			if (!inCorrectOrder(words[i], words[i + 1], charOrder)) {
				return false;
			}
		}

		return true;
	}

	private static boolean inCorrectOrder(String word1, String word2, int[] charOrder) {
		int len = Math.min(word1.length(), word2.length());

		for (int i = 0; i < len; i++) {
			char c1 = word1.charAt(i);
			char c2 = word2.charAt(i);

			if (c1 != c2) {
				return charOrder[c1 - 'a'] < charOrder[c2 - 'a'];
			}
		}
		return word1.length() <= word2.length();
	}

}
