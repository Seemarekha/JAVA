/*  Write a java program to convert 0 into -1 and -1 into 0
 input : {5,1,0,-1,2,0}
 output : {5,1,-1,0,2,-1}
 
 */

package com.array_programs;

import java.util.Arrays;

public class ConvertionOfElementInArray {

	public static void main(String[] args) {
		int[] a = { 5, 1, 0, -1, 2, 0 };
		System.out.println("Before convertion : " + Arrays.toString(a));
		convert(a);
		System.out.println("After convertion : " + Arrays.toString(a));

	}

	private static void convert(int[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0)
				a[i] = -1;
			else if (a[i] == -1)
				a[i] = 0;
		}

	}

}
