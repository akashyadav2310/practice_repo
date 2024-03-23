package com.dsa.linkedlist.problems;

// https://leetcode.com/problems/reverse-linked-list/submissions/1204221412/
public class ReverseLinkedList_206 {

	ListNode head;
	
	public static void main(String[] args) {
		ReverseLinkedList_206 list = new ReverseLinkedList_206();
		
//		ListNode node8 = list.new ListNode(8);
//		ListNode node7 = list.new ListNode(7, node8);
//		ListNode node6 = list.new ListNode(6, node7);
        ListNode node5 = list.new ListNode(5);//, node6);
        ListNode node4 = list.new ListNode(4, node5);
        ListNode node3 = list.new ListNode(3, node4);
        ListNode node2 = list.new ListNode(2, node3);
        ListNode node1 = list.new ListNode(1, node2);
        
        list.head = node1; // Assigning the head of the linked list
        
        System.out.print("Original List : ");
        display(list.head);
        
        ListNode reverseListHead = reverseList(list.head);
        
        System.out.print("Reverse List  : ");
        display(reverseListHead);	
	}
	
	// Method for reversing a singly-linked list. (Note : head of the linkedList is given)
	private static ListNode reverseList(ListNode head) {
		if(head == null)
			return null;
		ListNode prevNode = null; // Track the previous node. Initialized to null because there's no previous node initially.
		ListNode presentNode = head; // Represents the current node being processed, initially set to the input head.
		ListNode nextNode = presentNode.next; // Represents the next node in the original list. Initialized to presentNode.next.
		
		while(presentNode != null) { // loop continues until presentNode becomes null, indicating the end of the original list.
			presentNode.next = prevNode; // presentNode.next is updated to point to prevNode, effectively reversing the direction of the current node.
			prevNode = presentNode; // prevNode is updated to presentNode
			presentNode = nextNode; // and presentNode is updated to nextNode.
			if(nextNode != null) { // nextNode is not null.
				nextNode = nextNode.next; // it moves to the next node in the original list
			}
		}
		
		return prevNode; // Finally, the method returns prevNode, which now points to the head of the reversed list.
	}

	private static void display(ListNode head) {
		while(head != null) {
        	System.out.print(head.val + " -> ");
        	head = head.next;
        }
		System.out.println("END");
	}
	
	
	private class ListNode{
		int val;
	    ListNode next;
	    ListNode() {}
	     
	    ListNode(int val) {
	    	this.val = val; 
	    }
	     
	    ListNode(int val, ListNode next) { 
	    	this.val = val; 
	    	this.next = next; 
	    }		
	}

}
