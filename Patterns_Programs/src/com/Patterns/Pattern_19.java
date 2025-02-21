package com.Patterns;

import java.util.Scanner;

public class Pattern_19 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();
		int sp = 0;
		int star = n;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				if (i == 1 || j == 1 || j == star)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			sp++;
			star -= 2;
		}

	}

}



/****************** Output *************/


/*

Enter number of lines : 5

  * * * * * 
    *   * 
      * 

*/
