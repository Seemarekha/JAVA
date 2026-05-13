/*
Given the head of a linked list, reverse the nodes of the list k at a time, and return the modified list.

k is a positive integer and is less than or equal to the length of the linked list. If the number of nodes is not a multiple of k then left-out nodes, in the end, should remain as it is.

You may not alter the values in the list's nodes, only nodes themselves may be changed.

 

Example 1:


Input: head = [1,2,3,4,5], k = 2
Output: [2,1,4,3,5]


Example 2:


Input: head = [1,2,3,4,5], k = 3
Output: [3,2,1,4,5]
 */

package com.Problems;

public class Reverse_Nodes_In_K_group {

	public static void main(String[] args) {
		ListNode head1 = createList(new int[] { 1, 2, 3, 4, 5 });
		int k1 = 2;

		System.out.println("Original:");
		printList(head1);

		ListNode result1 = reverseKGroup(head1, k1);
		System.out.println("After reversing in k = " + k1 + " groups:");
		printList(result1);

		System.out.println();

		ListNode head2 = createList(new int[] { 1, 2, 3, 4, 5 });
		int k2 = 3;

		System.out.println("Original:");
		printList(head2);

		ListNode result2 = reverseKGroup(head2, k2);
		System.out.println("After reversing in k = " + k2 + " groups:");
		printList(result2);

	}

	private static ListNode createList(int[] arr) {
		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;

		for (int val : arr) {
			curr.next = new ListNode(val);
			curr = curr.next;
		}
		return dummy.next;
	}

	private static ListNode reverseKGroup(ListNode head, int k) {
		if (head == null || k == 1)
			return head;

		ListNode curr = head;
		int count = 0;

		while (curr != null && count < k) {
			curr = curr.next;
			count++;
		}

		if (count < k)
			return head;

		curr = head;
		ListNode prev = null, next = null;
		count = 0;

		while (curr != null && count < k) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
			count++;
		}

		head.next = reverseKGroup(curr, k);

		return prev;
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

}


/********** Output ***********/

/*


Original:
1 -> 2 -> 3 -> 4 -> 5
After reversing in k = 2 groups:
2 -> 1 -> 4 -> 3 -> 5

Original:
1 -> 2 -> 3 -> 4 -> 5
After reversing in k = 3 groups:
3 -> 2 -> 1 -> 4 -> 5



*/
