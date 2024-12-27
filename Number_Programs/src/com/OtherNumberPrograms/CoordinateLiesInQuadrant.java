package com.OtherNumberPrograms;

import java.util.Scanner;

public class CoordinateLiesInQuadrant {

	public static void main(String[] args) {

		System.out.println("Insert the value for variable X and Y :");
		Scanner scn = new Scanner(System.in);

		int x = scn.nextInt();
		int y = scn.nextInt();

		if (x == 0 && y == 0)
			System.out.println("Points lies on Origin");
		else if (x != 0 && y == 0)
			System.out.println("Points lies on X-axis");
		else if (x == 0 && y != 0)
			System.out.println("Points lies on Y-axis");
		else if (x > 0 && y > 0)
			System.out.println("Points lies in Quadrant-I");
		else if (x < 0 && y > 0)
			System.out.println("Points lies in Quadrant-II");
		else if (x < 0 && y < 0)
			System.out.println("Points lies in Quadrant-III");
		else if (x > 0 && y < 0)
			System.out.println("Points lies in Quadrant-IV");
	}

}
