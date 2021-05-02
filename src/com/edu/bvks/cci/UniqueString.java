package com.edu.bvks.cci;

import java.util.HashMap;
import java.util.Map;

public class UniqueString {

	public static void main(String[] args) {
		System.out.println("Test Check");

		String input_f = "bandarapalli";
		String input_c = "abcdefghijklmnopqrstuvwxyz";

		System.out.println(checkIsUniqueUsingBooleanArray(input_f));
		System.out.println(checkIsUniqueUsingBooleanArray(input_c));
	}

	public static boolean checkIsUniqueUsingHashMap(String input) { // Time :: O(n)
		// System.out.println("isUnique Check");
		Map<Character, Integer> charFreqMap = new HashMap<>(); // Space - O(n)
		for (char ch : input.toCharArray()) { // O(n)
			charFreqMap.put(ch, charFreqMap.get(ch) != null ? charFreqMap.get(ch) + 1 : 1);
		}
		// +
		for (char ch : charFreqMap.keySet()) { // O(n)
			if (charFreqMap.get(ch) != 1)
				return false;
		}

		return true;
	}

	public static boolean checkIsUniqueUsingBooleanArray(String input) {
		// Assuming the char set to be ASCII
		boolean[] charArray = new boolean[128];
		for (char ch : input.toCharArray()) {
			int i = ch;
			if (charArray[i])
				return false;
			charArray[i] = true;
		}
		return true;
	}

}
