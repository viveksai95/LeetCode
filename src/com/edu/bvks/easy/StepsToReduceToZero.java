/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/number-of-steps-to-reduce-a-number-to-zero/
 * 
 * @author VivekVineeth
 *
 */
public class StepsToReduceToZero {
	int stepsCount;

	public int numberOfSteps(int num) {
		while (num != 0) {
			if (num % 2 == 0) {
				num /= 2;
				stepsCount++;
			} else {
				num--;
				stepsCount++;
			}

		}
		return stepsCount;
	}
}
