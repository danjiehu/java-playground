package inheritanceTwo;

public class Y extends X {

		public static void main(String[] args) {
			Y y= new Y(); 
			y.parentMethod();
		}
	
		public static void myMethod() {
			System.out.println("child");
		}
}
