package com.Problems;

public class Longest_Common_SubSequence {

	public static void main(String[] args) {
		String text1 = "abcde";
		String text2 = "ace";

		System.out.println("Given strings : \ntext1 : " + text1 + "\ntext2 : " + text2);
		System.out.println("The length of longest common subsequence : " + longestCommonSubsequence(text1, text2));

	}

	/************************* Approach - 1 *************************************/
//	private static int longestCommonSubsequence(String text1, String text2) {
//
//		int[][] mat = new int[text1.length()+1][text2.length()+1];
//
//		for (int j = text2.length() - 1; j >= 0; j--) {
//			for (int i = text1.length() - 1; i >= 0; i--) {
//				if (text1.charAt(i) == text2.charAt(j)) {
//					mat[i][j] = 1 + mat[i + 1][j + 1];
//				} else {
//					mat[i][j] = Math.max(mat[i][j + 1], mat[i + 1][j]);
//				}
//			}
//		}
//		return mat[0][0];
//	}

	/************************* Approach - 2 *************************************/

	private static int longestCommonSubsequence(String s1, String s2) {
		int m = s1.length();
		int n = s2.length();

		int[] prev = new int[n + 1];
		int[] curr = new int[n + 1];

		for (int i = 1; i <= m; i++) {
			for (int j = 1; j <= n; j++) {
				if (s1.charAt(i - 1) == s2.charAt(j - 1))
					curr[j] = 1 + prev[j - 1];
				else
					curr[j] = Math.max(prev[j], curr[j - 1]);
			}

			int[] temp = prev;
			prev = curr;
			curr = temp;
		}
		return prev[n];
	}

}

/**************** Output *********************/

/*
 * 
 * 
 * Given strings : 
 * text1 : abcde 
 * text2 : ace 
 * The length of longest common subsequence : 3
 * 
 * 
 * 
 */