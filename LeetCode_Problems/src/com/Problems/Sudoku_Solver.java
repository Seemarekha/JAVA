package com.Problems;

public class Sudoku_Solver {

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

        solveSudoku(board);

        System.out.println("Solved Sudoku:");
        printBoard(board);
    }

    public static void solveSudoku(char[][] board) {
        solve(board, 0, 0);
    }

    public static boolean solve(char[][] board, int row, int col) {

        // Base case
        if (row == 9) {
            return true;
        }

        // Move to next cell
        int nextRow = row;
        int nextCol = col + 1;

        // If column reaches end
        if (nextCol == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If already filled, move ahead
        if (board[row][col] != '.') {
            return solve(board, nextRow, nextCol);
        }

        // Try digits 1 to 9
        for (char dig = '1'; dig <= '9'; dig++) {

            if (isValid(board, row, col, dig)) {

                board[row][col] = dig;

                if (solve(board, nextRow, nextCol)) {
                    return true;
                }

                // Backtrack
                board[row][col] = '.';
            }
        }

        return false;
    }

    public static boolean isValid(char[][] board, int row, int col, char dig) {

        // Check row and column
        for (int i = 0; i < 9; i++) {

            if (board[row][i] == dig) {
                return false;
            }

            if (board[i][col] == dig) {
                return false;
            }
        }

        // Check 3x3 box
        int srow = (row / 3) * 3;
        int scol = (col / 3) * 3;

        for (int i = srow; i < srow + 3; i++) {
            for (int j = scol; j < scol + 3; j++) {

                if (board[i][j] == dig) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void printBoard(char[][] board) {

        for (int i = 0; i < 9; i++) {

            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }

            System.out.println();
        }
    }
}