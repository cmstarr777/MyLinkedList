package linkedlist;

public class MyLinkedList<E> implements LinkedListInterface<E>  {
	
	public Node <E> firstNode;
	public Node <E> lastNode;
	public Node <E> insertItem;
	public String name;
	public Node <E> data;
	public Node<E> next=firstNode;
	
	private int size = 0;
	
	//public Object myList;
	
	public MyLinkedList() {this("myList");}
	
	public MyLinkedList(String listName) {
		name = listName;
		firstNode = lastNode=null;
	}
	
	public boolean isEmpty()
	{ 		
		 if (this.firstNode == null && this.lastNode == null) {
			 return true;
		 }
		 else
		 {
			 return false;
		 }
	}
	
	public int size() {

		return this.size;
	}

	public void addFirst(E data)
	{	
		Node <E> insertItem = new Node<E>();
		if (isEmpty() ) {
			firstNode = lastNode = insertItem;
		}
		else
		{		 
			insertItem.setNext(firstNode);
			firstNode = insertItem;
		}	
		this.firstNode.setData(data);
		this.size++;
	}
	
	public void addLast(E data)
	{
		if (isEmpty() ) {
			firstNode = lastNode = new Node<E>();
		}
		else
		{
			Node <E> insertItem = new Node<E>(); 
			insertItem.setNext(firstNode);
			lastNode.setNext(insertItem);
			lastNode = insertItem;
			lastNode.setNext(null);          
		}
		this.lastNode.setData(data);
		this.size++;
	}
	
	public void rangeCheck( int index) {
	     if (index > this.size())
	          throw new IndexOutOfBoundsException("Index(" + index + ") > capacity(" + size() +")");
	     if (index < 0) 
	          throw new IndexOutOfBoundsException(index);
	} 
	
	public E remove(int index) throws IndexOutOfBoundsException
	{
		rangeCheck(index);
		Node <E> removeNode = new Node<E>();
		Node <E> previousNode = new Node<E>();
		Node <E> currentNode = new Node<E>();
		currentNode= this.firstNode;
		
		int currentIndex = 1;
		
		if (isEmpty() )
		{
			System.out.println("The list is empty EXITING"  + "\n");
			int status=-1;
			System.exit(status);
		}
		else
		{														
		 do {				
			 	this.next = currentNode.getNext();
			 	//System.out.println("currentIndex= " + currentIndex + " index= " + index);
			 	if (currentIndex == index)
				{
			 			removeNode=currentNode;
			 		    previousNode.setNext(this.next);
			 		    System.out.println("\n" + removeNode.getData() + " was removed\n");
						break;
				}
			 	previousNode=currentNode;
			 	currentNode=this.next;			
				++currentIndex;
			} 
			while (this.next != this.lastNode );				
		}		
		this.size--;
		return  removeNode.getData(); 
	} 

	public void add(E data, int index) throws IndexOutOfBoundsException
	{
		rangeCheck(index);
		Node <E> insertItem = new Node<E>();
		insertItem.setData(data);
		Node <E> currentNode = new Node<E>();
		currentNode= this.firstNode;
		int currentIndex = 1;
		
		if (isEmpty() ) {
			this.firstNode = this.lastNode = insertItem;
		}
		else
		{														
		 do {				
			 	this.next = currentNode.getNext();
			 	if (currentIndex == index)
				{
			 		    insertItem.setNext(this.next);
			 		    currentNode.setNext(insertItem);
						break;
				}
			 	currentNode=this.next;			
				++currentIndex;
			} 
			while (this.next != this.lastNode );				
		}		
		this.size++;	
	}
	
	@Override
	public String toString() 
    {
		StringBuilder sb = new StringBuilder();		
		if (isEmpty() ) 
		{
			return "[]";
		}
		else
		{				
			sb.append('[');
			this.next = this.firstNode;
			sb.append(this.next.getData());
			do {
				this.next = this.next.getNext();
				sb.append(", ");
				sb.append(this.next.getData());				
			} 
			while (this.next != this.lastNode );
		}
		return sb.append(']').toString();
	}
	
	public void print() 
	{	
		size = this.size();
		this.next = this.firstNode;
		System.out.println(this.next.getData());
		
		do {
			this.next = this.next.getNext();
			System.out.println(this.next.getData());					
		} 
		while (this.next != this.lastNode );		
	}
	
}
