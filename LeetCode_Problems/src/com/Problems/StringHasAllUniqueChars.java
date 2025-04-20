package com.Problems;

import java.util.Scanner;

public class StringHasAllUniqueChars {

	public static void main(String[] args) {
		System.out.print("Enter a string : ");
		String str = new Scanner(System.in).next();
		System.out.println(allUnique(str));

	}

	private static boolean allUnique(String str) {
		boolean[] arr = new boolean[256];
		for (char c : str.toCharArray()) {
			if (arr[c])
				return false;
			arr[c] = true;
		}
		return true;
	}

}
