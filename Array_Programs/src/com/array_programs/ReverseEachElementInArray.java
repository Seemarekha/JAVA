package com.array_programs;

import java.util.Arrays;

public class ReverseEachElementInArray {

	public static void main(String[] args) {
		int[] a = { 123, 543, 786, 891 };
		System.out.println(Arrays.toString(a));
		reverseArray(a);
		System.out.println(Arrays.toString(a));

	}

	private static int[] reverseArray(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = reverseNumber(a[i]);
		}
		return a;

	}

	private static int reverseNumber(int n) {
		int rev = 0;

		while (n > 0) {
			int r = n % 10;
			rev = rev * 10 + r;
			n /= 10;
		}
		return rev;
	}

}
