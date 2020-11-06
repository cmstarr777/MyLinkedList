package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyLinkedListTest3 {
	
	MyLinkedList<String> myList= new MyLinkedList<String>();
	Node <String> firstNode = new Node<String>();
	Node <String> lastNode = new Node<String>();
	String insertFirst = "Charles";
	String insertLast = "Starr";
	String data;

	// Test MyLinkedList.addLast()
	@Test
	void test() 
	{
		myList.addFirst(insertFirst);
		myList.addLast(insertLast);
		data = myList.lastNode.getData();
		int size = myList.size();
		System.out.println(size);
		assertEquals(data, "Starr");
	}
}
