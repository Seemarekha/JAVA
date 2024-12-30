package com.CodesForRecursion;

import java.util.Scanner;

public class AllPermutationsOfString {

	public static void main(String[] args) {
		System.out.println("Enter a string :");
		String str = new Scanner(System.in).next();
		permutations(str, "");

	}

	private static void permutations(String str, String ans) {
		if (str.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i);
			String r = str.substring(0, i) + str.substring(i + 1);
			permutations(r, ans + c);
		}
	}

}
