package library;
//Simplified verion of Library Management System

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;


public class LibraryApp {

	private Library lib = new Library();
	 private LibrarianController librarian = new LibrarianController(lib);

	 // Adds a book to the library catalog
	 public void addBook(Book book) {
		 this.librarian.addBookToCatalog(book);
	     System.out.println(book.getTitle() + " has been added to the catalog.");
	 }
	 
	// Removes a book from the library catalog
	public void removeBook(Book book) {
		if (book.isAvailable()) {
			this.lib.removeBook(book);
			System.out.println(book.getTitle() + " has been removed from the catalog.");
		} else {
			System.out.println(book.getTitle() + " is still being borrowed.");
		}
	}

	 // Adds a new member to the library (without a separate class)
	 public void addMember(Member m) {
		 this.lib.addMember(m);
		 System.out.println(m.getName() + " has been added to the member list.");
	 }
	 
	//Removes a member from the member list
	public void removeMember(Member m) {
		 this.lib.removeMember(m);
		 System.out.println(m.getName() + " has been removed from the member list.");
	}

	 // Borrow a book from the library
	 public void borrowBook(Book book, Member member) {
		 if (book.isAvailable()) {
			 member.addBook(book);
			 this.librarian.borrowBook(book);
			 System.out.println(book.getTitle() + " has been borrowed by " + member.getName() + ".");
		 } else {
			 System.out.println(book.getTitle() + " is not available to borrow.");
		 }
	 }

	 // Return a book to the library
	 public void returnBook(Book book, Member member) {
		 if (!book.isAvailable()) {
			 member.returnBook(book);
			 System.out.println(member.getName() + " has returned " + book.getTitle() + ".");
		 } else {
			 System.out.println(book.getTitle() + " has not been borrowed and is still available.");
		 }
	 }

	 // Lookup a book from the catalog
	 public void lookupBook (Book book) {
		 if (this.lib.getBook(book) != null) {
			 System.out.println("Found a matching book:");
			 System.out.println(book.toString());
		 } else {
			 System.out.println(book.getTitle() + " isn't in the catalog.");
		 }
	 }
	 
	 // Lookup a member from the member list
	 public void lookupMember (Member member) {
		 if (this.lib.getMember(member) != null) {
			 System.out.println("Found a matching member:");
			 System.out.println(member.toString());
		 } else {
			 System.out.println(member.getName() + " isn't in the members list.");
		 }
	 }
	 
	 // Show library catalog
	 public void showCatalog() {
		 System.out.println(this.librarian.getCatalog());
	 }
	 
	 // Show books that are available
	 public void showAvailableBooks() {
		 System.out.println("Available Books:");
		 for (Book b : this.lib.getCatalog()) {
			 if (b.isAvailable()) {
				 System.out.println(b);
			 }
		 }
	 }
	 
	 // Show all library members
	 public void showMembers() {
		 System.out.println("Library members:");
		 for (Member m : this.lib.getMemberList()) {
			 System.out.println(m);
		 }
	 }
  
public static void main(String[] args) {
	
	LibraryApp library = new LibraryApp();

	 Book b1 = new Book("Dune");
	 Book b2 = new Book("1984");
	 Member alice = new Member("Alice");
	 Member bob = new Member("Bob");
	 
	 System.out.println(" *** Library management system demo *** ");
	 
   // Adding some books to the catalog
	System.out.println("\n *** Adding \"Dune\" to the library:");
	library.addBook(b1);
	
	System.out.println("\n *** Adding \"1984\" to the library:");
	library.addBook(b2); 

	
	// Look up some books
	System.out.println("Looking up some books...");
	library.lookupBook(b1);
	library.lookupBook(b2);
	
   // Show available books
   System.out.println("\n *** Show all books:");
   library.showAvailableBooks();
   
   // Adding members
   System.out.println("\n *** Adding \"Alice\" to the library members");
   library.addMember(alice);
   
   System.out.println("\n *** Adding \"Bob\" to the library members");
   library.addMember(bob);

   // Show members
   System.out.println("\n *** Show all members");
   library.showMembers();
   
   // Borrow a book
   System.out.println("\n *** Alice borrows Dune:");
   library.borrowBook(b1, alice);

   // Show available books after borrowing
   System.out.println("\n *** Show all books:");
   library.showAvailableBooks();

   System.out.println("\n *** Bob borrows 1984:");
   library.borrowBook(b2, bob);
   
   // Show available books after borrowing
   System.out.println("\n *** Show all books:");
   library.showAvailableBooks();
   
   System.out.println("\nBob borrows Dune:");
   library.borrowBook(b1, bob);
   
   // Show available books after borrowing
   System.out.println("\n *** Show all books:");
   library.showAvailableBooks();
   
   // Return a book
   System.out.println("\n *** Alice returns Dune:");
   library.returnBook(b1, alice);

   // Show available books after returning
   System.out.println("\n *** Show all books:");
   library.showAvailableBooks();

   System.out.println("\n *** Bob borrows Dune:") ;
   library.borrowBook(b1, bob);
   
   // Remove a book
   library.removeBook(b2);
   library.returnBook(b2, bob);
   library.removeBook(b2);
   
   // Show available books after borrowing
   System.out.println("\n *** Show all books:");
   library.showAvailableBooks();
   
   // Remove a member
   library.removeMember(alice);
   
   // Show library catalog
   System.out.println("\n *** Show library catalog");
   library.showCatalog();

   // Show members
   System.out.println("\n *** Show all members");
   library.showMembers();
	}
}