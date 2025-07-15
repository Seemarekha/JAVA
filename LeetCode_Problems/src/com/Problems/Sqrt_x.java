package com.Problems;

import java.util.Scanner;

public class Sqrt_x {

	public static void main(String[] args) {
		System.out.print("Enter a number : ");
		int n=new Scanner(System.in).nextInt();
		int sqrt=sqrt(n);
		System.out.println("Square root of "+n+" (Approx.) : "+sqrt);

	}

	private static int sqrt(int n) {
		if(n<2) return n;
		int left=1, right=n, ans=0;
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			long sq=(long)mid*mid;
			if(sq==n) return mid;
			else if(sq<n)
			{
				ans=mid;
				left=mid+1;
			}
			else
				right=mid-1;
		}
		return ans;
	}

}
