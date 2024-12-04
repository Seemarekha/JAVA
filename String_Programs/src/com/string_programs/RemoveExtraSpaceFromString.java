// Remove Extra space in given string :- Input:__java__is___very__easy__?  Ouput: “java_is_very_easy” 



package com.string_programs;

import java.util.Scanner;

public class RemoveExtraSpaceFromString {

	public static void main(String[] args) {
		System.out.println("Enter a string : ");
		String s=new Scanner(System.in).nextLine();
		String s2=s.replace(" +" , " ");
		s2=s2.replace("^  |  $", "");
		System.out.println("After removing extra space : "+s2);

	}

}
