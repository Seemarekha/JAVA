package com.OtherNumberPrograms;

import java.util.Scanner;

public class PositiveOrNegativeNumber {

	public static void main(String[] args) {

		System.out.println("Enter a number: ");
		int n = new Scanner(System.in).nextInt();

		if (n == 0)
			System.out.println("Zero");
		else {
			String res = n > 0 ? "Positive Number" : "Negative Number";
			System.out.println(res);
		}
	}

}
