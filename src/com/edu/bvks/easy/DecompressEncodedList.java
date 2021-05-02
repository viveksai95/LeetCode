/**
 * 
 */
package com.edu.bvks.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://leetcode.com/problems/decompress-run-length-encoded-list/
 * 
 * @author VivekVineeth
 *
 */
public class DecompressEncodedList {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int[] decompressRLElist(int[] nums) { // O(n^2) // My kalakhandam

		List<Integer> list = new ArrayList<>();

		for (int i = 0; i < nums.length; i = i + 2) {
			int freq = nums[i];
			int value = nums[i + 1];

			for (int j = 0; j < freq; j++) {
				list.add(value);
			}
		}

		int[] intArray = new int[list.size()];

		for (int k = 0; k < intArray.length; k++) {
			intArray[k] = list.get(k);
		}

		return intArray;
	}

	public int[] decompressRLElistCopied(int[] nums) { // 3ms

		int resLen = 0;
		for (int i = 0; i < nums.length; i = i + 2) {
			resLen += nums[i];
		}

		int[] res = new int[resLen];
		int val = 0;
		int freq = 0;

		for (int i = 0, j = -2; i < resLen; i++) {
			if (freq == 0) {
				j += 2;
				freq = nums[j];
				val = nums[j + 1];
			}
			res[i] = val;
			freq--;
		}
		return res;
	}

	public int[] decompressRLElistLC(int[] nums) { // 0ms

		int size = 0;
		for (int i = 0; i < nums.length; i += 2) {
			size += nums[i];
		}

		int[] ans = new int[size];
		int index = 0;

		for (int i = 0; i < nums.length; i += 2) {
			Arrays.fill(ans, index, index + nums[i], nums[i + 1]);
			index += nums[i];
		}

		return ans;
	}

}
