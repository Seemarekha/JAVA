package com.Patterns;

import java.util.Scanner;

public class Pattern_24 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();

		if (n % 2 == 0)
			n = n + 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= n; j++) {
				if (j == 1 || j == n || i == 1 || i == n || j == i || i + j == n + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
		}

	}

}


/***************** Output ****************/

/*

Enter number of lines : 5


*  *  *  *  * 
*  *     *  * 
*     *     * 
*  *     *  * 
*  *  *  *  * 


*/