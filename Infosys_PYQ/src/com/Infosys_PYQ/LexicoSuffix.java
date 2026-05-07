/*
You are given a string S of size N you have to perform a particular type of query multiple times on this string.
 
The query is : for any string T, 
find the length of a lexicographically smallest suffix string of S start with T, 
if there is no suffix return 0. 

After performing all the queries you have to return the sum of all queries. 
Since the answer can be very large return it in modulo 10^9+7 

I/P : 
10 
1 
mzadpoghyykht 
yk 

O/P : 4 


I/P : 
12 
2 
ktmrgjswhwxu
z 
w 

O/P : 5 

I/P : 
15 
1 
tvtrpudosnlydgi 
dg 

O/P : 9
 */

package com.Infosys_PYQ;

public class LexicoSuffix {

	public static void main(String[] args) {

		String s = "mzadpoghyykht";
		String[] queries = { "yk" };

		System.out.println(solve(s, queries)); // 4

	}

	private static int solve(String s, String[] queries) {
		int n = s.length();
		long MOD = 1000000007;
		long total = 0;

		for (String T : queries) {
			String bestSuffix = null;
			int bestLength = 0;

			for (int i = 0; i < n - T.length(); i++) {
				if (s.startsWith(T, i)) {
					String suffix = s.substring(i);

					if (bestSuffix == null || suffix.compareTo(bestSuffix) < 0) {
						bestSuffix = suffix;
						bestLength = n - i;
					}
				}
			}
			total = (total + bestLength) % MOD;
		}
		return (int) total;
	}

}
