/* write a java program to print an array's last index value of a given element.
input : {1,2,9,3,9,4,9,6,7,8} find the last index of 9
output : 6
*/

package com.array_programs;

import java.util.Scanner;

public class LastIndexValueOfElementInArray {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Enter the number of element u want to insert : ");
		int n = scn.nextInt();
		int[] arr = new int[n];

		System.out.println("Enter the elements in an array:");
		for (int i = 0; i < n; i++) {
			arr[i] = scn.nextInt();
		}

		System.out.println("Enter the element to find last index value:");
		int ele = scn.nextInt();
		int lastIndex = -1;
		for (int i = 0; i < n; i++) {
			if (arr[i] == ele)
				lastIndex = i;
		}
		if (lastIndex == -1)
			System.out.println("Element not found");
		else
			System.out.println("The last index of the element " + ele + " is : " + lastIndex);

	}

}
