package com.string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class SortString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.next();
		char[] arr=s.toCharArray();
		
		/***************Approach-1**********/
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					char temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
				
		}
		String s2=new String(arr);
		System.out.println(s2);

		/***************Approach-2**********/
		
		Arrays.sort(arr);
		String s3= new String(arr);
		System.out.println(s2);
		
	}

}






/*

i/p : ccaabbd
o/p : aabbccd

*/