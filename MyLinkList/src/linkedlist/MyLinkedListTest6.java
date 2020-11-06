package linkedlist;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class MyLinkedListTest6 {
	
	MyLinkedList<String> myList= new MyLinkedList<String>();
	Node <String> firstNode = new Node<String>();
	Node <String> lastNode = new Node<String>();

	String removed;
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

	// Test MyLinkedList.remove()
	@Test
	void test() 
	{	
		myList.addFirst(insertFirst);
		myList.addLast(insertSuffx);
		myList.add(insertMid, index1);
		myList.add(insertLast, index2);	
		size = myList.size();
		System.out.println(myList);
		
		removed=myList.remove(index2);
		size = myList.size();
		System.out.println(myList);
		firstName= myList.firstNode.getData();
		lastName=myList.firstNode.getNext().getData();
		suffix=myList.lastNode.getData();
		
		assertEquals(3, size);
		assertEquals(insertFirst, firstName);
		assertEquals(insertLast, lastName);
		assertEquals(insertSuffx, suffix);
		assertEquals(insertMid, removed);
	
		removed=myList.remove(index2);
		size = myList.size();
		System.out.println(myList);
		
		
		firstName= myList.firstNode.getData();
		suffix=myList.lastNode.getData();
		
		assertEquals(2, size);
		assertEquals(insertFirst, firstName);
		assertEquals(insertSuffx, suffix);
		assertEquals(insertLast, removed);
	}

}
