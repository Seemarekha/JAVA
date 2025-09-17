/*
You are given the head of a singly linked-list. The list can be represented as:

L0 → L1 → … → Ln - 1 → Ln
Reorder the list to be on the following form:

L0 → Ln → L1 → Ln - 1 → L2 → Ln - 2 → …
You may not modify the values in the list's nodes. Only nodes themselves may be changed.

Example 1:

Input: head = [1,2,3,4]
Output: [1,4,2,3]


Example 2:

Input: head = [1,2,3,4,5]
Output: [1,5,2,4,3]
 */

package com.Problems;

public class Reorder_List {

	public static void main(String[] args) {

		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);
		head.next.next.next.next = new ListNode(5);

		System.out.print("Original List: ");
		printList(head); // Original List: 1->2->3->4->5

		// Reorder
		reorderList(head);

		System.out.println();
		System.out.print("Reordered List: ");
		printList(head); // Reordered List: 1->5->2->4->3

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

	private static void reorderList(ListNode head) {
		if (head == null || head.next == null)
			return;

		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null && fast.next.next != null) {
			slow = slow.next;
			fast = fast.next.next;

		}

		ListNode second = reverseList(slow.next);
		slow.next = null;

		ListNode first = head;
		while (second != null) {
			ListNode temp1 = first.next;
			ListNode temp2 = second.next;

			first.next = second;
			second.next = temp1;

			first = temp1;
			second = temp2;
		}

	}

	private static ListNode reverseList(ListNode head) {
		ListNode prev = null, curr = head;
		while (curr != null) {
			ListNode next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		return prev;
	}

}
