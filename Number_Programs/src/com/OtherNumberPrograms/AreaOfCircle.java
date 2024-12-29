package com.OtherNumberPrograms;

import java.util.Scanner;

public class AreaOfCircle {

	public static void main(String[] args) {

		System.out.println("Enter radius :");
		int r = new Scanner(System.in).nextInt();

		double area = 3.14 * r * r;
		System.out.println("Area of circle : " + area);

	}

}
