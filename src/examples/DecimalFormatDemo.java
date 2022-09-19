package examples;

import java.util.Scanner;
import java.text.DecimalFormat;
// demonstrate the use of java.text.DecimalFormat

// There is a slight difference between these two formats: "#.##" and "#.00"
// The "#.##" means it will print the number with maximum two decimal places whereas "#.00" means 
// it will always display two decimal places and if the decimal places are less than two, it will replace them with zeros. 
// ref: https://stackoverflow.com/questions/16583604/formatting-numbers-using-decimalformat

public class DecimalFormatDemo {

	// this block of code converts any number to being two decimal
	public static void main(String[]  args) {
		
		Scanner s = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("0.00");
		
		System.out.print("Please enter any number: ");
		Double number = s.nextDouble();
		
		System.out.println("The number enter was " + df.format(number));
		
		s.close();
		
	} // end of main
} // end of class 
