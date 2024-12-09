package com.array_programs;

import java.util.Arrays;

public class PrintEveneIndexValue {

	public static void main(String[] args) {
		
		int[] arr = {10, 20, 30, 40, 50, 60, 70};
		System.out.println("Array values :");
		System.out.println(Arrays.toString(arr));
		System.out.println("Values at even indices:");
		 int[] res=new int[arr.length/2+1];
		 int j=0;
		 for(int i=0;i<arr.length;i++) {
			 if(i%2==0)
			 {
				res[j++]+=arr[i];
			 }
		 }

		 System.out.println(Arrays.toString(res));
	}

}
