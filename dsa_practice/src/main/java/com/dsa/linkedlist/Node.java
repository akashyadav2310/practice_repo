package com.dsa.linkedlist;

public class Node {
	
	public int value; // Node value
	public Node next; // Next Node reference
	
	public Node(){
		
	}
	
	public Node(int value) {
		this.value = value;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

}
