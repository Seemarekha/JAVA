package com.Problems;

class Node {
	int data;
	Node next;

	public Node(int data) {
		this.data = data;
		this.next = null;
	}
}

public class DetectAndRemoveCycleInLinkedList {

	public static void main(String[] args) {
		Node head = new Node(1);
		head.next = new Node(2);
		head.next.next = new Node(3);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(5);

		head.next.next.next.next.next = head.next.next;

		detectAndRemoveCycle(head);

		printList(head);
	}

	private static void detectAndRemoveCycle(Node head) {
		Node slow = head;
		Node fast = head;

		while (fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;

			if (slow == fast) {
				System.out.println("Cycle detected");
				removeCycle(head, slow);
				return;
			}
		}
		System.out.println("No cycle detected");

	}

	private static void removeCycle(Node head, Node meetingPoint) {
		Node ptr1 = head;
		Node ptr2 = meetingPoint;

		while (ptr1 != ptr2) {
			ptr1 = ptr1.next;
			ptr2 = ptr2.next;
		}
		Node temp = ptr1;
		while (temp.next != ptr1) {
			temp = temp.next;
		}
		temp.next = null;
		System.out.println("Cycle removed");

	}

	private static void printList(Node head) {
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " -> ");
			temp = temp.next;
		}
		System.out.println("null");

	}

}


/************** output ********************/

/*


Cycle detected
Cycle removed
1 -> 2 -> 3 -> 4 -> 5 -> null



*/
