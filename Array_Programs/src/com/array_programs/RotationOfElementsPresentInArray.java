package com.array_programs;

import java.util.Arrays;
import java.util.Scanner;

public class RotationOfElementsPresentInArray {

	public static void main(String[] args) {
		int[] a = { 10, 20, 30, 40 };
		System.out.println("Before rotation of array : " + Arrays.toString(a));
		System.out.print("Enter number of rotations : ");
		int r = new Scanner(System.in).nextInt();
		for (int i = 0; i <= r; i++) {
			rotate(a);
		}
		System.out.println("After rotation of array : " + Arrays.toString(a));

	}

	static void rotate(int[] a) {

		int len = a.length;
		int temp = a[len - 1];
		for (int i = len - 2; i >= 0; i--) {
			a[i + 1] = a[i];
		}
		a[0] = temp;
	}

}
