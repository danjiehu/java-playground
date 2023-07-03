package weekthree;

import java.util.Scanner;

public class MethodsExercises {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
			carPark();
		
	} // end of main
	
	// omit 1-5
	
	// 7. 
	public static void carPark() {
		
		System.out.print("How many cars --> ");
		int numberOfCars = sc.nextInt();
		for (int i = 0; i < numberOfCars; i++) {
			System.out.print("How many hours was the car parked for? --> ");
			double parkTime = sc.nextDouble();
			System.out.println("Car # " + (i+1) + " is parked for " + parkTime + " hour(s), and charged " + calculateCharges(parkTime) + " Euro");
		}
		
	} // end of carPark()
	
	public static double calculateCharges(double parkTime) {
		
		double charge = 0.0;
		
		if (parkTime <= 1.0) {
			return charge;
		}
		
		if (1.0 < parkTime && parkTime <= 8) {
			double roundUp = Math.ceil(parkTime-1);
			charge = roundUp * 3;
			return charge;
		}
		
		if (parkTime > 8) {
			charge = 21;
			return charge;
		}
		
		return charge;
	} // end of calculateCharges()
	
} // end of class
