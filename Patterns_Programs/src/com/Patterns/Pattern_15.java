package com.Patterns;

import java.util.Scanner;

public class Pattern_15 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();

		int sp = n - 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= i; j++) {
				if (j == 1 || j == i || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			sp--;
		}

	}

}


/***************** Output ***************/

/*

Enter number of lines : 5


        * 
      * * 
    *   * 
  *     * 
* * * * * 

*/
