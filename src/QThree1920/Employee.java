package QThree1920;

public abstract class Employee {

	private String name;
	private String dept;
	private static int number;
	private int id;
	
	public Employee(){ };
	public Employee(String name, String dept) {
		this.name = name;
		this.dept = dept;
	}
	
	public String getName() {
		return name;
	};
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getDept() {
		return dept;
	}
	
	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getID() {
		return id;
	}
	
	public String toString() {
		return name + " " + dept + " " + number + " " + id;  
	}
	
	public abstract double calculatePay(double hours);

} // end of class 
	
