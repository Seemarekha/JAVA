//input: “ramana” output:”ramn” with indexOf method?

package com.string_programs;

import java.util.Scanner;

public class RemoveDuplicatesUsingIndexOf {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next();
		String result="";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(result.indexOf(c)==-1)
			{
				result+=c;
			}
		}

		System.out.println(result);
	}

}
 