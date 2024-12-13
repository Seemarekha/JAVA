package com.array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class InsertingElementAtSpecifiedIndex {

	public static void main(String[] args) {

		int[] arr = { 2, 6, 4, 8, 9, 3 };
		System.out.println("Given Array : " + Arrays.toString(arr));

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter element u want to insert : ");
		int n = scn.nextInt();

		System.out.println("Enter index value : ");
		int index = scn.nextInt();

		int[] newArr = new int[arr.length + 1];

		System.arraycopy(arr, 0, newArr, 0, index);

		newArr[index] = n;

		System.arraycopy(arr, index, newArr, index + 1, arr.length - index);

		System.out.println("New Array : " + Arrays.toString(newArr));

	}

}
