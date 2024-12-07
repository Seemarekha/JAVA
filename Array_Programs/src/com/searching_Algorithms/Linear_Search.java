package com.searching_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Linear_Search {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 3, 8, 12, 9, 15, 10, 13 };
		System.out.println(Arrays.toString(a));

		System.out.print("Enter element u want to search in given array : ");
		int key = new Scanner(System.in).nextInt();

		int n = search(a, key);
		System.out.println(key + " present in the index number : " + n);

	}

	static int search(int[] a, int key) {

		for (int i = 0; i < a.length; i++) {
			if (a[i] == key)
				return i;
		}
		return -1;
	}

}
