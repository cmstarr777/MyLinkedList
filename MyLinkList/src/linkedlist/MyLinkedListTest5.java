package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest5 {
	
	MyLinkedList<String> myList= new MyLinkedList<String>();
	Node <String> firstNode = new Node<String>();
	Node <String> lastNode = new Node<String>();
	String insertFirst = "Charles";
	String insertMid  = "Montogmery";
	String insertLast = "Starr";
	String insertSuffx = "III";
	String firstName;
	String MiddleName;
	String lastName;
	String suffix;
	String data;
	int index1=1;
	int index2=2;
	int size=0;

	// Test MyLinkedList.add()
	@Test
	void test() 
	{	
		myList.addFirst(insertFirst);
		myList.addLast(insertSuffx);
		myList.add(insertMid, index1);
		myList.add(insertLast, index2);	
		firstName= myList.firstNode.getData();
		MiddleName=myList.firstNode.getNext().getData();
		lastName=myList.firstNode.getNext().getNext().getData();
		suffix=myList.firstNode.getNext().getNext().getNext().getData();
		size = myList.size();
		
		myList.print();
		
		assertEquals(4, size);
		assertEquals(insertFirst, firstName);
		assertEquals(insertMid, MiddleName);
		assertEquals(insertLast, lastName);
		assertEquals(insertSuffx, suffix);
	}
}
