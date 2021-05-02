/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/number-of-good-pairs/submissions/
 * 
 * @author VivekVineeth
 *
 */
public class GoodPairs {
	
	public int numIdenticalPairs(int[] nums) {
        int goodPairsCount = 0;
        for(int i=0; i < nums.length-1; i++){
            for(int j=i+1; j < nums.length; j++ ) {
                if(nums[i] == nums[j]) {
                    goodPairsCount++;
                }
            }
        }
        
        return goodPairsCount;
    }// O(n^2). 
	//O(n) are also present, try to achieve that later.

}
