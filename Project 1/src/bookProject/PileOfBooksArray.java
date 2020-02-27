package bookProject;

import java.util.EmptyStackException;

public class PileOfBooksArray <T> implements BookInterface<T> 
{
	public T[] titleArray;
	private int qtyOfItems;
	
	// MIN and MAX are small for ease of testing the resizable array
	private final int MIN_SIZE = 3;
	private final int MAX_SIZE = 6;
	
	@SuppressWarnings("unchecked")
	public PileOfBooksArray () 
	{
		titleArray = (T[]) new Object [MIN_SIZE];
		qtyOfItems = 0;
	}

	public boolean push(T newTitle) 
	{
		// Check if array is full, if so double size
		if (qtyOfItems == titleArray.length)
		{
			// Check if array is already at max size & full, if so do not add to array, else resize
			if (qtyOfItems == MAX_SIZE) 
				return false;
			resize();
		}	
		
		// Add element to array
		titleArray[qtyOfItems] = newTitle;
		qtyOfItems ++;
		return true;
	}
	
	@SuppressWarnings("unchecked")
	private void resize () 
	{
		// Create a temporary array
		T[] tempArray = titleArray;
		// Set the size of titleArray to double its previous size or to MAX_SIZE, whichever is smaller
		titleArray = (T[]) new Object [Math.min(qtyOfItems*2, MAX_SIZE)];
		// Copy the elements (going from index 0) of the temporary array to the (going from index 0) newly resized titleArray 
		System.arraycopy(tempArray, 0, titleArray, 0, qtyOfItems - 1);
	}


	public T pop() 
	{
		// Check if the stack is empty
		if (isEmpty())
			throw new EmptyStackException();
		
		// Decrease the amount of items, set the index to null to ensure the data is deleted, and return the element to the user
		qtyOfItems--;
		T temp = titleArray [qtyOfItems];
		titleArray [qtyOfItems] = null;
		return temp;
	}

	public T peek() 
	{
		if (isEmpty())
			throw new EmptyStackException();
		
		return titleArray [qtyOfItems - 1];
	}

	public void clear() 
	{
		while (!isEmpty()) 
		{
			pop();
		}
	}

	public boolean isEmpty() 
	{
		return qtyOfItems == 0;
	}

}
