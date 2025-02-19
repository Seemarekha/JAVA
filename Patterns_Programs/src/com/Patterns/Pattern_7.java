package com.Patterns;

import java.util.Scanner;

public class Pattern_7 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n = scn.nextInt();

		for (int i = 1; i <= n; i++) {
			int k = n;
			for (int j = 1; j <= n; j++) {
				if (i % 2 != 0) {
					System.out.print(j + "\t");
				} else {
					System.out.print(k + "\t");
					k--;
				}
			}
			System.out.println();
		}

	}

}


/******************* Output *****************/

/*
 
Enter number of lines: 5

1	2	3	4	5	
5	4	3	2	1	
1	2	3	4	5	
5	4	3	2	1	
1	2	3	4	5


 */
