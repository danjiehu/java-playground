package recursion;

public class Nfactorial {
	
	// for example, factorial(5) = 5*4*3*2*1;
	
	public static void main(String[] args) {
		
		System.out.println(factorial(8)); //40320
		System.out.println(factorial(4)); //24
		System.out.println(factorial(5)); //120
		
	}
	
	public static int factorial(int n) {
		
		if (n < 1) {
			return -1; // invalid input
		}
		
		if (n == 1) {
			return 1;
		} else {
			return n*factorial(n-1);
		}
	
	}

}
