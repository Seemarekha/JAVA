package com.Problems;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Reverse_Vowels_Of_String {

	public static void main(String[] args) {
		System.out.println(reverseVowels("hello")); // Output: "holle"
		System.out.println(reverseVowels("leetcode")); // Output: "leotcede"
		System.out.println(reverseVowels("AEiou")); // Output: "uoiEA"

	}

	private static String reverseVowels(String s) {

		Set<Character> vowels = new HashSet<Character>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));

		char[] chars = s.toCharArray();
		int left = 0, right = chars.length - 1;

		while (left < right) {
			while (left < right && !vowels.contains(chars[left]))
				left++;

			while (left < right && !vowels.contains(chars[right]))
				right--;

			char temp = chars[left];
			chars[left] = chars[right];
			chars[right] = temp;

			left++;
			right--;
		}
		return new String(chars);
	}

}
