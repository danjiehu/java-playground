package examples;

public class BicycleTester {

	public static void main(String[] args) {
		
		// Declaration, creation & assignment
		// Note: bike is a reference variable
		Bicycle bike = new Bicycle();
		
	    // String newstring = "adfadf";
		
		System.out.println(bike.getOwnerName());
		
		bike.setOwnerName("Danjie");
		
		System.out.println(bike.getOwnerName());
		// System.out.println(bike.getOwnerName()+ " " + bike.getOwnerName());
		
		System.out.println(bike.toString());
		
		// System.out.println(bike.ownerName); // ownerName is private, cannot be accessed directly
		
	} // end of main

} // end of class

// class notes:
// 1. behaviors are methods, attributes are member variables
// 2. class is blueprint, object is the instance

// answer questions:
// 1. file linkage? one folder can have multiple main function? 
// 	A: can have as many main functions as we needs, file linkage is automatic if it's in the same folder or same package
// 2. does all customized data type (a class) have to be allocated on heap? will they be deleted automatically?
//  A: java has garbage collection heap, we don't need to deallocate memory ourselves
// 3. bin file? where is it?
// 4. by default, if not declaring private/public, what is the type of the variable?
//  A: public
// 5. what are the access modifier?
// 	A: public, private, protected 

// to do:
// 1. write the guessing game

