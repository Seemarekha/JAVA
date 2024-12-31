package com.CodesForRecursion;

import java.util.Scanner;

public class PrintF_NthTerm {

	public static void main(String[] args) {
		System.out.println("Enter a value for n:");
		int n = new Scanner(System.in).nextInt();
		System.out.println("F(n)th term : "+term(1, 1, n));
	}

	private static int term(int calculated, int current, int n) {
		int i, curr = 1;
		if (current == n + 1)
			return 0;
		for (i = calculated; i < calculated + current; i++) {
			curr *= i;
		}
		return curr + term(i, current + 1, n);
	}

}
