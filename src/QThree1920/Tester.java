package QThree1920;

import java.util.*;

public class Tester {
	
	public static void main(String[] args) {
		
		List<Employee> empList = new ArrayList<Employee>();
		
		Permanent pEmp1 = new Permanent("alex","customer service");
		Permanent pEmp2 = new Permanent("anna","accounting");
		
		PartTime ptEmp1 = new PartTime("bob", "engineering");
		PartTime ptEmp2 = new PartTime("calvin", "admin");
		
		empList.add(pEmp1);
		empList.add(pEmp2);
		empList.add(ptEmp1);
		empList.add(ptEmp2);
		
		System.out.printf("displaying list content\n");
		for (Employee e : empList) {
			System.out.println(e.toString());
		}
		
		System.out.printf("\ncalculating 35 hour week\n");
		for (Employee e : empList) {
			System.out.println(e.toString() + " pay: " + e.calculatePay(35));
		}
		
		FileReadWrite frw = new FileReadWrite();
		System.out.printf("\nwriting to file...\n");
		frw.writeToFile(empList);
		System.out.printf("\nreading from file: \n");
		frw.readFromFile();
 		
	} // end of main

} // end of class
