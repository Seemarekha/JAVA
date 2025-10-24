/*
Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

Example 1:

Input: head = [1,2,2,1]
Output: true


Example 2:

Input: head = [1,2]
Output: false

 */

package com.Problems;

public class Palindrome_LinkedList {

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
		head.next = new ListNode(2);
		head.next.next = new ListNode(2);
		head.next.next.next = new ListNode(1);

		System.out.println(isPalindrome(head)); // true

		ListNode head2 = new ListNode(1);
		head2.next = new ListNode(2);

		System.out.println(isPalindrome(head2)); // false

	}

	private static boolean isPalindrome(ListNode head) {
		if (head == null || head.next == null)
			return true;

		ListNode slow = head, fast = head;
		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}

		ListNode secondHalf = reverseList(slow);

		ListNode p1 = head;
		ListNode p2 = secondHalf;
		boolean isPalindrome = true;

		while (p2 != null) {
			if (p1.val != p2.val) {
				isPalindrome = false;
				break;
			}
			p1 = p1.next;
			p2 = p2.next;
		}
		reverseList(secondHalf);
		return isPalindrome;
	}

	private static ListNode reverseList(ListNode head) {
		ListNode prev = null, curr = head;
		while (curr != null) {
			ListNode nextNode = curr.next;
			curr.next = prev;
			prev = curr;
			curr = nextNode;
		}
		return prev;
	}

}
