package com.Patterns;

import java.util.Scanner;

public class Number_Pyramid {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter number of lines : ");
		int n = scn.nextInt();
		int sp = n - 1;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= sp; j++) {
				System.out.print("   ");
			}
			for (int j = 1; j <= i; j++) {
				System.out.print(" " + j + " ");
			}
			for (int j = i - 1; j >= 1; j--) {
				System.out.print(" " + j + " ");
			}
			System.out.println();
			sp--;
		}

	}

}


/****************** Output *******************/


/*

Enter number of lines : 5

             1 
          1  2  1 
       1  2  3  2  1 
    1  2  3  4  3  2  1 
 1  2  3  4  5  4  3  2  1 


*/