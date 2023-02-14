public class Book {
 
	
		String title, author;
		int noOfCopies;
		
		public Book(String title, String author, int noOfCopies) {
			this.title = title ; 
			this.author = author ; 
			this.noOfCopies = noOfCopies ; 

	}

		
		public String toString() {
			String  book  = title=" + title + ", author=" + author + ", noOfCopies=" + noOfCopies + ";
			return  book ;
		}
}
		
	
