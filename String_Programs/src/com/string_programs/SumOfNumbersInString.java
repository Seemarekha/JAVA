//  input: “acb243d10” output:243+10=253? 



package com.string_programs;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).nextLine();
		
		String regex="[0-9]+";
		Matcher m=Pattern.compile(regex).matcher(s);
		
		int sum=0;
		while(m.find())
		{
			sum+=Integer.parseInt(m.group());
		}
		System.out.println(sum);

	}

}
