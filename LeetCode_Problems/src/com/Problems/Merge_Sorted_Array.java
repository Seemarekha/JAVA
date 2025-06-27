package com.Problems;

import java.util.Arrays;

public class Merge_Sorted_Array {

	public static void main(String[] args) {
		int[] nums1= {1,2,3,0,0,0};
		int m = 3;
		System.out.println("First sorted array : "+Arrays.toString(nums1));
		
		int[] nums2= {2,5,6};
		int n=3;
		System.out.println("Second sorted array : "+Arrays.toString(nums2));
		
		int[] res=merge(nums1,m,nums2,n);
		System.out.println("Merged array : "+Arrays.toString(res));

	}

	private static int[] merge(int[] nums1, int m, int[] nums2, int n) {
		int i=m-1,j=n-1,k=m+n-1;
		
		while(i>=0 && j>=0)
		{
			if(nums1[i]>nums2[j])
				nums1[k--]=nums1[i--];
			else
				nums1[k--]=nums2[j--];
		}
		
		while(j>=0)
		{
			nums1[k--]=nums2[j--];
		}
		return nums1;
	}

}




/****************** Output ***************/

/*
 

First sorted array : [1, 2, 3, 0, 0, 0]
Second sorted array : [2, 5, 6]
Merged array : [1, 2, 2, 3, 5, 6]




*/
