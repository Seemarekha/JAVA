package com.string_programs;

import java.util.HashSet;

public class RemoveDuplicates_WithoutUsing_splitMethod {

	public static void main(String[] args) {
		
		String s="java is is a programming language and java is popular popular";	
		System.out.println("Original string : "+s);
		
		String res=removeDuplicates(s);
		System.out.println("After removing duplicates : "+res);
	}

	private static String removeDuplicates(String s) {
		
		HashSet<String> hs=new HashSet<String>();
		
		StringBuilder word=new StringBuilder();
		StringBuilder res=new StringBuilder();
		
		for(int i=0;i<=s.length();i++)
		{
			char ch=((i<s.length())?s.charAt(i):' ');
			
			if(ch!=' ')
			{
				word.append(ch);
			}else if(word.length()>0)
			{
				String wordStr=word.toString();
				if(!hs.contains(wordStr))
				{
					if(res.length()>0)
					{
						res.append(" ");
					}
					res.append(wordStr);
					hs.add(wordStr);
				}
				word.setLength(0);
			}
		}
		return res.toString();
	}

}
