package mcq_prep;

import java.util.Random;

public class RandomNumbers {
	
	// The nextInt() method in the java.util.Random class returns a pseudorandom int value. By default, it returns a random value within the full range of possible int values, which is from -2,147,483,648 to 2,147,483,647.
	// If you want to generate random numbers within a specific range, you can use the overloaded nextInt(int bound) method. This method generates a random integer between 0 (inclusive) and the specified bound (exclusive).
	
	public static void main(String[] args) {
		
		gRand1();
		gRand2(10);
		gRandSeed();
		
	} // end of main
	
	
	// method 1/3: return and print 1 random number to screen
	public static int gRand1() {
		
		// step one: create a random number generator
		// step two: get 1 random number from number generator, print it to the screen
		// step three: return it from method
		
		Random r = new Random();
		int i = r.nextInt(); // range: -2,147,483,648 to 2,147,483,647
		System.out.printf("gRand1 output: %d\n", i);
		
		return i;
	}
	
	// method 2/3: generate and print random numbers between 0 and bound 
	public static int gRand2(int inclusiveBound) {
		
		Random r = new Random();
		int i = r.nextInt(inclusiveBound+1); // range: int value between 0 (inclusive) and the specified value (exclusive)
		System.out.printf("gRand2 output: %d\n", i);
		
		return i;
	}
	
	// method 3/3: by specifying a seed value, you can have control over the sequence of random numbers generated, allowing you to reproduce the same sequence when needed or obtain different sequences by using different seed values.
	public static void gRandSeed() {
		
		long seed1 = 1234L;
		long seed2 = 1000L;
		
		Random r1 = new Random(seed1);
		Random r2 = new Random(seed1);
		Random r3 = new Random(seed2);
		
		// using same seed 
		System.out.println("\nSequence 1 with r1 seed 1: ");
		for (int i=0; i<5; i++)
			System.out.print(r1.nextInt() + " ");
		
		System.out.println("\nSequence 2 with r2 seed 1: ");
		for (int i=0; i<5; i++)
			System.out.print(r2.nextInt() + " ");
		
		// using different seed
		System.out.println("\nSequence 3 with r3 seed 2: ");
		for (int i=0; i<5; i++)
			System.out.print(r3.nextInt() + " ");
		
	}
	
	
} // end of class
