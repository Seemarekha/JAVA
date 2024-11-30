package com.string_programs;

import java.util.HashMap;
import java.util.Map;

public class HelloWorld_He121W2r3d {

	public static void main(String[] args) {
		String ip="HelloWorld";
		String op=convertion(ip);
		System.out.println(op);

	}

	static String convertion(String s) {
		
		StringBuilder sb=new StringBuilder();
		Map<Character,Integer> m=new HashMap<Character, Integer>();
		
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='l')
			{
				int count=m.getOrDefault(c, 0)+1;
				m.put(c, count);
				sb.append(count);
			}
			else if(c=='o')
			{
				int count=m.getOrDefault(c, 0)+1;
				m.put(c, count);
				sb.append(count);
			}
			else {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}







/*
 
 input : HelloWorld
 output : He121W2r3d
 
 */
