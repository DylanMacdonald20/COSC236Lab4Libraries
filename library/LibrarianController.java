package library;

public class LibrarianController {

	// GRASP Principle: Controller
	// Handles user requests like borrowing and returning books.
	// Delegates tasks to the appropriate objects.
	
	// TODO: implement functionality of Member class
	public Library library;
	public void addBookToCatalog(Book b) {
		 this.library.addBook(b);
	}
	
	public void borrowBook(Book b) {
		b.borrowBook();
	}
	
	public String getCatalog() {
		return this.library.toString();
	}

}
