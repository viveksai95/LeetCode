/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/find-the-highest-altitude/
 * 
 * @author VivekVineeth
 *
 */
public class HighestAltitude {
	
	public int largestAltitude(int[] gain) {
		int maxAltitude = 0;
		int sum = 0;
		for (int altitude : gain) {
			sum += altitude;	
			if (sum > maxAltitude) {
				maxAltitude = sum;
			}
		}
		return maxAltitude;
	}
}
