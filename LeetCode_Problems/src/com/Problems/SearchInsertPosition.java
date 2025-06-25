package com.Problems;


public class SearchInsertPosition {

	public static void main(String[] args) {
		int[] arr= {1,3,5,6};
		int target=2;
		int res=searchInsert(arr,target);
		System.out.println(res);

	}

	private static int searchInsert(int[] arr,int target) {
		int left=0,right=arr.length-1;
		
		
		while(left<=right)
		{
			int mid=left+(right-left)/2;
			if(target==arr[mid])
				return mid;
			else if(target<arr[mid])
				right=mid-1;
			else
				left=mid+1;
		}
		return left;
	}

}
