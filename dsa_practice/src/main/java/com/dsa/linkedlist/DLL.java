package com.dsa.linkedlist;


// Doubly LinkedList implementations
public class DLL {
	
	private Node head;
	private Node tail;
	private int size;
	
	public DLL() {
		this.size = 0;
	}
	
	public void insertFirst(int value) {
		Node node = new Node(value);
		if (head == null) { // If head is null means there is no elements is in the LinkedList
			// Thats why we set newNode to head as well as tail because in the LinkedList this is first element we inserting
			head = node;
            tail = node;
            size++;
            return;
        }
		node.next = head;
		node.prev = null;
		head.prev = node;	
		head = node;
		size++;
	}
	
	public void insertLast(int val) {
		Node newNode = new Node(val);
		
	// Approach : Using tail we add node at Last of LL
//        if (head == null) { // If head is null means there is no elements is in the LinkedList
//        	// Thats why we set newNode to head as well as tail because in the LinkedList this is first element we inserting
//            head = newNode;
//            tail = newNode;
//        } else {
//        	// Head is not null means tail also not null
//            tail.next = newNode; // Set tail-> next = newNode
//            newNode.prev = tail; // Set newNode-> prev = tail
//            tail = newNode; // set newNode as tail
//        }
//        size++;
        
     // Approach : Without using tail (So we use head) we add Node at Last
        if (head == null) { // If head is null means there is no elements is in the LinkedList
        	// Thats why we set newNode to head as well as tail because in the LinkedList this is first element we inserting
            head = newNode;
            tail = newNode;
        }
        else {
        	Node tempNode = head;
            while(tempNode.next != null) { // Traverse through tempNode
    			tempNode = tempNode.next;
    		}
            tempNode.next = newNode;
            newNode.prev = tempNode;
            tail = newNode;
        }
        size++;
	}
	
//	// Insert a value at particular index, For that we can traverse via head or tail no matter
//	public void insert(int val, int index) {
//		if(index == 0) { // Index is equal to 0 means insert value at First
//			insertFirst(val);
//			return;
//		}
//		System.out.println(size);
//		if(index == size) { // Index is equal to size means insert value at Last 
//			insertLast(val);
//			return;
//		}
//		Node temp = head;
//		for(int i = 1; i < index; i++) { // Iterate index - 1 because we need to add at that index
//			temp = temp.next;
//		}
//		Node node = new Node(val, temp.next); // Pass the value and pass the next Node reference
//		temp.next = node;
//		size++;
//	}
	
	// Insert a value after a particular element
	public void insert(int after, int val) {
		Node prevNode = find(after);
		if(prevNode == null) {
			System.out.println("Node does not exist...");
			return;
		}
		Node node = new Node(val);
		node.next = prevNode.next;
		node.prev = prevNode;
		prevNode.next = node;
		if(node.next != null) {
			node.next.prev = node;
		}
		size++;
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
	
	public void display() {
		Node tempNode = head;
		while(tempNode != null) {
			System.out.print(tempNode.value + " -> ");
			tempNode = tempNode.next;
		}
		System.out.println("END");
	}
	
	public void displayReverse() {
		Node tempNode = head;
		Node last = null; // Stores last node
		while(tempNode != null) {
			last = tempNode; // Use last go last node only
			tempNode = tempNode.next;
		}
		// Print LinkedList reverse
		while(last != null) {
			System.out.print(last.value + " -> ");
			last = last.prev;
		}
		System.out.println("START");
	}
	
	private class Node{
		int value;
		private Node next;
		private Node prev;
		
		public Node(int value) {
			this.value = value;
		}
		
		public Node(int value, Node next, Node prev) {
			this.value = value;
			this.next = next;
			this.prev = prev;
		}
	}

}
