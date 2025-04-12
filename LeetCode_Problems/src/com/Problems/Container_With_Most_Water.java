package com.Problems;

import java.util.Arrays;

public class Container_With_Most_Water {

	public static void main(String[] args) {
		int height[] = { 1, 8, 6, 2, 5, 4, 8, 3, 7 };
		System.out.println("Given heights in array : " + Arrays.toString(height));
		int area = maxArea(height);
		System.out.println("Maximum area filled with water : " + area);

	}

	private static int maxArea(int[] height) {
		int left = 0;
		int right = height.length - 1;
		int max = 0;

		while (left < right) {
			int width = right - left;
			int area = Math.min(height[left], height[right]) * width;
			max = Math.max(max, area);

			if (height[left] <= height[right]) {
				left++;
			} else {
				right--;
			}
		}
		return max;
	}

}


/***************** Output **********************/


/*


Given heights in array : [1, 8, 6, 2, 5, 4, 8, 3, 7]
Maximum area filled with water : 49


*/
