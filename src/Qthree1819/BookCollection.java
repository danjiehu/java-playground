package Qthree1819;

import java.io.*;
import java.util.*;

public class BookCollection {
	
	// private static final long serialVersionUID = 1L;
	 
	List<Book> bookList = new LinkedList<Book>();
	
	// constructor
	public BookCollection(){
		// do nothing
	}
	
	// member methods
	public List<Book> getCollection(){
		return bookList;
	}
	
	public void addBooks(Book b) {
		 bookList.add(b);
	}
	
//	public boolean addBooks(Book b) {
//		return bookList.add(b);
//	}
	
	public boolean removeBooks(Book b) {
		return bookList.remove(b);
	}
	
	public void serialize() {
		try {
			
			FileOutputStream fileStream = new FileOutputStream("src/Qthree1819/bookCollection.dat");
			
			ObjectOutputStream os = new ObjectOutputStream(fileStream);
			
			os.writeObject(bookList);
			
			os.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printCollection() {
		for (Book b : bookList) {
			System.out.println(b.toString());
		}
	}
	
}
