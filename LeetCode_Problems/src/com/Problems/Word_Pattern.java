package com.Problems;

import java.util.HashMap;
import java.util.Map;

public class Word_Pattern {

	public static void main(String[] args) {
		System.out.println(wordPattern("abba", "dog cat cat dog")); // true
		System.out.println(wordPattern("abba", "dog cat cat fish")); // false
		System.out.println(wordPattern("aaaa", "dog dog dog dog")); // true
		System.out.println(wordPattern("abba", "dog dog dog dog")); // false

	}

	private static boolean wordPattern(String pattern, String s) {
		String[] words = s.split(" ");

		if (words.length != pattern.length())
			return false;

		Map<Character, String> charToWord = new HashMap<Character, String>();
		Map<String, Character> wordToChar = new HashMap<String, Character>();

		for (int i = 0; i < pattern.length(); i++) {
			char c = pattern.charAt(i);
			String word = words[i];

			if (charToWord.containsKey(c)) {
				if (!charToWord.get(c).equals(word))
					return false;
			} else {
				charToWord.put(c, word);
			}

			if (wordToChar.containsKey(word)) {
				if (wordToChar.get(word) != c)
					return false;
			} else {
				wordToChar.put(word, c);
			}

		}

		return true;
	}

}
