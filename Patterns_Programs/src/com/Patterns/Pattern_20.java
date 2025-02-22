package com.Patterns;

import java.util.Scanner;

public class Pattern_20 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();
		int star = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= star; j++) {
				System.out.print(" * ");
			}
			System.out.println();
			if (i <= n / 2)
				star++;
			else
				star--;
		}

	}

}



/****************** Output *************/


/*

Enter number of lines : 5

 * 
 *  * 
 *  *  * 
 *  * 
 * 

*/
