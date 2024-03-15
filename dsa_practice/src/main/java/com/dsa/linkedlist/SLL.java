package com.dsa.linkedlist;

// Singly LinkedList implementations
public class SLL {

	private Node head;
	private Node tail;
	private int size;
	
	public SLL() {
		this.size = 0;
	}

	public static void main(String[] args) {
		
		SLL list = new SLL();
		
		Node node5 = list.new Node(5);
		Node node4 = list.new Node(4, node5);
		Node node3 = list.new Node(3, node4);
		Node node2 = list.new Node(2, node3);
		Node node1 = list.new Node(1, node2);
		
		list.head = node1;
		list.tail = node5;
		list.display();
		list.reverse(list.head);
		list.display();
	}
	
	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	
	public void insertLast(int val) {
		Node node = new Node(val);
		if(tail == null) { // tail ==null means we need to add the value as a head, means insertFirst
			// Instead of these 4 lines we also just call a method insertFirst(val); Because tail == null means the
//			node.next = head;
//			head = node;
//			size++;
//			tail = head;
			
			insertFirst(val);
			return;
		}
		tail.next = node;
		tail = node;
		size++;
	}
	
	// Insert a value at particular index
	public void insert(int val, int index) {
		if(index == 0) { // Index is equal to 0 means insert value at First
			insertFirst(val);
			return;
		}
		if(index == size) { // Index is equal to size means insert value at Last 
			insertLast(val);
			return;
		}
		Node temp = head;
		try {
			for(int i = 1; i < index; i++) { // Iterate index - 1 because we need to add at that index
				temp = temp.next;
			}
			Node node = new Node(val, temp.next); // Pass the value and pass the next Node reference
			temp.next = node;
		}catch(NullPointerException e) {
		    // Handle the exception
		    System.err.println("Error: Node not found - " + e.getMessage());
		    //e.printStackTrace(); // Print stack trace for debugging
		    System.err.println("Please enter a correct node index where you want to insert in the LinkedLIst");
		    return;
		}
		size++;
	}
	
	// Insert a value at particular index using Recursion
	public void insertRec(int val, int index)throws NodeNotFoundException {
		head = insertUsingRec(val, index, head); // Pass head first so we starts iterate and last we set returned node as a head again because returned node have all following nodes reference
	}
		
	private Node insertUsingRec(int val, int index, Node node) throws NodeNotFoundException {
		if(index == 0) { // Index is 0 means we need to add the given value at that position
			Node temp = new Node(val, node); // pass the given value and pass the node reference so we can set current node as the next node for the the new/temp node which was we creating 
			size++;
			return temp;
		}
		try {
			node.next = insertUsingRec(val, index - 1, node.next); // call recursively and set the node.next the returned value so LinkedList will not broken in the anywhere function call
		}catch(NullPointerException e) {
		    // Handle the exception
		    System.err.println("Error: Node not found - " + e.getMessage());
		    //e.printStackTrace(); // Print stack trace for debugging
		    System.err.println("Please enter a correct node index where you want to insert in the LinkedLIst");
		    return null;
		}
		return node; // return the node
	}
	
	public void display() {
		Node temp = head;
		if(head == null) {
			System.out.println("Linkedlist is empty..!");
			return;
		}
		while(temp != null) {
			System.out.print(temp.value + " -> ");
			temp = temp.next;
		}
		System.out.println("END");
	}
	
	public Node get(int index) {
		Node temp = head; // Get head into temp and iterate temp
		// If we iterate head = head.next then, the will be breaks
		for(int i = 0; i < index; i++) {
			temp = temp.next;
		}
		return temp;
	}
	
	public Node find(int value) {
		Node tempNode = head;
		while(tempNode != null) {
			if(tempNode.value == value) {
				return tempNode;
			}
			tempNode = tempNode.next;
		}
		return null;
	}
	
	public int deleteFirst() {
		int value = head.value;
		head = head.next;
		if(head == null) {
			tail = null;
		}
		size--;
		return value; // Return the value that is removed
	}
	
	public int deleteLast() {
		if(size <= 1) {
			deleteFirst();
		}
		Node secondLast = get(size - 2); // (size - 3) means get the second last node, because size is already +1 so for second last node we pass (size - 3) 
		int value = tail.value;
		tail = secondLast;
		tail.next = null;
		size--;
		return value;
	}
	
	public int delete(int index) {
		if(index == 0) {
			return deleteFirst();
		}
		if(index == size - 1) {
			return deleteLast();
		}
		Node prevNode = get(index - 1);
		int value = prevNode.next.value; // Taking an value of which node we want to delete for return
//		Node nextNode = get(index + 1);
//		prevNode.next = nextNode;
		prevNode.next = prevNode.next.next;
		return value;
	}
	
	// 83. Remove Duplicates from Sorted List (https://leetcode.com/problems/remove-duplicates-from-sorted-list/description/)
	public void deleteDuplicates() {
		Node node = head;
		while(node.next != null) { // Iterate till next node is null
			if(node.value == node.next.value) { // Check node's value and node.next's value is same or not
				node.next = node.next.next; // If both are same then we set node.next reference is node.next.next means we skip the node.next node
				size--; // Size--, because we skipped the same value node
			}else {
				node = node.next; // Else we move to next node
			}
		}
		tail = node; // Set tail = node, Because In the while loop we are at the last node, where node is last(if last value is unique) else not last(if the there next values are same)
		tail.next = null;
	}
	
	// Reverse the linkedList using recursion
    private void reverse(Node node) {
        if (node == tail) {
            head = tail;
            return;
        }
        reverse(node.next);
        tail.next = node;
        tail = node;
        tail.next = null;
    }
	
	private class Node{
		
		private int value;
		private Node next;
		
		public Node(int value) {
			this.value = value;
		}

		public Node(int value, Node next) {
			this.value = value;
			this.next = next;
		}
	}

}
