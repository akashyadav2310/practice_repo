package com.dsa.linkedlist.problems;

public class ReverseLinkedList_K_Groups_25 {

	private ListNode head;
	
	public static void main(String[] args) {
		ReverseLinkedList_K_Groups_25 list = new ReverseLinkedList_K_Groups_25();
		
//		ListNode node8 = list.new ListNode(8);
		ListNode node7 = list.new ListNode(7);//, node8);
		ListNode node6 = list.new ListNode(6, node7);
        ListNode node5 = list.new ListNode(5, node6);
        ListNode node4 = list.new ListNode(4, node5);
        ListNode node3 = list.new ListNode(3, node4);
        ListNode node2 = list.new ListNode(2, node3);
        ListNode node1 = list.new ListNode(1, node2);
        
        list.head = node1; // Assigning the head of the linked list
        
        System.out.print("Original List : ");
        display(list.head);
        
        ListNode ansHead = reverseKGroups(list.head, 2);
        
        System.out.print("K groups List : ");
        display(ansHead);

	}
	
	public static ListNode reverseKGroups(ListNode head, int k) {
		if(k <= 1 || head == null) { // base condition
			return head;
		}
		
		ListNode current = head;
		ListNode prevNode = null;
		
		while(true) {
			
		}
		
		
		return head;
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
