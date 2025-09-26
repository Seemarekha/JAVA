package com.Problems;

public class Merge_Point_LinkedList {

	public static void main(String[] args) {

		/*
		 * Create sample lists: 
		 * List A: 1 -> 2 -> 3 \
		 *                        6 -> 7 
		 * List B:      4 -> 5 /
		 */

		Node common = new Node(6);
		common.next = new Node(7);

		Node headA = new Node(1);
		headA.next = new Node(2);
		headA.next.next = new Node(3);
		headA.next.next.next = common;

		Node headB = new Node(4);
		headB.next = new Node(5);
		headB.next.next = common;

		Node intersection = getIntersectionNode(headA, headB);
		if (intersection != null) {
			System.out.println("Merge Point: " + intersection.data);
		} else {
			System.out.println("No merge point.");
		}

	}

	private static Node getIntersectionNode(Node headA, Node headB) {

		if (headA == null || headB == null)
			return null;

		Node p1 = headA;
		Node p2 = headB;

		while (p1 != p2) {
			p1 = (p1 == null) ? headB : p1.next;
			p2 = (p2 == null) ? headA : p2.next;
		}
		return p1;
	}

}
