/*
Given head, the head of a linked list, determine if the linked list has a cycle in it.

There is a cycle in a linked list if there is some node in the list that can be reached again by continuously following the next pointer. Internally, pos is used to denote the index of the node that tail's next pointer is connected to. Note that pos is not passed as a parameter.

Return true if there is a cycle in the linked list. Otherwise, return false.


Example 1:


Input: head = [3,2,0,-4], pos = 1
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 1st node (0-indexed).
Example 2:


Input: head = [1,2], pos = 0
Output: true
Explanation: There is a cycle in the linked list, where the tail connects to the 0th node.
Example 3:


Input: head = [1], pos = -1
Output: false
Explanation: There is no cycle in the linked list.

 */

package com.Problems;

public class Linkedlist_Life_Cycle {

	public static void main(String[] args) {
		// Create nodes
		ListNode node1 = new ListNode(3);
		ListNode node2 = new ListNode(2);
		ListNode node3 = new ListNode(0);
		ListNode node4 = new ListNode(-4);

		// Link nodes to form the list: 3 -> 2 -> 0 -> -4
		node1.next = node2;
		node2.next = node3;
		node3.next = node4;

		// Create cycle: tail connects to node2 (index 1)
		node4.next = node2;

		Linkedlist_Life_Cycle obj = new Linkedlist_Life_Cycle();
		boolean result = obj.hasCycle(node1);

		System.out.println("Cycle Detected: " + result); // Output: true

	}

	private boolean hasCycle(ListNode head) {
		if (head == null || head.next == null)
			return false;

		ListNode slow = head;
		ListNode fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast)
				return true;
		}
		return false;
	}

}
