package weekthree;

import java.util.Scanner;

public class WhilePgm5 {
	
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		whileLargestSmallest();
		
	} // end of main
	
	// no.5: whileLargestSmallest()
	public static void whileLargestSmallest() {
		
		// 1. asking user for a number to be the number of numbers in sequence
		int i = 0;
		int smallest = Integer.MAX_VALUE;
		int largest = Integer.MIN_VALUE;
		
		System.out.print("Enter n --> ");
		int n = sc.nextInt();
		
		if (n<=0) {
			System.out.println("n was invalid" + n);
		} else {
			while (i < n) {
				System.out.print("Enter a number: ");
				
				int currNum = sc.nextInt();
				if(currNum > largest) 
					largest = currNum;
				
				if(currNum < smallest)
					smallest =  currNum; 
				i++; } // end of while loop	
		} // end of else
		
		System.out.println("The largest number is " + largest);
		System.out.println("The smallest number is " + smallest);
		
	}// end of whileLargestSmallest()
	
	
} // end of class
