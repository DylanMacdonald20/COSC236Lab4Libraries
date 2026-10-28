package library;
//Dylan Macdonald made this code
public class Book {

	// GRASP Principle: Information Expert
	// Manages its own state (available or borrowed).
	private String title;
	private boolean isAvailable; 
	
	// DONE: implement Book functionality 
	public Book(String title) {
		this.title = title;
		this.isAvailable = true;
	}
	public String getTitle(){
		return this.title;
	}
	public boolean isAvailable() {
		return this.isAvailable;
	}
	public void borrowBook() {
		this.isAvailable = false;
	}
	public void returnBook() {
		this.isAvailable = true;
	}
	
}
