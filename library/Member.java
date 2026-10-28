package library;

import java.util.ArrayList;
import java.util.List;
// Dylan Macdonald worked on this code
public class Member {

	// GRASP Principle: Information Expert and Low Coupling
	// Can borrow and return books.

	private String name;
	// private borrowedbBooks DONE: implement collection of borrowed books
	List<Book> borrowedBooks = new ArrayList<>();
	
	// DONE: implement functionality of Member class
	public Member(String name) {
		this.name = name;
	}
	public String getName() {
		return this.name;
	}
	public void addBook(Book b) {
		borrowedBooks.add(b);
	}
	public void returnBook(Book book) {
		if(borrowedBooks.contains(book)) {
			book.returnBook();
		}else {
			return;
		}	
	}

}
