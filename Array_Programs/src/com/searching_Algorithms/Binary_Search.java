package com.searching_Algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Binary_Search {

	public static void main(String[] args) {

		int[] a = { 2, 4, 6, 8, 9, 10, 13, 15 };
		System.out.println(Arrays.toString(a));

		System.out.print("Enter element u want to search in given array : ");
		int key = new Scanner(System.in).nextInt();

		int n = search(a, key, 0, a.length - 1);
		System.out.println(key + " present in the index number : " + n);
	}

	static int search(int[] a, int key, int start, int end) {
		while (start <= end) {

			int mid = (start + end) / 2;

			if (key == a[mid])
				return mid;
			else if (key < a[mid])
				end = mid - 1;
			else
				start = mid + 1;
		}
		return -1;

	}

}
