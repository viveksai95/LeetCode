/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/goal-parser-interpretation/
 * 
 * @author VivekVineeth
 *
 */
public class GoalParserInterpretation {
	public String interpret(String command) {
		String interpretedCmd = command.replace("()", "o").replace("(al)", "al");

		return interpretedCmd;
	}
}
