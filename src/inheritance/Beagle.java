package inheritance;

public class Beagle extends Dog {
	
	public Beagle() {
		super();
	}
	
	// override sound method
	public String sound() {
		return "woof woof";
	}
	
	// override temperament method
	public String temperament () {
		return "gentle but tends to wander. ";
	}
}
