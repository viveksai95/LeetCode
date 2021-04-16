package com.edu.bvks.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/two-sum/
 * 
 * @author VivekVineeth
 *
 */

public class TwoSum {

	public int[] twoSum(int[] nums, int target) {

		Map<Integer, Integer> numMap = new HashMap<>(); // Value -> Index Map
		int[] indexArray = new int[2];

		for (int i = 0; i < nums.length; i++) {
			int delta = target - nums[i];

			if (numMap.containsKey(delta)) {
				indexArray[0] = numMap.get(delta);
				indexArray[1] = i;
				return indexArray;
			}

			numMap.put(nums[i], i);
		}
		return indexArray;

	}

	public int[] twoSumLeetCode(int[] nums, int target) {
		for (int i = 0; i < nums.length; i++) {
			for (int j = i + 1; j < nums.length; j++) {
				if (nums[j] == target - nums[i]) {
					return new int[] { i, j };
				}
			}
		}
		throw new IllegalArgumentException("No two sum solution");
	}

}
