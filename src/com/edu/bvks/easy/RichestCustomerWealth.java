/**
 * 
 */
package com.edu.bvks.easy;

import java.util.Arrays;

/**
 * https://leetcode.com/problems/richest-customer-wealth/
 * 
 * @author VivekVineeth
 *
 */
public class RichestCustomerWealth {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maximumWealth(int[][] accounts) {
		int maxWealth = Integer.MIN_VALUE;

		for (int outerIndex = 0; outerIndex < accounts.length; outerIndex++) {
			int customerWealth = 0;
			for (int innerIndex = 0; innerIndex < accounts[outerIndex].length; innerIndex++) {
				customerWealth += accounts[outerIndex][innerIndex];
			}

			maxWealth = Math.max(maxWealth, customerWealth);
		}

		return maxWealth;
	}

	public int maximumWealthLC(int[][] accounts) {
		return Arrays.stream(accounts).mapToInt(row -> Arrays.stream(row).sum()).max().getAsInt();
		// it actually takes more time in computation
	}

}
