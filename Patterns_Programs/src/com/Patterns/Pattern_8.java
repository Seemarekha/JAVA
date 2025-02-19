package com.Patterns;

import java.util.Scanner;

public class Pattern_8 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int x = ((i - 1) * n) + 1;
				for (int j = 1; j <= n; j++) {
					System.out.print(x + "\t");
					x++;
				}
			} else {
				int x = i * n;
				for (int j = 1; j <= n; j++) {
					System.out.print(x + "\t");
					x--;
				}
			}
			System.out.println();
		}
	}

}


/****************** Output ********************/

/*
 
Enter number of lines: 5

1	2	3	4	5	
10	9	8	7	6	
11	12	13	14	15	
20	19	18	17	16	
21	22	23	24	25


 */
