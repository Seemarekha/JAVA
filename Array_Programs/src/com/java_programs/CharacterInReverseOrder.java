// Write a java program to store characters in an array and print the characters in reverse order ?

package com.java_programs;

import java.util.Scanner;

public class CharacterInReverseOrder {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter length of array :");
		int n=scn.nextInt();
		char[] arr=new char[n];
		System.out.println("Enter characters in array : ");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scn.next().charAt(0);
		}
		
		 System.out.println("You entered characters in array: ");
	     for (char c : arr) {
	         System.out.print(c + " ");
	     }
	     System.out.println();
	     System.out.println("Print the characters in reverse order : ");
	     char[] rev=new char[arr.length];
	     int j=0;
	     for(int i=arr.length-1;i>=0;i--)
	     {
	    	 rev[j++]=arr[i];
	     }
	     for(char ch:rev)
	     {
	    	 System.out.print(ch+" ");
	     }
	}

}
