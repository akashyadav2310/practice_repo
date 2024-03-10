package com.dsa.linkedlist;

// Singly LinkedList implementations
public class SLL {

	private Node head;
	private Node tail;
	private int size;
	
	public SLL() {
		this.size = 0;
	}

	public void insertFirst(int val) {
		Node node = new Node(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size += 1;
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
		for(int i = 1; i < index; i++) { // Iterate index - 1 because we need to add at that index
			temp = temp.next;
		}
		Node node = new Node(val, temp.next); // Pass the value and pass the next Node reference
		temp.next = node;
		size++;
	}
	
	public void display() {
		Node temp = head;
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
		Node secondLast = get(size - 2); // (size - 2) means get the second last node
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
