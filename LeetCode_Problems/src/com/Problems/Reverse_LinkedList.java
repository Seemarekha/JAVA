/*
Given the head of a singly linked list, reverse the list, and return the reversed list.

Example 1:


Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]
Example 2:


Input: head = [1,2]
Output: [2,1]
Example 3:

Input: head = []
Output: []

 */

package com.Problems;

public class Reverse_LinkedList {

	public static void main(String[] args) {
		int[] values = { 1, 2, 3, 4, 5 };

		ListNode head = createList(values);
		System.out.print("Original List: ");
		printList(head); // Original List: 1->2->3->4->5

		head = reverseList(head);
		System.out.print("Reversed List: ");
		printList(head); // Reversed List: 5->4->3->2->1

	}

	private static ListNode reverseList(ListNode head) {
		ListNode prev = null;
		ListNode curr = head;

		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
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
