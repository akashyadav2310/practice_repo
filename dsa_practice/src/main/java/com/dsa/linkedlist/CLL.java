package com.dsa.linkedlist;

public class CLL {

	private Node head;
	private Node tail;
	
	public CLL() {
		this.head = null;
		this.tail = null;
	}
	
	public void insert(int val) {
		Node node = new Node(val);
		if(head == null) { // If head is null then set node to both head and tail, because this is first element of linkedList
			head = node;
			tail = node;
			return;
		}// Else we set following values
		tail.next = node;
		node.next = head;
		tail = node;
	}
	
	public void display() {
		Node tempNode = head;
		if(tempNode != null) {
			do { // first we do (If head/tempNode is not null) print tempNode.value and then check while condition
				System.out.print(tempNode.value + " -> ");
				if(tempNode.next != null) {
					tempNode = tempNode.next;
				}
			}while(tempNode != head); // If tempNode == head means we iterate all elements of LL and now in again in head position/index
		}
		System.out.println("HEAD");
	}
	
	public void delete(int value) {
		
		if(head == null) {
			System.out.println("LinkedList is empty already");
			return;
		}
		// Check and head and tail are equals. Yes, then set both to null and return
		if (head == tail){
			head = null;
			tail = null;
			return;
	    }
		Node tempNode = head; // set tempNode = head
		if(tempNode.value == value) { // If head.value / tempNode.value is equal to value then remove head 
			head = head.next; // set head = head.next
			tail.next = head; // set tail.next = head
			return;
		}
		
		do {
			Node nextNode = tempNode.next;
			if(nextNode.value == value) {
				tempNode.next = nextNode.next;
				break;
			}	
		tempNode = tempNode.next;
		}while(tempNode != head);
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
