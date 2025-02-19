package com.Patterns;

import java.util.Scanner;

public class Pattern_9 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter number of lines:");
		int n = scn.nextInt();
		for (int i = 1; i <= n; i++) {
			if (i % 2 != 0) {
				int x = i - 1;
				x = (x * (x + 1)) / 2;
				for (int j = 1; j <= i; j++) {
					x++;
					System.out.print(x + "\t");
				}
			} else {
				int x = (i * (i + 1) / 2);
				for (int j = 1; j <= i; j++) {
					System.out.print(x + "\t");
					x--;
				}
			}
			System.out.println();
		}
	}
}



/***************** Output ****************/

/*


Enter number of lines: 5

1	
3	2	
4	5	6	
10	9	8	7	
11	12	13	14	15



 */
