package inheritance;

public class Animal {
	
	private String name;
	
	public Animal() {
		name = null;
	}
	
	public void setName(String animalName) {
		name = animalName;
	}
	
	public String getName() {
		return name;
	}
	
	
	// override in subclass
	public String sound() {
		return "?";
	}
	
	// override in subclass
	public String temperament () {
		return "?";
	}
	
}
