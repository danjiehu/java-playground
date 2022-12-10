package QThree1920;

public class PartTime extends Employee {

	private final double PART_TIME_PAY = 10.5;
	private int id;
	
	public PartTime(String name, String dept) {
		super(name,dept);
	}
	
	public int getID() {
		return id;
	}
	
	public double calculatePay(double hours) {
		return PART_TIME_PAY * hours;
	}
	
}
