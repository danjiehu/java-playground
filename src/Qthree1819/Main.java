package Qthree1819;

// import java.util.*;
// import java.io.*;


// 1. serialize
// 2. deserialize (added by myself)
// 3. abstract vs. concrete class
// 4. inheritance - Mystery inherits Book, Classic inherits Book
// 5. Composition/Aggregation - BookCollection has Books - Book has a ISBN
// 6. interface - implements Serializable

public class Main {

	
	public static void main(String[] args) { // DO NOT FORGET TO INCLUDE MAIN METHOD
		
		// book collection
		BookCollection bc = new BookCollection();
		
		Mystery mysteryBook1 = new Mystery("mysteryTitle", "isbn0001");
		Classic classicBook1 = new Classic("classicTitle", "isbn0005");
		
		bc.addBooks(mysteryBook1);
		bc.addBooks(classicBook1);
		
		// displayng content
		bc.printCollection();
		
		// serialize the list
		bc.serialize();
		bc.deserialize();
		
	} // end of main
	
} // end of class
