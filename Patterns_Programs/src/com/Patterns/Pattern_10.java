package com.Patterns;

import java.util.Scanner;

public class Pattern_10 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
		}

	}

}


/******************* Output *****************/

/*

Enter number of lines: 5


* 
* * 
*   * 
*     * 
* * * * * 


*/