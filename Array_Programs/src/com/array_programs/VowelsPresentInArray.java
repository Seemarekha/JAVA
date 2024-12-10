package com.array_programs;

public class VowelsPresentInArray {

	public static void main(String[] args) {
		char[] a = { 'a', 'b', 'c', 'd', 'e', 'f' };
		System.out.println("Vowels present in given array: ");
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' || a[i] == 'A' || a[i] == 'E'
					|| a[i] == 'I' || a[i] == 'O' || a[i] == 'U')
				System.out.print(a[i] + " ");
		}

	}

}
