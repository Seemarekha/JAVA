package com.Patterns;

import java.util.Scanner;

public class Pattern_14 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();
		for (int i = n; i >= 1; i--) {
			for (int j = i; j >= 1; j--) {
				if (j == i || j == 1 || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}

/******************** Output ****************/

/*

Enter number of lines : 5


* * * * * 
*     * 
*   * 
* * 
* 


*/