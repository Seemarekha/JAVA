package com.array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class RemoveElementPresentBeforeGivenIndex {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40, 50, 60, 70 };

		System.out.println("Given array : " + Arrays.toString(a));
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter index no. : ");
		int index = scn.nextInt();

		if (index < 0 || index > a.length - 1)
			throw new IndexOutOfBoundsException();
		else {
			int[] res = removeEleBeforeIndex(a, index);
			System.out.println("After removing elements present before given index : " + Arrays.toString(res));
		}

	}

	private static int[] removeEleBeforeIndex(int[] a, int index) {
		int newlen = a.length - index;
		int[] res = new int[newlen];

		System.arraycopy(a, index, res, 0, newlen);
		return res;
	}

}
