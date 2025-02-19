package com.Patterns;

import java.util.Scanner;

public class Pattern_6 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n = scn.nextInt();
		int k = 1;
		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(k + "\t");
				k++;
			}
			System.out.println();
		}
	}

}

/****************** Output *****************/


/*

Enter number of lines: 5

1 1 1 1 1 
2 2 2 2 
3 3 3 
4 4 
5 


 */
