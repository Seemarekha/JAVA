package com.string_programs;

public class SutUn_sUTuN {

	public static void main(String[] args) {
		String ip="SutUn";
		String op=convert(ip);
		System.out.println(op);

	}

	static String convert(String s) {
		StringBuilder sb=new StringBuilder();
		for(char c:s.toCharArray())
		{
			if(Character.isUpperCase(c))
				sb.append(Character.toLowerCase(c));
			else
				sb.append(Character.toUpperCase(c));
		}
		return sb.toString();
	}

}

/*
 * 
input : SutUn
output : sUTuN

 */
