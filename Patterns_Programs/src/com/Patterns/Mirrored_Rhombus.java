package com.Patterns;

import java.util.Scanner;

public class Mirrored_Rhombus {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter length : ");
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			for (int j = n; j >= i; j--)
				System.out.print("  ");
			for (int j = 1; j <= n; j++)
				System.out.print("* ");
			System.out.println();
		}

	}

}



/****************** Output ********************/

/*


Enter length : 4

         * * * * 
       * * * * 
     * * * * 
   * * * *


*/