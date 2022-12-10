package tests;

import java.util.*;
// quick tests

public class Tester {

	public static void main(String[] arg) {
		
		System.out.println("a");
		System.out.println(); // works
		System.out.println("b");
		
		ArrayList<Integer> numbers = new ArrayList<>(); 
		numbers.add(100);
		System.out.println(numbers.get(0));
		
		
		int[] arr = new int[10];
		arr[0] = 200;
		System.out.println(arr[0]);
		
	} // end of main
} // end of class
