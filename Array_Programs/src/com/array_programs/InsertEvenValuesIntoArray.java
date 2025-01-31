package com.array_programs;

import java.util.ArrayList;
import java.util.Scanner;

public class InsertEvenValuesIntoArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		ArrayList<Integer> evenValues = new ArrayList<Integer>();
		System.out.print("Enter number of element u want to insert: ");
		int n = scn.nextInt();
		System.out.println("Enter values: ");
		for (int i = 0; i < n; i++) {
			int value = scn.nextInt();
			if (value % 2 == 0)
				evenValues.add(value);
		}
		System.out.println("Even values in array: "+evenValues);

	}

}
