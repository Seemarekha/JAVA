package com.Problems;

public class Reverse_Matrix {

	public static void main(String[] args) {
		int[][] matrix = {
	            {1, 2, 3},
	            {4, 5, 6},
	            {7, 8, 9}
	        };
		
		int rows=matrix.length;
		int cols=matrix[0].length;
		
		int[][] reversed=new int[rows][cols];
		
		for(int i=0;i<rows;i++)
		{
			for(int j=0;j<cols;j++)
			{
				reversed[rows-1-i][cols-1-j]=matrix[i][j];
			}
		}
		
		System.out.println("Reversed matrix : ");
		
		for(int[] num:reversed)
		{
			for(int n:num)
			{
				System.out.print(n+" ");
			}
			System.out.println();
		}

	}

}


/************** Output ****************/

/*
 
Given matrix : 

      1 2 3 
      4 5 6 
      7 8 9 
  
 
Reversed matrix : 

        9 8 7 
        6 5 4 
        3 2 1 
 

 
 */
