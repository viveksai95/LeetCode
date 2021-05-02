/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/check-if-two-string-arrays-are-equivalent/
 * 
 * @author VivekVineeth
 *
 */
public class EquivalentStringArrays {
	public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
		StringBuilder sb = new StringBuilder();

		for (String word : word1) {
			sb.append(word);
		}

		String concatWord1 = sb.toString();
		sb = new StringBuilder();

		for (String word : word2) {
			sb.append(word);
		}

		String concatWord2 = sb.toString();

		return concatWord1.equals(concatWord2);
	}
}
