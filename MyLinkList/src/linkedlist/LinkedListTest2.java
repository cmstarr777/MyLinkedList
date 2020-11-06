package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest2 {
	
	Node <String> firstNode = new Node();
	Node <String> lastNode = new Node();

	// Test setNext & getNext
	@Test
	void testNext() {
		firstNode.setNext(lastNode);
		Node next = firstNode.getNext();
		assertEquals(lastNode, next);
	}

}
