package Qtwo1819;

import java.util.*;
import java.io.*;

// 1. array list
// 2. auto boxing and auto unboxing
// 3. generating random integers
// 4. enhanced for loop
// 5. writeToFile
// 6. readFromFile

public class Main {

	public static void main(String[] args) {
		
		ArrayList<Integer> randomIntegers = new ArrayList<Integer>();
		// MUST use Integer instead of int because of autoboxing
		
		Random rand = new Random();
		// to generate random integer later
		
		int num = 0;
		int sum = 0;
		for (int i = 0; i < 10; i++) {
			num = rand.nextInt(100);
			randomIntegers.add(num);
			sum = sum + num;
		};
		
		// displaying list content and sum of the list with enhanced for loop
		for (int number : randomIntegers) {
			System.out.print(number + " ");
		}
		
		System.out.println();
		System.out.println("sum of the numbers are: " + sum);
		// end of part (a)
		
		writeToFile(randomIntegers);
		readFromFile("src/Qtwo1819/randomIntegers.txt");
		
	} // end of main
	
	// start of writeToFile function 
	public static void writeToFile(List<Integer> list) {

		try {
			FileWriter fileWriter = new FileWriter("src/Qtwo1819/randomIntegers.txt");
			// if randomIntegers.txt, file created and saved to java-playground folder 
			
			BufferedWriter writer = new BufferedWriter(fileWriter);
			
			writer.write("Random Integers: \n");
			
			for (int num : list) {
				writer.write(num + " ");
			}
			
			writer.close();
			
			System.out.printf("completed writing to file \n"); 
		} 
		catch (IOException e){
			e.printStackTrace();
		}
	}
	// end of writeToFile function
	
	// start of readFromFile function 
	public static void readFromFile(String filename) {
		
		try 
		{
			File file = new File(filename);
			
			FileReader fileReader = new FileReader(file);
			
			BufferedReader reader = new BufferedReader(fileReader);
			
			String line = null;
			
			System.out.println("The content below is read from file " + filename + ": ");
			
			while ( (line = reader.readLine()) != null ) {
				System.out.println(line);
			}
			
			reader.close();
		} 
		catch(IOException e)
		{
			e.printStackTrace();
		}
	}
	// end of readFromFile function

} // end of class 




