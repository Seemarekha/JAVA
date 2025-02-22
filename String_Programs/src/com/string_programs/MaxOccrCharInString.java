package com.string_programs;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MaxOccrCharInString {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.print("Enter a string :");
		String s=scn.next();
		
		maximumOccurance(s);
	}

	 static void maximumOccurance(String s) {
		
		 if(s.isEmpty() || s==null)
		 {
			 System.out.println("Given String is empty or null");
		     return;
		 }
		 
		 Map<Character,Integer> m=new HashMap<Character, Integer>();
		 
		 for(char c:s.toCharArray())
		 {
			 m.put(c, m.getOrDefault(c, 0)+1);
		 }
		 
		 int maxOcc=0;
		 char maxChar=' ';
		 
		 for(Map.Entry<Character, Integer> entry:m.entrySet())
		 {
			 if(entry.getValue()>maxOcc)
			 {
				 maxChar=entry.getKey();
				 maxOcc=entry.getValue();
			 }
		 }
		 System.out.println("Maximum occurred character : "+maxChar+" and it's count : "+maxOcc);
		
	}

}

/*

 
Enter a string :Sutun
Maximum occurred character : u and it's count : 2


*/
