package com.Patterns;

import java.util.Scanner;

public class FibonacciTriangle {

	public static void main(String[] args) {
		System.out.println("Enter number of lines :");
		int n = new Scanner(System.in).nextInt();
		printFibonacciTriangle(n);

	}

	private static void printFibonacciTriangle(int n) {
		int[] fib = generateFibonacci(n * (n + 1) / 2);
		int index = 0;
		for (int i = 1; i <= n; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print(fib[index++] + "\t");
			}
			System.out.println();
		}

	}

	private static int[] generateFibonacci(int count) {
		int[] fib = new int[count];
		fib[0] = 0;
		if (count > 1) {
			fib[1] = 1;
			for (int i = 2; i < count; i++) {
				fib[i] = fib[i - 1] + fib[i - 2];
			}
		}
		return fib;
	}

}


/***************** Output ******************/

/*


Enter number of lines : 5

0	
1	1	
2	3	5	
8	13	21	34	
55	89	144	233	377	


*/