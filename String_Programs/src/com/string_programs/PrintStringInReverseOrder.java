 //   create one string array, size=5, add 5 elements and print it in reverse order? 




package com.string_programs;

import java.util.Scanner;

public class PrintStringInReverseOrder {

	public static void main(String[] args) {
		String[] arr=new String[5];
		System.out.println("Enter 5 string elements : ");
		Scanner scn=new Scanner(System.in);

		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.next();
		}
		System.out.println("Array elemnts in reverse order : ");
		for(int i=arr.length-1;i>=0;i--)
		{
			System.out.println(arr[i]);
		}
	}

}
