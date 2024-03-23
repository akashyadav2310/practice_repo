package com.dsa.linkedlist.problems;


// This method is designed to reverse a portion of a singly linked list, specified by the left and right indices
// https://leetcode.com/problems/reverse-linked-list-ii/description/
public class ReverseLinkedList_II_92 {
	
	ListNode head;
	
	public static void main(String[] args) {
		ReverseLinkedList_II_92 list = new ReverseLinkedList_II_92();
		
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
        
        ListNode reverseListHead = reverseListBetween(list.head, 2, 4);
        
        System.out.print("Reverse List  : ");
        display(reverseListHead);	
	}
	
	// Method for reversing a singly-linked list. (Note : head of the linkedList is given)
	private static ListNode reverseListBetween(ListNode head, int left, int right) {
		if(left == right) { // If left and right are the same, it means there's nothing to reverse
			return head; // so the method returns the original head unchanged.
		}
		
		// Skip the first left - 1 nodes
		ListNode currentNode = head; // Represents the current node being processed, initially set to the input head.
		ListNode prevNode = null; // // Initialized to null because there's no previous node initially.
		for(int i = 0; currentNode != null && i < left -1; i++) { // Iterates through the linked list to find the node at index left
			prevNode = currentNode;
			currentNode = currentNode.next;
		}
		
		ListNode lastLeftNode = prevNode; // holds the node before the segment to be reversed.
		ListNode newListStartNode = currentNode; // holds the node at position left, which will be the new start of the reversed segment.
		
		// Iterates through the segment to be reversed (left to right) and reverses the links between nodes to reverse the segment.
		ListNode nextNode = currentNode.next; 
		for(int i = 0; currentNode!= null && i < right - left + 1; i++) {
			currentNode.next = prevNode; //  currentNode.next is updated to point to prevNode, effectively reversing the direction of the current node.
			prevNode = currentNode; // prevNode is updated to currentNode
			currentNode = nextNode; //  and currentNode is updated to nextNode.
			if(nextNode != null) { // If nextNode is null
				nextNode = nextNode.next; // it moves to the next node in the original list
			}
		}
		
		// It updates the pointers to connect the reversed segment to the rest of the list
		if(lastLeftNode != null) {  // if lastLeftNode exists
			lastLeftNode.next = prevNode; // lastLeftNode.next is updated to point to the new start of the reversed segment (prevNode)
		}else {
			head = prevNode; // Otherwise, it updates head.
		}
		
		newListStartNode.next = currentNode; // newListStartNode.next is updated to point to the node after the reversed segment (currentNode).
		
		return head; // returns the updated head
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
