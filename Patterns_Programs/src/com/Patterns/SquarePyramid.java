package com.Patterns;

import java.util.Scanner;

class SquarePyramid 
{
	public static void main(String[] args) 
	{
		System.out.print("Enter number of lines : ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}


/***************** Output *************/

/*

Enter number of lines : 5
* * * * * 
* * * * * 
* * * * * 
* * * * * 
* * * * * 

*/