package com.dsa.linkedlist.problems;

// https://leetcode.com/problems/palindrome-linked-list/description/
public class Palindrome_Linked_List_234 {
	
	private ListNode head;
	
	public static void main(String[] args) {
		Palindrome_Linked_List_234 list = new Palindrome_Linked_List_234();
		
//		ListNode node8 = list.new ListNode(8);
		ListNode node7 = list.new ListNode(1);//, node8);
//		ListNode node6 = list.new ListNode(2, node7);
//        ListNode node5 = list.new ListNode(3, node6);
        ListNode node4 = list.new ListNode(4, node7);
        ListNode node3 = list.new ListNode(3, node4);
        ListNode node2 = list.new ListNode(2, node3);
        ListNode node1 = list.new ListNode(1, node2);
        
        list.head = node1; // Assigning the head of the linked list
        
        System.out.print("Original List : ");
        display(list.head);
        ListNode revNode = reverseList(list.head);
        display(revNode);
        
        System.out.print("Palindrome List : " +isPalindrome(list.head));
       
	}
	
	// Method for reversing a singly-linked list. (Note : head of the linkedList is given)
	private static boolean isPalindrome(ListNode head) {
		
		if(head == null || head.next == null) { // If the head is null or the linked list contains only one node (head.next == null), it's considered a Palindrome
			return true;
		}
		
		// To find middle of the list
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) { // When fast reaches the end of the list, slow will be at the middle
			slow = slow.next; //  slow moves one step at a time
			fast = fast.next; //  while fast moves two steps at a time
		}
		
		// Reverse the second half
		ListNode prevNode = null;
		ListNode midNode = slow; // slow will be at the middle. (midNode means present node)
		ListNode nextNode = midNode.next;
		while(midNode != null) { // The traversal continues until midNode reaches null, indicating the end of the second half
			midNode.next = prevNode; // midNode.next is updated to point to prevNode, effectively reversing the direction of the current node.
			prevNode = midNode; // prevNode is updated to midNode (present Node)
			midNode = nextNode; // and midNode is updated to nextNode
			if(nextNode != null) { // nextNode is not null
				nextNode = nextNode.next; // it moves to the next node in the original list
			}
		}
		
		// Once the second half is reversed, the program compares the original first half of the linked list with the reversed second half. 
		// It does this by using two pointers, left starting from head and right starting from the end of the list (stored in prevNode after reversal).
		// Compare both the half
		ListNode left = head;
		ListNode right = prevNode;
		while(right != null) { //The comparison continues until right reaches the end of the reversed list.
			if(left.val != right.val) { //  If at any point the values of corresponding nodes differ, the function returns false,
				return false;
			}
			// The comparison proceeds node by node, moving left forward and right backward. 
			// At each step, the values of the corresponding nodes are compared.
			left = left.next;
			right = right.next;
		}
		
		return true;
		
		// Approach 2 (Takes more Time Complexity)
//		ListNode mid = getMidNode(head);
//        ListNode headSecond = reverseList(mid);
//        ListNode rereverseHead = headSecond;
//
//        // compare both the halves
//        while (head != null && headSecond != null) {
//            if (head.val != headSecond.val) {
//                break;
//            }
//            head = head.next;
//            headSecond = headSecond.next;
//        }
//        reverseList(rereverseHead);
//
//        return head == null || headSecond == null;
	}
	
	private static ListNode getMidNode(ListNode head) {
		ListNode slow = head;
		ListNode fast = head;
		while(fast != null && fast.next != null) {
			slow = slow.next;
			fast = fast.next.next;
		}
		return slow;
	}

	private static ListNode reverseList(ListNode midNode) {
		if(midNode == null)
			return midNode;
		ListNode prevNode = null;
		ListNode presentNode = midNode;
		ListNode nextNode = midNode.next;
		while(presentNode != null) {
			presentNode.next = prevNode;
			prevNode = presentNode;
			presentNode = nextNode;
				if(nextNode != null) {
					nextNode = nextNode.next;
				}
		}
		
		return prevNode;
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
