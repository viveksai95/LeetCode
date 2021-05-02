package com.edu.bvks.util;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class CodeChecker {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Check-1
		System.out.println(Byte.MIN_VALUE);
		System.out.println(Byte.MAX_VALUE);

		// Check-2
		int[][] matrix = { { 1, 2, 3 }, { 1, 2, 3 }, { 1, 2, 3 } };

		System.out.println(matrix.length);

		String s = "[{({})}]";
		System.out.println(isBalanced(s));

	}

	public static String isBalancedMoreMemory(String s) {
		Stack<Character> stack = new Stack();
		Map<Character, Character> charMap = new HashMap<>();

		charMap.put('}', '{');
		charMap.put(')', '(');
		charMap.put(']', '[');

		for (char ch : s.toCharArray()) {
			System.out.println(ch);
			if (isOpenParentheses(ch)) {
				stack.push(ch);
				continue;
			}

			if (!stack.isEmpty() && stack.peek() == charMap.get(ch)) {
				stack.pop();
				continue;
			}

			if (isCloseParentheses(ch)) {
				stack.push(ch);
				break;
			}
		}

		if (stack.isEmpty())
			return "YES";

		return "NO";

	}

	private static boolean isCloseParentheses(char ch) {
		return ch == '}' || ch == ')' || ch == ']';
	}

	public static boolean isOpenParentheses(char ch) {
		if (ch == '(' || ch == '{' || ch == '[')
			return true;
		return false;
	}

	public static String isBalanced(String s) {
		Stack<Character> stack = new Stack<>();
		Map<Character, Character> charMap = new HashMap<>();

		charMap.put('{', '}');
		charMap.put('(', ')');
		charMap.put('[', ']');

		for (char ch : s.toCharArray()) {
			if (charMap.containsKey(ch)) {
				stack.push(ch);
			} else if (stack.empty() || (ch != charMap.get(stack.pop()))) {
				return "NO";
			}
		}

		return stack.isEmpty() ? "YES" : "NO";

	}

}
