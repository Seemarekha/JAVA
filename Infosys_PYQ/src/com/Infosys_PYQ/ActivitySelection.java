/*
Problem

Given:

start times
end times

Select maximum number of non-overlapping activities.

Example
Start = [1,3,0,5,8,5]
End   = [2,4,6,7,9,9]

Output:

4

Possible activities:

(1,2), (3,4), (5,7), (8,9)

Always select:

activity with smallest finishing time

Why?

Because it leaves maximum room for future activities.
 */

package com.Infosys_PYQ;

import java.util.Arrays;

public class ActivitySelection {

	static class Activity {
		int start, end;

		public Activity(int start, int end) {
			this.start = start;
			this.end = end;
		}
	}

	public static void main(String[] args) {
		int[] start = { 1, 3, 0, 5, 8, 5 };
		int[] end = { 2, 4, 6, 7, 9, 9 };

		System.out.println(maxActivities(start, end)); // 4

	}

	private static int maxActivities(int[] start, int[] end) {
		int n = start.length;

		Activity[] activities = new Activity[n];

		for (int i = 0; i < n; i++) {
			activities[i] = new Activity(start[i], end[i]);
		}

		Arrays.sort(activities, (a, b) -> a.end - b.end);

		int count = 1;

		int prevend = activities[0].end;

		for (int i = 1; i < n; i++) {
			if (activities[i].start >= prevend) {
				count++;
				prevend = activities[i].end;
			}
		}

		return count;
	}

}
