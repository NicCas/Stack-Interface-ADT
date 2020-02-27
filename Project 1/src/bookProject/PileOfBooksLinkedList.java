package bookProject;

import java.util.EmptyStackException;

public class PileOfBooksLinkedList <T> implements BookInterface<T>  
{
	Node header;
	
	public PileOfBooksLinkedList()
	{
		header = null;
	}
	
	public boolean push(T newTitle) 
	{
		// If list is empty newEntry.next will be null because header.next is null
		Node newEntry = new Node (newTitle, header);
		header = newEntry;
		return true;
	}

	public T pop() 
	{
		if (isEmpty())
			throw new EmptyStackException();
		
		T temp = header.getTitle();
		header = header.getNext();
		return temp;
	}

	public T peek() 
	{
		if (isEmpty())
			throw new EmptyStackException();
		
		return header.getTitle();
	}

	public void clear() 
	{
		while (!isEmpty()) 
			pop();
	}

	public boolean isEmpty() 
	{
		return header == null;
	}
	
	private class Node 
	{
		private T title;
		private Node next;
		
		private Node () 
		{
			title = null;
			next = null;
		}
		
		private Node (T newTitle)
		{
			title = newTitle;
			next = null;
		}
		
		private Node (T newTitle, Node nextNode)
		{
			title = newTitle;
			next = nextNode;
		}
		
		private T getTitle() 
		{
			return title;
		}
		
		
		private Node getNext()
		{
			return next;
		}
		
	}

}
