/*
Given the head of a linked list, remove the nth node from the end of the list and return its head.

Example 1:


Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]


Example 2:

Input: head = [1], n = 1
Output: []


Example 3:

Input: head = [1,2], n = 1
Output: [1]
 */

package com.Problems;

public class Remove_Nth_Node_From_Of_List {

	public static void main(String[] args) {
		// Example: [1,2,3,4,5], n=2
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		head = removeNthFromEnd(head, 2);
		printList(head); // Output: 1->2->3->5
	}

	private static ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;

		ListNode first = dummy;
		ListNode second = dummy;

		for (int i = 0; i <= n; i++) {
			first = first.next;
		}

		while (first != null) {
			first = first.next;
			second = second.next;
		}

		second.next = second.next.next;

		return dummy.next;
	}

	private static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null) {
				System.out.print("->");
			}
			head = head.next;
		}

	}

}
