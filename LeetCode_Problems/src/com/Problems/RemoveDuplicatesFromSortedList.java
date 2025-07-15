package com.Problems;

class ListNode1{
	int val;
	ListNode1 next;
	
	ListNode1(){}
	
	ListNode1(int val){
		this.val=val;
	}
	
	ListNode1(int val,ListNode1 next)
	{
		this.val=val;
		this.next=next;
	}
}


public class RemoveDuplicatesFromSortedList {

	public static void main(String[] args) {
		ListNode1 head=new ListNode1(1);
		head.next=new ListNode1(1);
		head.next.next=new ListNode1(2);
		head.next.next.next=new ListNode1(3);
		head.next.next.next.next=new ListNode1(3);
		head.next.next.next.next.next=new ListNode1(4);
		
		System.out.println("Original list : ");
		printList(head);
		
		head=deleteduplicates(head);
		
		System.out.println("After removing duplicates : ");
		printList(head);

	}

	private static ListNode1 deleteduplicates(ListNode1 head) {
		ListNode1 curr=head;
		while(curr!=null && curr.next!=null) {
			if(curr.val==curr.next.val)
				curr.next=curr.next.next;
			else
				curr=curr.next;
		}
		return head;
	}

	private static void printList(ListNode1 head) {
		while(head!=null)
		{
			System.out.print(head.val+" ");
			head=head.next;
		}
		System.out.println();
	}

}
