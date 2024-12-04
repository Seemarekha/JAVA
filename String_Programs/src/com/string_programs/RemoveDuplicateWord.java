//  input: “happy happy birthday” output: “happy birthday”? 


package com.string_programs;

import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateWord {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).nextLine();
		
		String[] arr=s.split(" ");
		StringBuilder sb=new StringBuilder();
		Set<String> set=new LinkedHashSet<>();
		
		for(String str:arr)
			set.add(str);
		for(String str:set)
			sb.append(str).append(" ");
		System.out.println(sb.toString().trim());
	}

}
