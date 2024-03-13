package com.dsa.linkedlist.problems;

import java.util.LinkedList;


public class MergeTwoSortedLists_21 {
	
	private ListNode head;
	private ListNode tail;
	private int size;
	
	public MergeTwoSortedLists_21() {
		this.size = 0;
	}

	public static void main(String[] args) {
		
		MergeTwoSortedLists_21 list1 = new MergeTwoSortedLists_21();
		list1.insertLast(1);
		list1.insertLast(3);
		list1.insertLast(5);
		
		MergeTwoSortedLists_21 list2 = new MergeTwoSortedLists_21();
		list2.insertLast(1);
		list2.insertLast(2);
		list2.insertLast(6);
		list2.insertLast(9);
		
		list1.display();
		list2.display();
		mergeTwoLists(list1, list2).display();
		

	}
	
	public static MergeTwoSortedLists_21 mergeTwoLists(MergeTwoSortedLists_21 list1, MergeTwoSortedLists_21 list2) {
		MergeTwoSortedLists_21 ansList = new MergeTwoSortedLists_21();
		ListNode firstHead = list1.head;
		ListNode secondHead = list2.head;
		while(firstHead != null && secondHead != null) {
			if(firstHead.val < secondHead.val) {
				ansList.insertLast(firstHead.val);
				firstHead = firstHead.next;
			}else {
				ansList.insertLast(secondHead.val);
				secondHead = secondHead.next;
			}
		}
		
		while(firstHead != null) {
			ansList.insertLast(firstHead.val);
			firstHead = firstHead.next;
		}
		
		while(secondHead != null) {
			ansList.insertLast(secondHead.val);
			secondHead = secondHead.next;
		}
		
       return ansList; 
    }
	
	public void insertFirst(int val) {
		ListNode node = new ListNode(val);
		node.next = head;
		head = node;
		
		if(tail == null) {
			tail = head;
		}
		size++;
	}
	
	public void insertLast(int val) {
		ListNode node = new ListNode(val);
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
	
	public void display() {
		ListNode temp = head;
		if(head == null) {
			System.out.println("Linkedlist is empty..!");
			return;
		}
		while(temp != null) {
			System.out.print(temp.val + " -> ");
			temp = temp.next;
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
