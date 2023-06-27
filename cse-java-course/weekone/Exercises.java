package weekone;

import java.util.Scanner;

public class Exercises {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		System.out.print(wasOjGuilty());
		
	} // end of main

	public static boolean wasOjGuilty() {
		System.out.print("Was OJ guilty?");
		Boolean userResponse = sc.nextBoolean();
		return userResponse;
	}
	
} // end of class 
