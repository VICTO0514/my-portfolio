package oopAssignment;

public class Library {
	
	private String[] books;
	private int count;
	private static final int MAX_BOOKS = 200;
	
	public Library() 
	{
		this.books = new String[MAX_BOOKS];
		this.count = 0;
	}
	
	public void addBook(String book)
	{
		if(count < MAX_BOOKS)
		{
			books[count] = book;
			count++;
			System.out.println(book + " added to the library.");
		}
		else 
		{
			System.out.println("Library is full!");
		}
	}
	
	public void removeBook(String book)
	{
		for(int i=0; i<count; i++)
		{
			if(books[i].equals(book))
			{
				for(int j=1; j<count-1; j++)
				{
					books[j] = books[j + 1];
				}
				books[count - 1] = null;
				count--;
				System.out.println(book + " not found in the library.");
			}
		}
	}
	
	public void displayBooks()
	{
		if(count == 0)
		{
			System.out.println("No books in the library.");
		}
		else
		{
			System.out.println("Books in library.");
			for(int i=0; i<count; i++)
			{
				System.out.println(books[i]);
				if(i < count - 1) System.out.println(", ");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args)
	{
		Library lib = new Library();
		lib.addBook("To kill a Mockingbird");
		lib.removeBook("To kill a Mckingbird");
	
	}
}
