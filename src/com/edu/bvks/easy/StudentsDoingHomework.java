/**
 * 
 */
package com.edu.bvks.easy;

/**
 * https://leetcode.com/problems/number-of-students-doing-homework-at-a-given-time/
 * 
 * @author VivekVineeth
 *
 */
public class StudentsDoingHomework {
	public int busyStudent(int[] startTime, int[] endTime, int queryTime) {
		int busyStudentsCount = 0;

		for (int i = 0; i < startTime.length; i++) {
			if (startTime[i] <= queryTime && queryTime <= endTime[i])
				busyStudentsCount++;
		}

		return busyStudentsCount;
	}
}
