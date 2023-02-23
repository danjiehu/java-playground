package loop;

public class Tester {
	
	public static void main(String[] args) {
		
		work();
		
	}// end of main
	
	public static int i = 0;
	public static void work() {
		while(i++ < 10) { // started from 1, not 0
			System.out.println(i);
		}
		
	} 

} // end of class
