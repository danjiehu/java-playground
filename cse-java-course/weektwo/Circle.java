package weektwo;

import java.util.Scanner;

public class Circle {
	
	// Default package-level visibility: 
	// 	It can be accessed by other classes within the weektwo package, but not by classes outside of it.
	// 	In UML it's denotes as "~"
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		
		double radius = 0.0;
		boolean validInput = false;
		
		while (!validInput) {
			
			try {
				System.out.print("Please input Circle radius: ");
				radius = sc.nextDouble();
				
				System.out.printf("Diameter: %.2f%n", calcDiameter(radius));
				System.out.printf("Circumference: %.2f%n", calcCircumference(radius));
				System.out.printf("Area: %.2f%n", calcArea(radius));
				
				validInput = true;
			}
			catch(Exception e) {
				System.out.println("Invalid input, please enter a valid number. ");
				sc.nextLine();
			}
			
		} // end of while loop
		
	} // end of main
	
	// calculate diameter
	public static double calcDiameter(double radius) {
		return radius*2;
	}
	
	// calculate Circumference
	public static double calcCircumference(double radius) {
		return 2*Math.PI*radius;
	}
	
	// calculate calcArea()
	public static double calcArea(double radius) {
		return Math.PI * Math.pow(radius, 2);
	}
	
} // end of class
