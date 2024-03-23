package com.dsa.linkedlist.problems;

// https://leetcode.com/problems/reorder-list/description/
public class Reorder_List_143 {

	private ListNode head;
	
	public static void main(String[] args) {
		Reorder_List_143 list = new Reorder_List_143();

		ListNode node7 = list.new ListNode(7);
		ListNode node6 = list.new ListNode(6, node7);
        ListNode node5 = list.new ListNode(5, node6);
        ListNode node4 = list.new ListNode(4, node5);
        ListNode node3 = list.new ListNode(3, node4);
        ListNode node2 = list.new ListNode(2, node3);
        ListNode node1 = list.new ListNode(1, node2);
        
        list.head = node1;
        
        display(list.head);
        reorderList(list.head);
        display(list.head);
        

	}
	
	public static void reorderList(ListNode head) {
        
		// Two pointers, slow and fast, are used to find the middle node of the linked list
        ListNode slow = head; 
        ListNode fast = head;  
        while(fast != null && fast.next != null){ // When fast reaches the end of the list (or beyond),
            slow = slow.next; // slow moves one step at a time.
            fast = fast.next.next; //  while fast moves two steps at a time
        }
        ListNode midNode = slow; // slow will be at the middle node or the one just before it.

        // After finding the middle node (midNode), the program reverses the second half of the list starting from midNode.next.
        ListNode reversedSecondHalfhead = reverseList(midNode.next); // The reverseList method is called to reverse the linked list, starting from midNode.next. 
        midNode.next = null; // The midNode.next is then set to null to separate the first half from the reversed second half.

        ListNode current = head; // The current pointer is used to iterate through the original list, starting from the head.
        while(reversedSecondHalfhead != null){// The loop iterates until reversedSecHalfhead becomes null, indicating that we have reached the end of the reversed second half.
            ListNode temp = current.next; // temporarily stores the next node in the original list
            current.next = reversedSecondHalfhead;
            reversedSecondHalfhead = reversedSecondHalfhead.next;
            current.next.next = temp;
            current = temp;
        }
    }

    public static ListNode reverseList(ListNode head){
        if(head == null)
            return head;
        ListNode prevNode = null;
        ListNode presentNode = head;
        ListNode nextNode = head.next;
        while(presentNode != null){
            presentNode.next = prevNode;
            prevNode = presentNode;
            presentNode = nextNode;
            if(nextNode != null){
                nextNode = nextNode.next; 
            }
        } 
        return prevNode;
    }
    
    public static void display(ListNode head) {
    	ListNode tempNode = head;
    	while(tempNode != null) {
    		System.out.print(tempNode.val  +" -> ");
    		tempNode = tempNode.next;
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
