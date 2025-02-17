package com.Patterns;

import java.util.Scanner;

class AlphabaticPyramid 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter number of lines : ");
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		char ch='A';
		int sp=n-1;
		int st=1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=sp;j++)
			{
				System.out.print("  ");
			}
			for(int j=1;j<=st;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
			if(i<=n/2)
			{
				sp--;
				st+=2;
			}else{
				sp++;
				st-=2;
			}
		}
	}
}


/**************** Output ****************/

/*


Enter number of lines : 5
        A 
      B C D 
    E F G H I 
      J K L 
        M 


*/