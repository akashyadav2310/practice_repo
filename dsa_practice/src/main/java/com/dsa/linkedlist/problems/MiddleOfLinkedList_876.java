package com.dsa.linkedlist.problems;

public class MiddleOfLinkedList_876 {

	private ListNode head;
	
	public MiddleOfLinkedList_876 () {
		
	}
	
	public static void main(String[] args) {
		
		MiddleOfLinkedList_876 list = new MiddleOfLinkedList_876();
		
//		ListNode node8 = list.new ListNode(8);
//		ListNode node7 = list.new ListNode(7, node8);
//		ListNode node6 = list.new ListNode(6, node7);
        ListNode node5 = list.new ListNode(5);//, node6);
        ListNode node4 = list.new ListNode(4, node5);
        ListNode node3 = list.new ListNode(3, node4);
        ListNode node2 = list.new ListNode(2, node3);
        ListNode node1 = list.new ListNode(1, node2);
        
        list.head = node1; // Assigning the head of the linked list
        System.out.println(middleNode(list.head).val);
	}
	
	public static ListNode middleNode(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null) { // Iterate while fast != null && fast.next != null
        	slow = slow.next; // first we set slow = slow.next (increase by one)
        	fast = fast.next.next; // if(fast.next.next != null),Yes then we assign fast = fast.next.next
        }
        return slow;
    }
	
	private class ListNode {
	     int val;
	     ListNode next;
	     ListNode() {}
	     ListNode(int val) { this.val = val; }
	     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
	}

}
