package com.Problems;

public class Longest_Common_SubSequence {

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";

		System.out.println("Given strings : \ntext1 : " + text1 + "\ntext2 : " + text2);
		System.out.println("The length of longest common subsequence : " + longestCommonSubsequence(text1, text2));

	}

	private static int longestCommonSubsequence(String text1, String text2) {

		int[][] mat = new int[text1.length()+1][text2.length()+1];

		for (int j = text2.length() - 1; j >= 0; j--) {
			for (int i = text1.length() - 1; i >= 0; i--) {
				if (text1.charAt(i) == text2.charAt(j)) {
					mat[i][j] = 1 + mat[i + 1][j + 1];
				} else {
					mat[i][j] = Math.max(mat[i][j + 1], mat[i + 1][j]);
				}
			}
		}
		return mat[0][0];
	}

}








/**************** Output *********************/

/*


Given strings : 
text1 : abcde
text2 : ace
The length of longest common subsequence : 3



*/