/**
 * 
 */
package com.edu.bvks.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/shuffle-the-array/submissions/
 * 
 * @author VivekVineeth
 *
 */
public class ShuffleTheArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] shuffle(int[] nums, int n) {
		int[] shuffledArray = new int[nums.length];
		int j = 0;
		for (int i = 0; i < n; i++) {
			shuffledArray[j++] = nums[i];
			shuffledArray[j++] = nums[n + i];
			// increment in indices - consumes much more time than required - 3ms
		}

		return shuffledArray;
	}

	public int[] shuffleLC(int[] nums, int n) {
		int[] answer = new int[nums.length];
		int cnt = 0;

		for (int i = 0; i < n; i++) {
			answer[cnt] = nums[i];
			answer[cnt + 1] = nums[i + n];
			cnt += 2;

			// this is the efficient way - 0 ms
		}

		return answer;
	}
}
