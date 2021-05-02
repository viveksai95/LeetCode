/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/check-if-the-sentence-is-pangram/
 * 
 * @author VivekVineeth
 *
 */
public class PangramCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(checkIfPangram("leetcode"));
	}

	public static boolean checkIfPangram(String sentence) { // Took more memory 2n
		short[] freqArray = new short[26];

		for (char ch : sentence.toCharArray()) {
			short index = (short) (ch - 97);
			freqArray[index] += 1;
		}

		for (int frq : freqArray) {
			if (frq == 0)
				return false;
		}

		return true;
	}

	public boolean checkIfPangramLC(String sentence) { // Even best solution than above
		for (char i = 'a'; i <= 'z'; i++) {
			if (sentence.indexOf(i) == -1)
				return false;
		}
		return true;
	}

}
