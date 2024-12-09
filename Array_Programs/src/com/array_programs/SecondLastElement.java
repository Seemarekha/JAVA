package com.array_programs;

public class SecondLastElement {

	public static void main(String[] args) {
		int[] arr = { 34, 87, 56, 45, 12, 90 };
		for (int i = 0; i < arr.length; i++) {
			if (i == arr.length - 2)
				System.out.println("Second last element present in given array: " + arr[i]);
		}

	}

}
