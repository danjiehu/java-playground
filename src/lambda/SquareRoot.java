package lambda;

import java.util.function.Function;
// https://www.geeksforgeeks.org/java-sqrt-method-examples/
// https://docs.oracle.com/javase/8/docs/api/java/util/function/package-summary.html

public class SquareRoot {

	public static void main(String[] args) {
		
		Function<Double, Double> fun = Math::sqrt;
		System.out.println(fun.apply(4.0));
		System.out.println(fun.apply(9.0));
		System.out.print(fun.apply(14.5));
		
	} // end of main
	 
} // end of class
