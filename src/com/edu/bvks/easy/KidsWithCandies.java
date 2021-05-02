/**
 * 
 */
package com.edu.bvks.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/
 * 
 * @author VivekVineeth
 *
 */
public class KidsWithCandies {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] candies = { 2, 3, 5, 1, 3 };
		kidsWithCandies(candies, 3);
		
		int[][] accounts = {{1,5},{7,3,4,5},{3,5,2,5,6,7,8}};
		
		System.out.println(accounts.length);
		System.out.println(accounts[0].length);
		System.out.println(accounts[1].length);
		System.out.println(accounts[2].length);

	}

	public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
		List<Boolean> isEligible = new ArrayList<>();

		int highestCandiesCount = getMaxCandies(candies);

		for (int candy : candies) {
			int updatedCandy = candy + extraCandies;
			if (updatedCandy >= highestCandiesCount) {
				isEligible.add(true);
			} else {
				isEligible.add(false);
			}
		}

		return isEligible;
	}

	public static int getMaxCandies(int[] candies) {
		int max = 0;

		for (int candy : candies) {
			if (candy > max) {
				max = candy;
			}
		}

		return max;
	}

	// LeetCode Version

	public List<Boolean> kidsWithCandiesLC(int[] candies, int extraCandies) {

		int max = Integer.MIN_VALUE;
		List<Boolean> l = new ArrayList<>();

		for (int candy : candies) {
			max = Math.max(max, candy);
		}

		for (int candy : candies) {
			l.add(candy + extraCandies >= max);
		}

		return l;
	}

}
