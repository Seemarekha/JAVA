package com.Problems;

public class Implement_strstr_or_indexOf {

	public static void main(String[] args) {
		String s = "hello";
		String t = "ll";
		System.out.println("Index: " + strStr(s, t)); // 2

	}

	private static int strStr(String s, String needle) {
		int n = s.length(), m = needle.length();
		for (int i = 0; i <= n - m; i++) {
			if (s.substring(i, i + m).equals(needle))
				return i;
		}
		return -1;
	}

}
