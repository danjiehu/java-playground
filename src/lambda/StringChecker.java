package lambda;

import java.util.function.Predicate;

public class StringChecker {
	
	public static void main(String[] args) {
		
		Predicate<String> checker1 = s -> {
			return s.endsWith("k");
		};
		System.out.println("checker1: " + checker1.test("Clerk"));
		
		Predicate<String> checker2 = s -> {
			if (s.length() > 10) {
				return true;
			} else {
				return false;
			}
		};
		System.out.println("checker2: " + checker2.test("averylongstringindeed"));
		System.out.println("checker2: " + checker2.test("short"));
		
	} // end of main

} // end of class
