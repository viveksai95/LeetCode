/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/final-prices-with-a-special-discount-in-a-shop/
 * 
 * @author VivekVineeth
 *
 */
public class SpecialDiscount {
	public int[] finalPrices(int[] prices) {
		for (int i = 0; i < prices.length; i++) {
			for (int j = i + 1; j < prices.length; j++) {
				if (prices[j] <= prices[i]) {
					prices[i] -= prices[j];
					break;
				}
			}
		}
		return prices;
	}
}
