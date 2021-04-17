/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/jewels-and-stones/
 * 
 * @author VivekVineeth
 *
 */
public class JewelAndStones {

	public int numJewelsInStones(String jewels, String stones) {
		char[] stoneArray = stones.toCharArray();
		int jewelCount = 0;

		for (char ch : stoneArray) {
			if (jewels.contains(ch + ""))
				jewelCount++;
		}

		return jewelCount;
	}

	public int numJewelsInStonesLC(String jewels, String stones) {
		int nb = 0;
		char[] je = jewels.toCharArray();
		char[] st = stones.toCharArray();

		for (char i : je) {
			for (char j : st) {
				if (i == j)
					nb++;
			}
		}
		return nb;
	}

}
