package examples;

public class Bicycle { // start of class

	// Instance Variable
	private String ownerName; // Java is case sensitive
	
	// Constructor
	public Bicycle() {
		ownerName = "Unassigned";
	}
	
	// Accessor/Getter
	public String getOwnerName() {
		return ownerName;
	}
	
	// Mutator/Setter
	public void setOwnerName(String name) {
		ownerName = name;
	}
	
	//toString() method
	public String toString() {
		return "This bicycle belongs to " + ownerName;
	}
		
	
	
	
} // end of class
