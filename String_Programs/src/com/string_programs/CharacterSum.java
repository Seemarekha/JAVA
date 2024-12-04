//  input: “abc” output:97+98+99=294?  




package com.string_programs;

import java.util.Scanner;

public class CharacterSum {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next();
		
		char[] arr=s.toCharArray();
		int sum=0;
		
		for(int i=0;i<arr.length;i++)
		{
			sum+=arr[i];
		}
		
		System.out.println(sum);

	}

}
