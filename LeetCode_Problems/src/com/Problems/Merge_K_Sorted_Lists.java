/*
You are given an array of k linked-lists lists, each linked-list is sorted in ascending order.

Merge all the linked-lists into one sorted linked-list and return it.

 

Example 1:

Input: lists = [[1,4,5],[1,3,4],[2,6]]
Output: [1,1,2,3,4,4,5,6]
Explanation: The linked-lists are:
[
  1->4->5,
  1->3->4,
  2->6
]
merging them into one sorted linked list:
1->1->2->3->4->4->5->6


Example 2:

Input: lists = []
Output: []


Example 3:

Input: lists = [[]]
Output: []
 */

package com.Problems;

import java.util.PriorityQueue;

public class Merge_K_Sorted_Lists {

	public static void main(String[] args) {
		ListNode l1 = createList(new int[] { 1, 4, 5 });
		ListNode l2 = createList(new int[] { 1, 3, 4 });
		ListNode l3 = createList(new int[] { 2, 6 });

		ListNode[] lists = new ListNode[] { l1, l2, l3 };

		ListNode result = mergeKLists(lists);

		System.out.println("Merged List:");
		printList(result); // 1 -> 1 -> 2 -> 3 -> 4 -> 4 -> 5 -> 6

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

	private static ListNode mergeKLists(ListNode[] lists) {
		if (lists == null || lists.length == 0)
			return null;

		PriorityQueue<ListNode> minHeap = new PriorityQueue<ListNode>((a, b) -> a.val - b.val);

		for (ListNode node : lists) {
			if (node != null)
				minHeap.offer(node);
		}

		ListNode dummy = new ListNode(-1);
		ListNode curr = dummy;

		while (!minHeap.isEmpty()) {
			ListNode n = minHeap.poll();
			curr.next = n;
			curr = curr.next;

			if (n.next != null)
				minHeap.offer(n.next);

		}
		return dummy.next;
	}

	private static void printList(ListNode head) {
		while (head != null) {
			System.out.print(head.val);
			if (head.next != null) {
				System.out.print(" -> ");
			}
			head = head.next;
		}
		System.out.println();

	}

}
