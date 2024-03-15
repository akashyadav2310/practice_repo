package com.dsa.linkedlist.problems;

// https://leetcode.com/problems/sort-list/
public class SortList_148 {

	private ListNode head;
	
	public static void main(String[] args) {
		SortList_148 list = new SortList_148();
		
//		ListNode node8 = list.new ListNode(8);
//		ListNode node7 = list.new ListNode(7, node8);
//		ListNode node6 = list.new ListNode(6, node7);
        ListNode node5 = list.new ListNode(2);//, node6);
        ListNode node4 = list.new ListNode(5, node5);
        ListNode node3 = list.new ListNode(1, node4);
        ListNode node2 = list.new ListNode(6, node3);
        ListNode node1 = list.new ListNode(4, node2);
        
        list.head = node1; // Assigning the head of the linked list
        
        ListNode ansHead = sortList(list.head);
        System.out.print("Sorted List : ");
        display(ansHead);

	}
	
	public static ListNode sortList(ListNode head) {
		if(head == null || head.next == null)
			return head;
		
		ListNode mid = getMidNode(head); // Get middle Node
		
		ListNode left = sortList(head); // Uses recursion splits the list into two parts (left and right) and last merge both left & right and returns the merged list 
		ListNode right = sortList(mid);
		
		return mergeLists(left, right); // last merge both left & right and returns the merged list 
	}
	
	// Merge the lists using given heads of both lists
	private static ListNode mergeLists(ListNode list1Node, ListNode list2Node) {
		
		if(list1Node == null)
			return list2Node;
		
		if(list2Node == null)
			return list1Node;
		
		SortList_148 dummyList = new SortList_148();
		
		ListNode dummyHead = dummyList.new ListNode();
		ListNode dummyTail = dummyHead; // Initially both dummyHead and dummyTail are null
		while(list1Node != null && list2Node != null) {
			if(list1Node.val < list2Node.val) {
				dummyTail.next = list1Node;
				list1Node = list1Node.next;
			}else {
				dummyTail.next = list2Node;
				list2Node = list2Node.next;
			}
			dummyTail = dummyTail.next;
		}
		
		dummyTail.next = (list1Node != null) ? list1Node : list2Node;
		return dummyHead.next;
	}
	
	static ListNode getMidNode(ListNode head) {
		ListNode prev = null, slow = head, fast = head; // Set all prev, slow, head = null
	    
	    while (fast != null && fast.next != null) { // The loop while continues until either fast reaches the end of the list or fast.next (which is ahead of fast) reaches the end.
	      prev = slow; // In each iteration of the loop, prev is updated to slow
	      slow = slow.next; // slow moves one step forward (slow = slow.next)
	      fast = fast.next.next; // And fast moves two steps forward (fast = fast.next.next)
	    }
	    
	    prev.next = null; // After the loop, prev is the node just before the middle node, disconnects the second half of the linked list from the middle node. This effectively splits the linked list into two separate lists.
	    return slow;
	}
	
	private static void display(ListNode head) {
		while(head != null) {
        	System.out.print(head.val + " -> ");
        	head = head.next;
        }
		System.out.println("END");
	}
	
	private class ListNode {
	     
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
