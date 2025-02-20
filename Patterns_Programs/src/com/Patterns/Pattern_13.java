package com.Patterns;

import java.util.Scanner;

public class Pattern_13 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();
		for (int i = n; i >= 1; i--) {
			int k = n;
			for (int j = i; j >= 1; j--) {
				System.out.print(k + " ");
				if (j > 1)
					System.out.print("* ");
				k--;
			}
			System.out.println();
		}

	}

}

/****************** Output ****************/

/*


Enter number of lines : 5

5 * 4 * 3 * 2 * 1 
5 * 4 * 3 * 2 
5 * 4 * 3 
5 * 4 
5 

*/
