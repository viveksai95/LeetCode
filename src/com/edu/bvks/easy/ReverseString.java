package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/reverse-string/solution/
 * 
 * @author VivekVineeth
 *
 */

public class ReverseString {

	public void reverseString(char[] s) {
		int high = (s.length) - 1;
		int low = 0;
		char temp;
		while (low <= high) {
			if (s[low] != s[high]) {
				temp = s[low];
				s[low] = s[high];
				s[high] = temp;
			}
			low++;
			high--;
		}
		for (char character : s)
			System.out.println(character);
	}

	public void helper(char[] s, int left, int right) {
		if (left >= right)
			return;
		char tmp = s[left];
		s[left++] = s[right];
		s[right--] = tmp;
		helper(s, left, right);
	}

	public void reverseStringLeetCode(char[] s) {
		helper(s, 0, s.length - 1);
	}

}
