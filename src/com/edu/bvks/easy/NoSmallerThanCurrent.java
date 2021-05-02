/**
 * 
 */
package com.edu.bvks.easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/how-many-numbers-are-smaller-than-the-current-number/
 * 
 * @author VivekVineeth
 *
 */
public class NoSmallerThanCurrent {

	public int[] smallerNumbersThanCurrent(int[] nums) {
		int[] smallNumsArray = new int[nums.length];

		// Brute Force Approach
		for (int i = 0; i < nums.length; i++) {
			int numsCount = 0;
			for (int j = 0; j < nums.length; j++) {
				if (i != j && nums[i] > nums[j]) {
					numsCount++;
				}
			}
			smallNumsArray[i] = numsCount;
		}

		return smallNumsArray;
	}

	public int[] smallerNumbersThanCurrentWorst(int[] nums) {
		int[] smallNumsArray = new int[nums.length];

		// Most Inefficient Approach - Took even more time than Brute Force Approach
		Map<Integer, Integer> valueFreqMap = new HashMap<>();
		int[] sortedArray = Arrays.copyOf(nums, nums.length);
		Arrays.sort(sortedArray);

		for (int i : nums)
			System.out.println(i);

		valueFreqMap.put(sortedArray[0], 0);

		for (int i = 1; i < sortedArray.length; i++) {
			if (sortedArray[i] != sortedArray[i - 1] && !valueFreqMap.containsKey(sortedArray[i])) {
				valueFreqMap.put(sortedArray[i], i);
			} else if (!valueFreqMap.containsKey(sortedArray[i])) {
				valueFreqMap.put(sortedArray[i], i - 1);
			}
		}

		System.out.println(valueFreqMap);

		for (int j = 0; j < nums.length; j++) {
			smallNumsArray[j] = valueFreqMap.get(nums[j]) != null ? valueFreqMap.get(nums[j]) : 0;
		}

		return smallNumsArray;
	}

	public int[] smallerNumbersThanCurrentLCEfficient(int[] nums) {
		int[] buck = new int[101];

		for (int i = 0; i < nums.length; i++) {
			buck[nums[i]] += 1;
		}

		for (int j = 1; j <= 100; j++) {
			buck[j] += buck[j - 1];
		}

		for (int k = 0; k < nums.length; k++) {
			int pos = nums[k];
			nums[k] = pos == 0 ? 0 : buck[pos - 1];
		}

		return nums;
	}

}
