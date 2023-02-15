public class BookStore {
	String name;
	Book[] books = new Book[10];

	public BookStore(String name) {
		
		this.name = name;
	}

	public void sell(String title, String author, int copies) {
		Book b = findBook(title, author);
		if(b != null) {
			if(b.noOfCopies>= copies)
				b.noOfCopies -= copies;
			else
				System.out.println("Not enough copies ");
		}
		else {
			System.out.println("Book is not available ");
		} 
	}
		public void order(String title, String author, int copies) {
			Book b = findBook(title, author);
			if(b != null) {
				b.noOfCopies += copies;
			}
				else {
						//Book  not available
						for(int i=0; i<books.length; i++) {
							if(books[i]==null) {
								books[i] = new Book(title, author, copies);
								break;
					}
				}
			}

		}      
		public Book findBook(String title, String author) {
			for(int i=0; i<books.length; i++) {
				if(books[i] == null)
					return null; // break;
				if(books[i].title.equals(title) && books[i].author.equals(author))
					return books[i];
			}

			return null; 

		}

		public void display(String title, String author) {
			Book b = findBook(title, author);
			System.out.println(b);
			
		}
		public void display() { 
			if(books[0] == null) 
				System.out.println("No books available.");
			for(int i=0; i<books.length; i++)
			{
				if(books[i]==null)
					break;
				System.out.println(books[i]);
			}

		}

	}

			
			 
			

		
		
		
