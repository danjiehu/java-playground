package QThree1920;

public class Permanent extends Employee {

	private final double PERMANENT_PAY = 12.50; 
	// ! final must be initialized
	private int id;
	
	public Permanent(String name, String dept) {
		super(name, dept);
	}
	
	public int getID() {
		return id;
	}
	
	public double calculatePay(double hours) {
		return PERMANENT_PAY * hours;
	}

}
