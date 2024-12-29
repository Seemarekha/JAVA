package com.OtherNumberPrograms;

import java.util.Scanner;

public class NumberOfDaysInGivenMonthOfYear {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter a year : ");
		int y = scn.nextInt();
		System.out.println("Enter month :");
		int m = scn.nextInt();

		if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
			System.out.println("Number of days : 31 days");
		else if (m == 4 || m == 6 || m == 9 || m == 11)
			System.out.println("Number of days : 30 days");
		else if (m == 2) {
			if (y % 400 == 0 || (y % 4 == 0 && y % 100 != 0))
				System.out.println("Number of days : 29 days");
			else
				System.out.println("Number of days : 28 days");
		} else
			System.out.println("Invalid input!");

	}

}
