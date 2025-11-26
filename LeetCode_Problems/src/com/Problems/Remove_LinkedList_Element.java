/*
Given the head of a linked list and an integer val, remove all the nodes of the linked list that has Node.val == val, and return the new head.

 
Example 1:

Input: head = [1,2,6,3,4,5,6], val = 6
Output: [1,2,3,4,5]


Example 2:

Input: head = [], val = 1
Output: []


Example 3:

Input: head = [7,7,7,7], val = 7
Output: []

 */

package com.Problems;

public class Remove_LinkedList_Element {

	public static void main(String[] args) {
		int[] values = { 1, 2, 6, 3, 4, 5, 6 };
		int target = 6;

		ListNode head = createList(values);
		System.out.print("Original List: ");
		printList(head); // Original List: 1->2->6->3->4->5->6

		head = removeElements(head, target);
		System.out.print("Updated List: ");
		printList(head); // Updated List: 1->2->3->4->5

	}

	private static ListNode removeElements(ListNode head, int val) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = dummy;

		while (curr.next != null) {
			if (curr.next.val == val) {
				curr.next = curr.next.next;
			} else {
				curr = curr.next;
			}
		}
		return dummy.next;
	}

	private static void printList(ListNode head) {
		ListNode curr = head;
		while (curr != null) {
			System.out.print(curr.val);
			if (curr.next != null)
				System.out.print("->");
			curr = curr.next;
		}
		System.out.println();

	}

	private static ListNode createList(int[] values) {
		ListNode dummy = new ListNode(0);
		ListNode curr = dummy;

		for (int val : values) {
			curr.next = new ListNode(val);
			curr = curr.next;
		}
		return dummy.next;
	}

}
