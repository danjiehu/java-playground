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
	
	public boolean addBooks(Book b) {
		return  bookList.add(b);
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
			
			System.out.printf("\nfile serialized\n");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void deserialize() {
		try {
			FileInputStream fileStream = new FileInputStream("src/Qthree1819/bookCollection.dat");
			
			ObjectInputStream os = new ObjectInputStream(fileStream);
			
			@SuppressWarnings("unchecked")
			List<Book> bl = (List<Book>)os.readObject();
					
			System.out.printf("\nfile deserialized\n");
			
			for (Book book : bl) {
				System.out.println(book.toString());
			}
			
			os.close();
		} 
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public void printCollection() {
		for (Book b : bookList) {
			System.out.println(b.toString());
		}
	}
	
}
