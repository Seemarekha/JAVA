package com.string_programs;

import java.util.Scanner;

public class Test_Matcher {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.next();

		for(int i=1;i<=s.length();i++)
		{
			System.out.println(s.substring(0,i));
		}
	}

}




/*

i/p : Sutun

o/p : S
      Su
      Sut
      Sutu
      Sutun
 */