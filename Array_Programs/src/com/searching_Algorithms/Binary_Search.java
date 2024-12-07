package com.searching_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 3, 8, 12, 9, 15, 10, 13 };
		System.out.println(Arrays.toString(a));

		System.out.print("Enter element u want to search in given array : ");
		int key = new Scanner(System.in).nextInt();

		int n = search(a, key, 0, a.length - 1);
		System.out.println(key + " present in the index number : " + n);
	}

	static int search(int[] a, int key, int start, int end) {

		if (start > end)
			return -1;

		int mid = (start + end) / 2;

		if (key == a[mid])
			return mid;
		else if (key < a[mid])
			return search(a, key, start, mid - 1);
		else
			return search(a, key, mid + 1, end);

	}

}
