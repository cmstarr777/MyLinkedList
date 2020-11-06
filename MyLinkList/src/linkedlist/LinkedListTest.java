package linkedlist;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LinkedListTest {
	
	Node <String> firstNode = new Node();

	// Test setData & getData
	@Test
	public void testData() 
	{
		firstNode.setData("Charles");
		String data = firstNode.getData();
		assertEquals("Charles", data);
	}
}
