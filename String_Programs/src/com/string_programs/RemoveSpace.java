// Write a java program to remove space in given String without using inbuilt function?  



package com.string_programs;

import java.util.Scanner;

public class RemoveSpace {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).nextLine();
		StringBuilder sb=new StringBuilder();
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)!=' ')
				sb.append(s.charAt(i));
		}
		System.out.println("After removing space : "+sb.toString());
		

	}

}
