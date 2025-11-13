/*
Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:

Each row must contain the digits 1-9 without repetition.
Each column must contain the digits 1-9 without repetition.
Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.
Note:

A Sudoku board (partially filled) could be valid but is not necessarily solvable.
Only the filled cells need to be validated according to the mentioned rules.
 

Example 1:

Input: board = 
[["5","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: true


Example 2:

Input: board = 
[["8","3",".",".","7",".",".",".","."]
,["6",".",".","1","9","5",".",".","."]
,[".","9","8",".",".",".",".","6","."]
,["8",".",".",".","6",".",".",".","3"]
,["4",".",".","8",".","3",".",".","1"]
,["7",".",".",".","2",".",".",".","6"]
,[".","6",".",".",".",".","2","8","."]
,[".",".",".","4","1","9",".",".","5"]
,[".",".",".",".","8",".",".","7","9"]]
Output: false
Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. Since there are two 8's in the top left 3x3 sub-box, it is invalid.
 */

package com.Problems;

import java.util.HashSet;

public class Valid_Sudoku {

	public static void main(String[] args) {
		 char[][] board = {
		            {'5','3','.','.','7','.','.','.','.'},
		            {'6','.','.','1','9','5','.','.','.'},
		            {'.','9','8','.','.','.','.','6','.'},
		            {'8','.','.','.','6','.','.','.','3'},
		            {'4','.','.','8','.','3','.','.','1'},
		            {'7','.','.','.','2','.','.','.','6'},
		            {'.','6','.','.','.','.','2','8','.'},
		            {'.','.','.','4','1','9','.','.','5'},
		            {'.','.','.','.','8','.','.','7','9'}
		        };
		        System.out.println(isValidSudoku(board)); // Output: true

	}

	private static boolean isValidSudoku(char[][] board) {
		
		HashSet<Character>[] rows=new HashSet[9];
		HashSet<Character>[] cols=new HashSet[9];
		HashSet<Character>[] boxes=new HashSet[9];
		
		for(int i=0;i<9;i++)
		{
			rows[i]=new HashSet<Character>();
			cols[i]=new HashSet<Character>();
			boxes[i]=new HashSet<Character>();
		}
		
		for(int r=0;r<9;r++)
		{
			for(int c=0;c<9;c++)
			{
				char val=board[r][c];
				
				if(val=='.') continue;
				
				if(rows[r].contains(val)) return false;
				if(cols[c].contains(val)) return false;
				
				int boxIndex=(r/3)*3+(c/3);
				
				if(boxes[boxIndex].contains(val)) return false;
				
				
				rows[r].add(val);
				cols[c].add(val);
				boxes[boxIndex].add(val);
				
			}
		}
		return true;
	}

}
