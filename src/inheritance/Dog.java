package inheritance;

public class Dog extends Animal {

	// will NOT be permitted to use name as it is private 
	// will be permitted to use parent class "protected" variables
	
	// dog is a sub-class of Animal
	
	public Dog() {
		super();
	};
	
	// sub-class specific method
	public void fetch(String item) {
		System.out.println("I'm fetching a " + item);
	}
	
}
