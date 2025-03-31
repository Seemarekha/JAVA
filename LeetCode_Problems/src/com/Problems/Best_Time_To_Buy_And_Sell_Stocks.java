package com.Problems;

public class Best_Time_To_Buy_And_Sell_Stocks {

	public static void main(String[] args) {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int maxProfit = maxProfit(prices);
		System.out.println("Maximum profit : " + maxProfit);

	}

	private static int maxProfit(int[] prices) {
		int min = prices[0];
		int profit = 0;

		for (int i = 0; i < prices.length; i++) {
			if (prices[i] < min)
				min = prices[i];
			profit = Math.max(profit, prices[i] - min);
		}
		return profit;
	}

}

/************ Output ***************/

/*
 * 
 * Maximum profit : 5
 * 
 * 
 */
