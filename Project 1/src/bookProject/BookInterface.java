package bookProject;

public interface BookInterface <T> {
	
	/*
	 * Push new title of book onto stack
	 * 
	 * @param Title of the book
	 * @return true if successfully added, else false if error occurs
	 */
	public boolean push (T newTitle);
	
	/*
	 * Remove title of book on top of stack
	 * 
	 * @return title at top of stack
	 * @throws EmptyStackException() if empty
	 */
	public T pop ();
	
	/*
	 * Return title on top of stack
	 * 
	 * @return title
	 * @throws EmptyStackException() if empty
	 */
	public T peek ();
	
	/*
	 * Remove all titles from stack
	 */
	public void clear ();
	
	/*
	 * Check if stack is empty
	 * 
	 * @return true if stack is empty, false if stack has elements
	 */
	public boolean isEmpty ();
	
}
