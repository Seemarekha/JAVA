package com.OtherNumberPrograms;

import java.util.Scanner;

public class DecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println("Enter a decimal number");
		int dec=new Scanner(System.in).nextInt();
		int bin=0;
		int i=1;
		while(dec>0)
		{
			int bit=dec%2;
			bin=bit*i+bin;
			i*=10;
			dec/=2;
		}
		System.out.println("Decimal to Binary conversion : "+bin);

	}

}
