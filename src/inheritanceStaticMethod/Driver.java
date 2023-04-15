package inheritanceStaticMethod;

public class Driver {

	public static void main(String[] args) {
		X.staticMethod(); // static method is called on class
		Y.staticMethod(); // Y inherits X does NOT make a difference here because static methods are bound to their respective class at compile time
	}
}
