package Qthree1819;

import java.io.Serializable;

public class ISBN implements Serializable {
	
	// ISBN has to implement Serializable!! 
	
	private static final long serialVersionUID = 1L;
	
	private String isbn;
	
	// constructor
	public ISBN() {
		// do nothing
	};
	
	public void setISBN(String isbn){
		this.isbn = isbn;
	}
	
	public String getISBN() {
		return isbn;
	}
}
