package Scanner;

import java.util.Scanner;

public class Tester {
	
	  public static void main(String[] args) {
		  
	    Scanner input = new Scanner(System.in);
	    System.out.print("Enter your first name: ");
	    String firstName = input.nextLine();
	    input.close();

	    input = new Scanner(System.in);
	    System.out.print("Enter your last name: ");
	    String lastName = input.nextLine();
	    input.close();

	    System.out.println("Hello, " + firstName + " " + lastName + "!");
	  }
	
} // end of class
