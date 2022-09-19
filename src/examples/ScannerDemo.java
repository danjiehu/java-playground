package examples;

import java.util.Scanner;

// demonstrate the use of java.util.Scanner
// demonstrate the use of printf() to print integer and double number specifying decimal places

public class ScannerDemo {
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		// dealing with integer
		System.out.print("Enter an integer: ");
		int number = s.nextInt();
		System.out.printf("The integer entered is: %d \n", number);
		
		
		// dealing with float
		System.out.print("Enter a float with 2 decimals: ");
		double number2 = s.nextDouble();
		System.out.printf("The float enter is: %.2f ", number2);
		
		s.close();
		
	} // end of main
} // end of class
