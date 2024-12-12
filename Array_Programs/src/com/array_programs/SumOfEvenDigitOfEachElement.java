package com.array_programs;

import java.util.Arrays;

public class SumOfEvenDigitOfEachElement {

	public static void main(String[] args) {
		int[] a = { 461, 235, 124, 360, 1 };
		System.out.println(Arrays.toString(a));
		evenDigitSum(a);
		System.out.println("Sum of even digit of each element present in array : "+Arrays.toString(a));

	}

	private static void evenDigitSum(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = sum(a[i]);
		}

	}

	private static int sum(int n) {
		int sum = 0;
		while (n > 0) {
			int r = n % 10;
			if (r % 2 == 0)
				sum += r;
			n /= 10;
		}
		return sum;
	}

}
