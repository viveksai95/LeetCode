/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/matrix-diagonal-sum/
 * 
 * @author VivekVineeth
 *
 */
public class DiagonalSum {
	public int diagonalSum(int[][] mat) {
		int length = mat.length - 1;
		int diagonalSum = 0;

		for (int index = 0; index <= length; index++) {
			diagonalSum += mat[index][index] + mat[index][length - index];
		}

		if (mat.length % 2 == 1)
			diagonalSum -= mat[length / 2][length / 2];

		return diagonalSum;
	}
}
