package weekthree;

import java.util.Scanner;

public class WhilePgm8 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		whileAverageSentinel();
	} // end of main
	
	public static void whileAverageSentinel() {
		
		double sum = 0;
		int count = 0;
		
		System.out.println("(enter -1 to exit) Please enter a number: ");
		double num = sc.nextDouble();
		
		while (num != -1) {
			
			sum += num;
			count++;
			
			System.out.println("(enter -1 to exit) Please enter a number: ");
			num = sc.nextDouble();
		}
		
		if (count == 0) {
			System.out.println("No numbers entered. ");
		} else {
			double average  = sum / count;
			System.out.println("The average is " + average);
		}
		
	} // end of method

} // end of class
