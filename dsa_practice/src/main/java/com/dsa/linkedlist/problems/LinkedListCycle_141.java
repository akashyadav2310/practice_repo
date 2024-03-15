package com.dsa.linkedlist.problems;


public class LinkedListCycle_141 {

	private ListNode head;
	
	public LinkedListCycle_141() {
	}
	
	public static void main(String[] args) {
		
		// Creating an instance of LinkedListCycle_141
        LinkedListCycle_141 list = new LinkedListCycle_141();
		
		// Creating nodes without linking them completely
		ListNode node9 = list.new ListNode(5);  // This node will be linked to node4
		ListNode node8 = list.new ListNode(-3);
		ListNode node7 = list.new ListNode(-6);
        ListNode node6 = list.new ListNode(7);
        ListNode node5 = list.new ListNode(9);
        ListNode node4 = list.new ListNode(2);
        ListNode node3 = list.new ListNode(4);
        ListNode node2 = list.new ListNode(3);
        ListNode node1 = list.new ListNode(1);
        
        // Linking nodes to form a cycle
        node9.next = node4; // linked last node to node 4 so cycle is created
        node8.next = node9;
        node7.next = node8;
        node6.next = node7;
        node5.next = node6;
        node4.next = node5;
        node3.next = node4;
        node2.next = node3;
        node1.next = node2;
        
        list.head = node1;  // Assigning the head of the linked list
        System.out.println(hasCycle(list.head));  
        
        System.out.println(cycleLength(list.head));
        
        System.out.println(detectCycle(list.head).val);

	}
	
	// https://leetcode.com/problems/linked-list-cycle/
	public static boolean hasCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){ // Check fast and fast.next is not null (We check only fast because fast iterate first)
            slow = slow.next; // move slow to next node
            fast = fast.next.next; // move fastNode to next of next
            if(fast == slow) // checks if slow and fast are same, if yes then we know the given LL is contains cycle in the list
                return true;
        }
    return false; // return false means any one of the while loop condition is false (means it goes to null listNode)
   }

	// Find the cycle length and return
	public static int cycleLength(ListNode head) {
		
		ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // If slow == fast, then we starts the length count
                ListNode tempNode = slow; // set slow node to tempNode for traversing a cycle
                int length = 0; // Initially length 0
                do{
                    tempNode = tempNode.next; // Iterate using tempNode.next
                    length++; // Increase the count
                }while(tempNode != slow); // first we do and then tempNode == fast we got the cycle length
                return length; // return the length of the cycle of node
            }
        }
        return -1; // Means there is no cycle present in the given LinkedList
	}

	// https://leetcode.com/problems/linked-list-cycle-ii/description/
	public static ListNode detectCycle(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow == fast){ // If slow == fast, then we starts the length count
                //ListNode tempNode = head; // set slow node to tempNode for traversing a cycle
                //int length = 0; // Initially length 0
                fast = head;
                while(slow != fast){ // first we do and then tempNode == fast we got the cycle length
                    slow = slow.next;
                    fast = fast.next;
                    if(slow == fast)
                        return slow;  // return any one slow or fast
                }
                //return length; // return the length of the cycle of node
            }
        }
        return null;
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
