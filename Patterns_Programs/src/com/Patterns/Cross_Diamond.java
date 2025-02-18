
package com.Patterns;

import java.util.Scanner;

public class Cross_Diamond {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();
		int star = 1;
		int sp = n / 2;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= star; j++) {
				if (j == 1 || j == star || i == (n / 2) + 1 || j == (star / 2) + 1)
					System.out.print(" * ");
				else
					System.out.print("   ");
			}
			System.out.println();
			if (i <= n / 2) {
				star += 2;
				sp--;
			} else {
				star -= 2;
				sp++;
			}
		}

	}

}

/***************** Output ****************/

/*

 
 Enter number of lines : 5

 
          * 
       *  *  * 
    *     *     * 
 *  *  *  *  *  *  * 
    *     *     * 
       *  *  * 
          * 

 
 
 
 */
