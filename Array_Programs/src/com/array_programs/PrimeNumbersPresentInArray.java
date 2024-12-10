package com.array_programs;

public class PrimeNumbersPresentInArray {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5,6,7};
		System.out.println("Prime numbers present in given array: ");
		for(int i=0;i<a.length;i++)
		{
			if(isPrime(a[i],a[i]/2))
				System.out.print(a[i]+" ");
		}

	}

	private static boolean isPrime(int n, int i) {
		if(n<=1) return false;
		if(i==1) return true;
		if(n%i==0) return false;
		return isPrime(n,i-1);
	}

}
