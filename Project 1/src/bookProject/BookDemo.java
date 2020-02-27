package bookProject;

public class BookDemo {

	public static void main(String[] args) {
		
		BookInterface <String> libraryA = new PileOfBooksArray<>();
		
		libraryA.push("War and Peace");
		libraryA.push("Cookbooks");
		libraryA.push("Dictionary");
		
		// Array will resize here
		libraryA.push("Book D");
		libraryA.push("Book E");
		
		// Array is now full
		libraryA.push("Book F");
		
		System.out.println ("Another title can be added: " + libraryA.push("Book G"));
		
		System.out.println(libraryA.pop());
		System.out.println(libraryA.pop());
		
		System.out.println(libraryA.peek());
		
		libraryA.clear();
		
		//Throws EmptyStackException
		//libraryA.pop();
		//libraryA.peek();
		 
		
		BookInterface <String> libraryL = new PileOfBooksLinkedList<>();
		
		libraryL.push("War and Peace");
		libraryL.push("Cookbooks");
		libraryL.push("Dictionary");
		
		System.out.println(libraryL.pop());
		System.out.println(libraryL.pop());
		
		System.out.println(libraryL.peek());
		
		libraryL.clear();
		
		//Throws EmptyStackException
		//libraryL.pop();
		//LibraryL.peek();

	}

}
