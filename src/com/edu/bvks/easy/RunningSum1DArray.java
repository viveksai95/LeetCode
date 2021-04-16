/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/running-sum-of-1d-array/
 * 
 * @author VivekVineeth
 *
 */
public class RunningSum1DArray {

	public int[] runningSum(int[] nums) {
		int[] summedArray = new int[nums.length];
		int sum = 0;
		for (int i = 0; i < nums.length; i++) {
			sum += nums[i];
			summedArray[i] = sum;
		}
		return summedArray;
	}

	public int[] runningSumLC(int[] nums) {
		for (int i = 1; i < nums.length; i++) {
			// Result at index `i` is sum of result at `i-1` and element at `i`.
			nums[i] += nums[i - 1];
		}
		return nums;
	}

}
