package Qthree1819;

import java.io.*; // ! important

// If the superclass is Serializable, then by default, 
// every subclass is serializable. 
// Hence, even though subclass doesn't implement Serializable 
// we can serialize subclass object.

public abstract class Book implements Serializable {
	
	// ISBN has to implement Serializable!! 
	
	// this is the abstract super class 

	private static final long serialVersionUID = 1L;
	
	// member variables
	private String title;
	
	ISBN isbn = new ISBN();
	
	// constructors 
	public Book() { 
		// do nothing
	}
	
	public Book(String title, String isbnInput) {
		this.title = title;
		isbn.setISBN(isbnInput);
	}
	
	// member methods
	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String toString(){
		return "title: " + title + ", ISBN: " + isbn.getISBN();
	}
}
