package com.Patterns;

import java.util.Scanner;

public class Pattern_17 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of lines : ");
		int n = scn.nextInt();
		int sp = n - 1;
		int star = 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("  ");
			}
			for (int j = 1; j <= star; j++) {
				if (j == 1 || j == star || i == n)
					System.out.print("* ");
				else
					System.out.print("  ");
			}
			System.out.println();
			sp--;
			star += 2;
		}

	}

}


/******************** Output ********************/

/*


Enter number of lines : 5

          * 
        *   * 
      *       * 
    *           * 
  * * * * * * * * * 


*/