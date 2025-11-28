package com.Problems;

public class LongestRepeatingCharacterReplacement {

	public static void main(String[] args) {
		String s = "AABABBA";
		int k = 1;

		System.out.println("Longest repeating substring length = " + characterReplacement(s, k)); // 4

	}

	private static int characterReplacement(String s, int k) {
		int[] freq = new int[26];
		int left = 0, maxFreq = 0, maxLen = 0;

		for (int right = 0; right < s.length(); right++) {
			char c = s.charAt(right);
			freq[c - 'A']++;

			maxFreq = Math.max(maxFreq, freq[c - 'A']);

			while ((right - left + 1) - maxFreq > k) {
				freq[s.charAt(left) - 'A']--;
				left++;
			}

			maxLen = Math.max(maxLen, right - left + 1);
		}
		return maxLen;
	}

}
