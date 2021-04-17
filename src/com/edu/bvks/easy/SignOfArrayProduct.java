/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/sign-of-the-product-of-an-array/submissions/
 * 
 * @author VivekVineeth
 *
 */
public class SignOfArrayProduct {

	public int arraySign(int[] nums) {
		int zeroFreq = 0;
		int negFreq = 0;

		for (int element : nums) {
			if (element < 0)
				negFreq++;
			else if (element == 0)
				zeroFreq++;
		}

		return signFunction(zeroFreq, negFreq);
	}

	private int signFunction(int zeroFreq, int negFreq) {
		if (zeroFreq > 0)
			return 0;
		else if (negFreq % 2 == 1)
			return -1;
		else
			return 1;
	}

	public int arraySignLC(int[] nums) {
		boolean isNegative = false; // To check product is negative or not
		for (int i : nums)
			if (i == 0)
				return 0; // If any of the number is zero, return zero
			else if (i < 0)
				isNegative = !isNegative; // If number is negative, make flag as negative

		if (isNegative)
			return -1;
		return 1;
	}

}
