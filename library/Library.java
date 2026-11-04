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
	
	public void removeBook(Book b) {
		catalog.remove(b);
	}
	public void removeMember(Member m) {
		members.remove(m);
	}
	
	public Book getBook(Book b) {
		return (catalog.contains(b))? catalog.get(catalog.indexOf(b)) : null;
	}
	
	public Member getMember(Member m) {
		return (members.contains(m))? members.get(members.indexOf(m)) : null;
	}
	
	public List<Book> getCatalog() {
		return catalog;
	}
	
	public List<Member> getMemberList() {
		return members;
	}
	
	public String toString() {
		String books = "";
		for(Book b : catalog) {
			books += b.toString();
		}
		return books;
	}

}
