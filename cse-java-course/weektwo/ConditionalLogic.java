package weektwo;

import java.util.Scanner;

public class ConditionalLogic {

    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
    	
    //    	  preAndPostDifference(); 								// 1.	
	//        booleanLogicShortCircuitOps();						// 2.
	//    	  booleanBitwiseOps();									// 3.
	//        compareStrings();										// 4.
	
//              System.out.print("Enter certification of film --> ");
//              int cert = sc.nextInt();
//              System.out.print("Enter age of the customer --> ");
//              int age = sc.nextInt();     
//              boolean okToWatchFilm = admitToFilm(cert,age);		
//              System.out.println(okToWatchFilm);					// 5.
	
	//        switchVowelOrConsonant();								// 6.
	//        ifMonth();											// 7.
	//         ifGrade();											// 8.
	//        switchMathOperation();								// 9.
	//        ifTemperature();										// 10.
	        switchDaysInMonth();									// 11.

    }// end of main()
    
    // 1.
    public static void preAndPostDifference() { // method definition
        int x = 5, y = 10;

        System.out.println("x is " + x);
        System.out.println("++x is " + ++x);
        System.out.println("x++ is " + x++);
        System.out.println("x is " + x);

        System.out.println("y is " + y);
        System.out.println("--y is " + --y);
        System.out.println("y-- is " + y--);
        System.out.println("y is " + y);
    }
    
    // 2.
    public static void booleanLogicShortCircuitOps() {
        // F &&     short circuit (cant become true)
        // T ||     short circuit (cant become false)

    	boolean b = false;
    	int x=3;
    	

        if(x < 0 && (b=true)) {}	// F && - shortcircut b keeps being false
        System.out.println(b); //false
 
        if(x > 0 || (b=true)) {}	// T || - shortcircuit b keeps being false
        System.out.println(b); //false
        
    }
    
    // 3.
    public static void booleanBitwiseOps() { // non short-circuit
    	// CSE only
    	boolean b = false;
    	int x=3;
    	

        if(x < 0 & (b=true)) {}	// F & - non shortcircuit will set b to true nonetheless
        System.out.println(b); //true

        if(x > 0 | (b=true)) {}	// T | - non shortcircuit will set b to true nonetheless
        System.out.println(b); //true
       
    }
    
    // 4.
    public static void compareStrings() {
       
    	System.out.print("Enter s1: ");
        String s1 = sc.next();
        System.out.print("Enter s2: ");
        String s2 = sc.next();

        // enter same string content
        System.out.println(s1 == s2); // false
        System.out.println(s1.equalsIgnoreCase(s2)); // true
        
    }
    
    // 5.
    public static boolean admitToFilm(int cert, int age) {
    	
// 		ternary operator
//      boolean isOK
//               = age >= cert ? true : false;
//      return isOK;
    	
    	if(age >= cert){
	          return true;
	      } else {
	          return false;
	      }

    }
        
    // 6.
    public static void switchVowelOrConsonant() {
        System.out.print("Enter a char --> ");
        char letter = sc.next().charAt(0);

        if ((letter >= 'a' && letter <= 'z')
                || (letter >= 'A' && letter <= 'Z')) { // letter is OK
            switch (letter) {
           
                case 'a':
                case 65: // case 'A' (Unicode/ASCII values)
                case 'e':
                case 69: // case 'E' (Unicode/ASCII values)
                case 'i':
                case 'I':
                case 'o':
                case 'O':
                case 'u':
                case 'U':
                    System.out.println(letter + " is a vowel");
                    break;
                    
                default: // moving the default section to the top of the switch statement still works properly
                    System.out.println(letter + " is a consonant"); 
                    break;

            }
        } else {
            System.err.println("Invalid letter : " + letter); // invalid input
        }
    }
    
    // 7. 
    public static void ifMonth() {
        final int JAN = 1, FEB = 2, MAR = 3;
        final int APR = 4, MAY = 5, JUN = 6;

        try {
            System.out.print("Enter a month (1..6) --> ");
            int month = sc.nextInt();

            if (month == JAN) {
                System.out.println("January");
            } else if (month == FEB) {
                System.out.println("February");
            } else if (month == MAR) {
                System.out.println("March");
            } else if (month == APR) {
                System.out.println("April");
            } else if (month == MAY) {
                System.out.println("May");
            } else if (month == JUN) {
                System.out.println("June");
            } else {
                System.out.println("Month is out of range: " + month);
            }
        } catch (Exception ex) {
            System.out.println("invalid input!");
            ex.printStackTrace();
        }
    }
    
    // 8.
    public static void ifGrade() {

        try {
            System.out.print("Enter a mark (0..100) --> ");
            int mark = sc.nextInt();
            if (mark < 0 || mark > 100) {
                System.out.println("Mark is out of range: " + mark);
            } else {
                //valid mark
                if (mark >= 70 && mark <= 100) {
                    System.out.println("A");
                } else if (mark >= 60 && mark <= 69) {
                    System.out.println("B");
                } else if (mark >= 50 && mark <= 59) {
                    System.out.println("C");
                } else if (mark >= 40 && mark <= 49) {
                    System.out.println("D");
                } else {
                    System.out.println("Fail");
                }
            }
        } catch (Exception ex) {
            System.out.println("Exception caught!");
            ex.printStackTrace();
        }

    }
    
    // 9.
    public static void switchMathOperation() {
        double answer = 0.0;
        boolean charOK = true;

        System.out.print("Enter a number --> ");
        double num1 = sc.nextDouble();
        System.out.print("Enter a number --> ");
        double num2 = sc.nextDouble();

        System.out.print("Enter an operation --> ");
        char operation = sc.next().charAt(0);

        switch (operation) {
            case '+':
                answer = num1 + num2;
                break;
            case '-':
                answer = num1 - num2;
                break;
            case '*':
                answer = num1 * num2;
                break;
            case '/':
                answer = num1 / num2;
                break;
            default:
                System.out.println("Unknown math. operator : " + operation);
                charOK = false;
                break;
        }

        if (charOK) {
            System.out.println("Answer is " + answer);
        }
    }
    
    // 10.
    public static void ifTemperature() {
        int temperature = 0;
        final int COLD = 0;
        final int MILD = 15;
        final int WARM = 20;
        final int VERY_WARM = 25;
        final int HOT = 30;

        try {
            System.out.print("Enter temperature (0..30) --> ");
            temperature = sc.nextInt();
            if (temperature <= COLD) {
                System.out.println("Cold");
            } else if (temperature > COLD && temperature < MILD) {
                System.out.println("A little cold but ok...");
            } else if (temperature >= MILD && temperature < WARM) {
                System.out.println("Mild");
            } else if (temperature >= WARM && temperature < VERY_WARM) {
                System.out.println("Warm");
            } else if (temperature >= VERY_WARM && temperature < HOT) {
                System.out.println("Very warm");
            } else if (temperature >= HOT) {
                System.out.println("Hot");
            }

        }catch (Exception ex) {
            System.out.println("Exception caught!");
            ex.printStackTrace();
        }

    }
    
    // 11. 
    public static void switchDaysInMonth(){
        int numDays=0;
                
        System.out.print("Enter month --> ");
        int month = sc.nextInt();
        
        final int JAN=1;final int FEB=2;final int MAR=3;
        final int APR=4;final int MAY=5;final int JUN=6;
        final int JUL=7;final int AUG=8;final int SEP=9;
        final int OCT=10;final int NOV=11;final int DEC=12;
        
        switch(month){
            case JAN:case MAR:case MAY:case JUL:
            case AUG:case OCT:case DEC:
                numDays=31;
                break;
            
            case APR:case JUN:case SEP:case NOV:
                numDays=30;
                break;
            
            case FEB:
                System.out.print("Enter year --> ");
                int year = sc.nextInt();
                if( (year % 400 == 0) || 
                    (year % 4 == 0 && !(year % 100 == 0)) ){
                    numDays = 29; // leap year
                    break;
                } else {
                    numDays = 28;
                    break;
                }
                
            default:
                System.out.println("Invalid month: "+month);
                break;
                
        }
        System.out.println("Number of days is: "+numDays);
    }
    
    // ternaryOperator demo
    public static void ternaryOperator() {
        boolean isHappy = false;
        String mood
                = isHappy ? "I am happy" : "I am sad";
        System.out.println(mood);

        System.out.print("Enter x --> ");
        int x = sc.nextInt();
        System.out.print("Enter y --> ");
        int y = sc.nextInt();

        int minVal
                = x < y ? x : y;
        System.out.println(minVal);

    }

}// end of class


