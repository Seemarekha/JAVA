package com.Problems;

public class Check_If_Number_Is_PowerOf_Two {

	public static void main(String[] args) {
		System.out.println(isPowerOf(16)); // true
		System.out.println(isPowerOf(20)); // false

	}

	private static boolean isPowerOf(int n) {

		return n > 0 && (n & (n - 1)) == 0;
	}

}
