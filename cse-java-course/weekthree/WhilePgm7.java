package weekthree;

import java.util.Scanner;

public class WhilePgm7 {
	
static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		whileSquares();
		
	} // end of main

	public static void whileSquares() {
		int i = 1, squared = 0, total = 0;
		
		while(i <= 5) {
			squared = (int)Math.pow(i, 2);
			total = total + squared;
			i++;
		} // end of while loop
		
		System.out.println("The total is " + total);
	} // end of method
	
} // end of class
