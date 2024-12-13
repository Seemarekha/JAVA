package com.array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class DeleteElementAtSpecifiedIndex {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 4, 8, 9, 3 };
		System.out.println("Given Array : " + Arrays.toString(arr));

		System.out.println("Enter index value : ");
		int index = new Scanner(System.in).nextInt();

		if (index < 0 || index >= arr.length) {
			System.out.println("Invalid index");
			return;
		}

		int[] newArr = new int[arr.length - 1];

		System.arraycopy(arr, 0, newArr, 0, index);
		System.arraycopy(arr, index + 1, newArr, index, arr.length - index - 1);

		System.out.println("New Array : " + Arrays.toString(newArr));

	}

}
