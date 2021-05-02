/**
 * 
 */
package com.edu.bvks.easy;

import java.util.List;

/**
 * https://leetcode.com/problems/count-items-matching-a-rule/
 * 
 * @author VivekVineeth
 *
 */
public class CountItemsMatchingRule {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	// Perfect solution
	public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {

		int ruleIndex = -1;
		int matchCount = 0;

		if (ruleKey.equals("type"))
			ruleIndex = 0;
		else if (ruleKey.equals("color"))
			ruleIndex = 1;
		else if (ruleKey.equals("name"))
			ruleIndex = 2;

		for (List<String> item : items) {
			if (item.get(ruleIndex).equals(ruleValue))
				matchCount += 1;

		}

		return matchCount;
	}

}
