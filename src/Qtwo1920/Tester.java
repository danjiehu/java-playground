package Qtwo1920;

import java.util.List;

public class Tester {

	public static void main(String[] args) {
		
		Person anna = new Person("anna",12, "mockemail");
		Person alex = new Person("alex",12, "mockemail");
		Person bob = new Person("bob",12, "mockemail");
		Person calvin = new Person("calvin",12, "mockemail");
		
		PersonCollection pc = new PersonCollection();
		
		pc.addPerson(anna);
		pc.addPerson(alex);
		pc.addPerson(bob);
		pc.addPerson(calvin);
		
		System.out.printf("\nprinting pc\n");
		pc.printCollection();
		
		FileSerializationDeserialization fsd = new FileSerializationDeserialization();
		
		System.out.printf("\nchecking serilization status: \n");
		fsd.serialise(pc.getCollection());
		
		List<Person> dlist = fsd.deserialise();
		
		System.out.printf("\nprinting dlist\n");
		for(Person p:dlist) {
			System.out.println(p.toString());
		}
		
	}
	
}
