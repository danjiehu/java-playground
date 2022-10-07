package examples;

import java.util.Scanner;

public class SentinelControlledLoop {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		
		int number = 0;
		
		while (number != -1) {
			
			System.out.print("enter an number to continue: ");
			number = s.nextInt();
			System.out.println("current number is: " + number);
			
		}
		
		System.out.println("Program terminated. ");
		
		s.close();
	} //end of main
} // end of class
