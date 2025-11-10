/*
Given a linked list, swap every two adjacent nodes and return its head. You must solve the problem without modifying the values in the list's nodes (i.e., only nodes themselves may be changed.)

 
Example 1:

Input: head = [1,2,3,4]
Output: [2,1,4,3]


Example 2:

Input: head = []
Output: []


Example 3:

Input: head = [1]
Output: [1]


Example 4:

Input: head = [1,2,3]
Output: [2,1,3]
 */

package com.Problems;

public class Swap_Nodes_InPair {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(3);
		head.next.next.next = new ListNode(4);

		System.out.print("Original List: ");
		printList(head); // Original List: 1->2->3->4
		ListNode swapped = swapPairs(head);
		System.out.print("Swapped List: ");
		printList(swapped); // Swapped List: 1->3->2->4

	}

	private static ListNode swapPairs(ListNode head) {
		ListNode dummy = new ListNode(0);
		dummy.next = head;
		ListNode curr = head;

		while (curr.next != null && curr.next.next != null) {
			ListNode first = curr.next;
			ListNode second = curr.next.next;

			first.next = second.next;
			second.next = first;
			curr.next = second;

			curr = first;
		}
		return dummy.next;
	}

	private static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print("->");

			head = head.next;
		}
		System.out.println();

	}

}
