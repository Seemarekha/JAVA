package com.Problems;

public class Smallest_Window_SubString {

	public static void main(String[] args) {
		String s = "ADOBECODEBANC";
		String p = "ABC";

		String res = smallestWindowSubString(s, p);
		System.out.println("Smallest window containing all characters of P: " + res); // "BANC"

	}

	private static String smallestWindowSubString(String s, String p) {

		if (s.length() < p.length())
			return "";

		int[] targetFreq = new int[256];
		int[] windowFreq = new int[256];

		for (char c : p.toCharArray())
			targetFreq[c]++;

		int start = 0, minStart = 0, minLen = Integer.MAX_VALUE;
		int count = 0;

		for (int end = 0; end < s.length(); end++) {
			char c = s.charAt(end);
			windowFreq[c]++;

			if (targetFreq[c] != 0 && windowFreq[c] <= targetFreq[c])
				count++;

			while (count == p.length()) {
				if (end - start + 1 < minLen) {
					minLen = end - start + 1;
					minStart = start;
				}

				char startChar = s.charAt(start);
				windowFreq[startChar]--;

				if (targetFreq[startChar] != 0 && windowFreq[startChar] < targetFreq[startChar])
					count--;

				start++;
			}
		}
		return (minLen == Integer.MAX_VALUE) ? "" : s.substring(minStart, minStart + minLen);
	}

}
