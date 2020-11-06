package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest7 {
	
	MyLinkedList<String> myList= new MyLinkedList<String>();
	Node <String> firstNode = new Node<String>();
	Node <String> lastNode = new Node<String>();

	String returned;
	String toString = "[Charles, Montogmery, Starr, III]";
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
	int index3=3;
	int size=0;

	// Test MyLinkedList.toString()
	@Test
	void test() 
	{	
		myList.addFirst(insertFirst);
		myList.addLast(insertSuffx);
		myList.add(insertMid, index1);
		myList.add(insertLast, index2);	
		size = myList.size();
		returned= myList.toString();
		
		assertEquals(toString, returned);
	}
}
