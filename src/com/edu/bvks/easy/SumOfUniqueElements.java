package com.edu.bvks.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.com/problems/sum-of-unique-elements/
 * 
 * @author VivekVineeth
 *
 */
public class SumOfUniqueElements {

	public int sumOfUnique(int[] nums) {
		int sum = 0;
		Map<Integer, Integer> uniqueElements = new HashMap<>();

		for (int i : nums) {
			uniqueElements.put(i, uniqueElements.get(i) != null ? uniqueElements.get(i) + 1 : 1);
		}

		for (int i : uniqueElements.keySet()) {
			if (uniqueElements.get(i) == 1)
				sum += i;
		}

		return sum;
	}

}
