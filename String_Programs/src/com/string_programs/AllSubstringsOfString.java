package com.string_programs;

import java.util.Scanner;

public class AllSubstringsOfString {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter a string : ");
		String s = scn.next();
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+3;j<=s.length();j++)
			{
				System.out.println(s.substring(i, j));
			}
		}
	}

}


/*

i/p : malayalam
o/p : mal
      mala
      malay
      malaya
      malayal
      malayala
      malayalam
      ala
      alay
      alaya
      alayal
      alayala
      alayalam
      lay
      laya
      layal
      layala
      layalam
      aya
      ayal
      ayala
      ayalam
      yal
      yala
      yalam
      ala
      alam
      lam


*/