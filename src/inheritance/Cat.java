package inheritance;

// cat is a subclass of Animal

public class Cat extends Animal {

	public Cat() {
		super();
	}
	
	// sub-class specific method
	public void climb(String item) {
		System.out.println("I'm climbing a " + item);
	}
	
}
