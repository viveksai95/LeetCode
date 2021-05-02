/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/subtract-the-product-and-sum-of-digits-of-an-integer/
 * 
 * @author VivekVineeth
 *
 */
public class SubtractProductAndSum {

	public static int subtractProductAndSum(int n) {
		int product = 1;
		int sum = 0;

		while (n > 0) {
			byte digit = (byte) (n % 10);
			sum += digit;
			product *= digit;
			n /= 10;
		}

		return product - sum;
	}

	public static void main(String[] args) {
		System.out.println(subtractProductAndSum(234));
	}

}
