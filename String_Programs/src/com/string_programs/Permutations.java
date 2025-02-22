 // write all permutation of string “abc” output: “abc”, “acb”, “bac”, “bca”, “cba”, “cab”? 


package com.string_programs;

import java.util.Scanner;

public class Permutations {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).next();

		System.out.println("Permutations : ");
		permutation(s,0,s.length()-1);
	}

	static void permutation(String s, int start, int end) {

		if(start==end)
		{
			System.out.println(s);
			return;
		}
		for(int i=start;i<=end;i++)
		{
			String s2=swap(s,start,i);
			permutation(s2,start+1,end);
		}

		
	}

	static String swap(String s, int i, int j) {
		char[] ch=s.toCharArray();
		char temp=ch[i];
		ch[i]=ch[j];
		ch[j]=temp;
		return new String(ch);
	}

}
