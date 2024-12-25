package com.OtherNumberPrograms;

import java.util.Scanner;

public class LeapYearOrNot {

	public static void main(String[] args) {

		System.out.println("Enter year:");
		int y = new Scanner(System.in).nextInt();

		if ((y % 400 == 0) || ((y % 4 == 0) && (y % 100 != 0)))
			System.out.println(y + " is a Leap year");
		else
			System.out.println(y + " is Not a Leap year");

	}

}
