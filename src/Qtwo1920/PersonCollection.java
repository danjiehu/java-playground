package Qtwo1920;

import java.util.*;

public class PersonCollection {
	
	List<Person> personList = new ArrayList<Person>();
	
	// constructor
	public PersonCollection() {
		// do nothing
	}

	// methods
	public List<Person> getCollection(){
		return personList;
	}
	
	public boolean addPerson(Person p) {
		return personList.add(p);
	}
	
	public boolean removePerson(Person p) {
		return personList.remove(p);
	}
	
	public void printCollection(){ // I dont't think printCollection should take any input
		for (Person p : personList) {
			System.out.println(p.toString());
		}
	}
	
}
