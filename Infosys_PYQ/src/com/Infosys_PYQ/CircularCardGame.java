/*
 You are playing a card game where n cards of different colors are arranged in a list on a circular table. 
 The player must move one card at a time, either to left or right. 
 Since the cards are in a circular list, when the last card is reached in either direction, 
 the next card is at the other end of the list. 
 You are given with one card color and one card index, 
 determine the minimum number of left or right moves to reach the given target card from the given start index. 
 
 Constraints: 
 1<=n<=100 
 0<=startIndex<=n-1 
 1<=card[i] & targetCard<=100 
 
 I/P : 
 4 
 ["red","blue","green","yellow"] 
 1 
 "yellow" 
 
 O/P : 2 
 
 I/P : 
 5 
 ["black","grey","brown","red","pink"] 
 3 
 "black" 
 
 O/P : 2
 */

package com.Infosys_PYQ;

public class CircularCardGame {

	public static void main(String[] args) {
		String[] cards1 = { "red", "blue", "green", "yellow" };
		System.out.println(minSteps(cards1, 1, "yellow")); // Output: 2

		String[] cards2 = { "black", "grey", "brown", "red", "pink" };
		System.out.println(minSteps(cards2, 3, "black")); // Output: 2

	}

	private static int minSteps(String[] cards, int startIndex, String target) {
		int n = cards.length;
		int minSteps = Integer.MAX_VALUE;

		for (int i = 0; i < n; i++) {
			if (cards[i].equals(target)) {
				int right = (i - startIndex + n) % n;
				int left = (startIndex - i + n) % n;

				minSteps = Math.min(minSteps, Math.min(left, right));
			}
		}
		return minSteps == Integer.MAX_VALUE ? -1 : minSteps;
	}

}
