/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/shuffle-string/submissions/
 * 
 * @author VivekVineeth
 *
 */
public class ShuffleString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] indices = { 4, 5, 6, 7, 0, 2, 1, 3 };
		System.out.println(restoreString("codeleet", indices));
	}

	public static String restoreString(String s, int[] indices) {
		char[] charArray = new char[indices.length];

		for (int i = 0; i < indices.length; i++) {
			int index = getIndex(indices, i);
			charArray[i] = s.charAt(index);
		}

		return new String(charArray);
	}

	public static int getIndex(int[] indices, int value) {
		for (int j = 0; j < indices.length; j++) {
			if (indices[j] == value) {
				return j;
			}
		}
		return -1;
	}

}
