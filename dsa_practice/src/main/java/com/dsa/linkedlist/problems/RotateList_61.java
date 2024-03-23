package com.dsa.linkedlist.problems;

import java.util.Iterator;

public class RotateList_61 {

		private ListNode head;
		
		public static void main(String[] args) {
			RotateList_61 list = new RotateList_61();
			
//			ListNode node8 = list.new ListNode(8);
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
	        
	        ListNode ansHead = rotateList(list.head, 15); // rotate list 3 times
	        
	        System.out.print("K groups List : ");
	        display(ansHead);

		}
		
		public static ListNode rotateList(ListNode head, int k) {
			// Check if the linked list is empty, has only one node, or if k is 0
			if(head == null || head.next == null || k <= 0) { // base condition
				return head;
			}
			
			ListNode tempNode = head;
			int len = 1; // Initialize first length to 1
			
			// Traverse the linked list to find last node and its length
			while(tempNode.next != null) {
				tempNode = tempNode.next;
				len++;
			}
			
			ListNode lastNode = tempNode; // Assigns tempNode as a lastNode for code understanding
			lastNode.next = head; // Make the linked list circular by connecting the last node to the head

			// Calculate the effective number of rotations by taking the modulo of 'k' with the length of the list 
			int rotations = k % len; // If k == len of list then no rotations are needed
			int skip = len - rotations; // Calculate the number of nodes to skip to find the new last node after rotation
			
			ListNode newLastNode = head;  // Initialize a pointer to the head to traverse the list to find the new last node
			
			// Traverse the list to find the new last node after rotation
			for(int i = 0; i < skip - 1; i++) {
				// Move the pointer to the next node to find the new last node after rotation
				newLastNode = newLastNode.next;
			}
			
			head = newLastNode.next; // Update the head to the node after the new last node
			newLastNode.next = null; // Disconnect the new last node from the list
			
			return head; // Return the head of the rotated linked list
			
// 			//Brute-force Approach but it exceed time limit			
//			// Perform rotation k times
//			while(k > 0) {
//			    // Traverse the list to find the second-to-last node
//	            ListNode temp = head;
//	            while (temp.next.next != null) {
//	                temp = temp.next;
//	            }
//	            
//	            // Detach the last node and set it as the new head
//	            ListNode newHead = temp.next;
//	            temp.next = null;
//	            
//	            // Set the next of the new head to the original head
//	            newHead.next = head;
//	            
//	            // Update the head to the new head for the next iteration
//	            head = newHead;
//	            
//	            // Decrement k to continue with the next rotation step
//	            k--;
//			}
//			
//			return head; // Return the final rotated linked list head
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
