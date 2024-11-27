package com.string_programs;

import java.util.Arrays;
import java.util.Scanner;

public class ConvertStringToCharArray {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter a string :");
		String s=scn.next();
		
		//Using built-in method
		
		char[] arr=s.toCharArray();
		System.out.println(Arrays.toString(arr));

		//Without using built-in method
		
		char[] arr2=new char[s.length()];
		for(int i=0;i<s.length();i++)
		{
			arr2[i]+=s.charAt(i);
		}
		System.out.println(Arrays.toString(arr2));
	}

}
