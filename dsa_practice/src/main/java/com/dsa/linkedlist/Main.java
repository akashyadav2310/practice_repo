package com.dsa.linkedlist;

public class Main {

	public static void main(String[] args) {
		
//		// Singly LinkedList
//		SLL list = new SLL();
//		list.insertLast(5);
//		list.insertFirst(3);
//		list.insertFirst(2);
//		list.insertFirst(8);
//		list.insertFirst(5);
//
//		list.display();
//		
//		list.insert(9, 2);
//		list.insert(15,2);
//		list.display();
//		
//		//System.out.println("Removed First: " +list.deleteFirst());
//		System.out.println("Removed Last : " +list.deleteLast());
//		list.display();
//		
//		System.out.println("Removed Index : " +list.delete(2));
//		list.display();
		
		
//		DLL dlist = new DLL();
////		dlist.insertFirst(23);
////		dlist.insertFirst(15);
////		dlist.insertFirst(31);
////		dlist.insertFirst(7);
////		
////		dlist.insertLast(12);
//		dlist.insertLast(19);
//		dlist.insertFirst(27);
//		dlist.insertFirst(7);
//		dlist.insertLast(11);
//		dlist.insertFirst(8);
//		dlist.insertFirst(17);
//		
//		//dlist.insert(23, 0);
//		//dlist.insert(7, 51);
//		//dlist.display();
//		//dlist.insert(111, 29); // 111 Node does not exist in the linkedlist
//		dlist.insert(11, 29);
//		dlist.display();
//		//dlist.displayReverse();
		
		CLL listCll = new CLL();
		listCll.insert(12);
		listCll.insert(7);
		listCll.insert(19);
		listCll.insert(17);
		listCll.insert(9);
		
		listCll.display();
		listCll.delete(19);
		listCll.display();
		
	}

}
