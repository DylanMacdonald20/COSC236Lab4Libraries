package library;

import java.util.ArrayList;
import java.util.List;
//Dylan Macdonald made this code
public class Library {
	
	//  GRASP Principles: Creator, Controller
	//	Manage the catalog of books and members.
	//	Track which books are borrowed and available
	
	
	// Attributes:
	// private catalog (list of Book) 
	// private members (list of Members)

	// DONE: implement functionality of Member class
	private List<Member> members;
	private List<Book> catalog;
	public Library() {
		this.members = new ArrayList<>();
		this.catalog = new ArrayList<>();
	}
	public void addMember(Member m) {
		members.add(m);
	}
	public void addBook(Book b) {
		catalog.add(b);
	}
	

}
