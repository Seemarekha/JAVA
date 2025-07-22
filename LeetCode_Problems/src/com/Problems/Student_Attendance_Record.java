/*
 You are given a string s representing an attendance record for a student where each character signifies whether the student was absent, late, or present on that day. The record only contains the following three characters:

'A': Absent.
'L': Late.
'P': Present.
The student is eligible for an attendance award if they meet both of the following criteria:

The student was absent ('A') for strictly fewer than 2 days total.
The student was never late ('L') for 3 or more consecutive days.
Return true if the student is eligible for an attendance award, or false otherwise.
 

Example 1:

Input: s = "PPALLP"
Output: true
Explanation: The student has fewer than 2 absences and was never late 3 or more consecutive days.
Example 2:

Input: s = "PPALLL"
Output: false
Explanation: The student was late 3 consecutive days in the last 3 days, so is not eligible for the award.
 */

package com.Problems;

public class Student_Attendance_Record {

	public static void main(String[] args) {
		System.out.println(checkRecord("PPALLP")); // true
		System.out.println(checkRecord("PPALLL")); // false

	}

	private static boolean checkRecord(String s) {
		int absents = 0;

		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);

			if (c == 'A')
				absents++;
			if (absents >= 2)
				return false;

			if (i >= 2 && s.charAt(i) == 'L' && s.charAt(i - 1) == 'L' && s.charAt(i - 2) == 'L')
				return false;
		}
		return true;
	}

}
