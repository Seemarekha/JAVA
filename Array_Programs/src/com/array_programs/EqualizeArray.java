package com.array_programs;

import java.util.Scanner;

public class EqualizeArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);

		System.out.print("Enter the size of the array: ");
		int n = scn.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the elements of the array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		if (canMakeEqual(arr)) {
			System.out.println("Yes, all numbers can be made equal.");
		} else {
			System.out.println("No, all numbers cannot be made equal.");
		}

	}

	private static boolean canMakeEqual(int[] arr) {
		int n = arr.length;
		if (n < 2)
			return true;

		int base = arr[0];
		int gcdValue = Math.abs(arr[1] - base);

		for (int i = 1; i < n; i++) {
			gcdValue = gcd(gcdValue, Math.abs(arr[i] - base));
		}

		return gcdValue != 0;
	}

	private static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
}


/*

Output :


Enter the elements of the array:
10
20
30
40
Yes, all numbers can be made equal.

*/