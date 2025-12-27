package com.Problems;

public class Merge_Sorted_LinkedList {

	public static void main(String[] args) {

		// First sorted linked list: 1 -> 3 -> 5
		ListNode l1 = new ListNode(1);
		l1.next = new ListNode(3);
		l1.next.next = new ListNode(5);

		// Second sorted linked list: 2 -> 4 -> 6
		ListNode l2 = new ListNode(2);
		l2.next = new ListNode(4);
		l2.next.next = new ListNode(6);

		// Merge lists
		ListNode mergedHead = mergeTwoLists(l1, l2);

		// Print result
		System.out.print("Merged Linked List: ");
		printList(mergedHead); // Merged Linked List: 1 -> 2 -> 3 -> 4 -> 5 -> 6

	}

	private static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null)
				System.out.print(" -> ");
			head = head.next;

		}
		System.out.println();

	}

	private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;

		while (l1 != null && l2 != null) {
			if (l1.val < l2.val) {
				curr.next = l1;
				l1 = l1.next;
			} else {
				curr.next = l2;
				l2 = l2.next;
			}
			curr = curr.next;
		}

		if (l1 != null)
			curr.next = l1;
		if (l2 != null)
			curr.next = l2;

		return dummy.next;
	}

}
