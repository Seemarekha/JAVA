package com.OtherNumberPrograms;

import java.util.Scanner;

public class GreatestNumberOfThreeNumber {

	public static void main(String[] args) {

		Scanner scn = new Scanner(System.in);

		System.out.println("Enter 1st number :");
		int a = scn.nextInt();

		System.out.println("Enter 2nd number :");
		int b = scn.nextInt();

		System.out.println("Enter 3rd number :");
		int c = scn.nextInt();

		int greatNo = a;

		if (b > greatNo)
			greatNo = b;

		if (c > greatNo)
			greatNo = c;

		System.out.println("Greatest number among three given number : " + greatNo);
	}

}
