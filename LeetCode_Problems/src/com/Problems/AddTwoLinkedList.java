package com.Problems;

class ListNode {
	int val;
	ListNode next;

	ListNode(int val) {
		this.val = val;
	}
}

public class AddTwoLinkedList {

	public static void main(String[] args) {

		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);

		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(4);

		ListNode result = addTwoNumbers(l1, l2);
		System.out.print("Sum : ");
		printList(result); // Sum : 7->0->8

	}

	private static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
		ListNode curr = temp;
		int carry = 0;

		while (l1 != null || l2 != null || carry != 0) {
			int val1 = (l1 != null) ? l1.val : 0;
			int val2 = (l2 != null) ? l2.val : 0;

			int sum = val1 + val2 + carry;
			carry = sum / 10;

			curr.next = new ListNode(sum % 10);
			curr = curr.next;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;

		}
		return temp.next;

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
