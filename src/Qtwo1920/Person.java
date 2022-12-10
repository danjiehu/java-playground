package Qtwo1920;

import java.io.*;

public class Person implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	// member variables
	private String name;
	private int age;
	private String emailAddress;
	
	// constructor
	public Person(String name, int age, String emailAddress) {
		this.name = name;
		this.age = age;
		this.emailAddress = emailAddress;
	}
	
	// methods
	public String getName() {
		return name;
	}
	
	public int getAge() {
		return age;
	}
	
	public String getEmailAddress() {
		return emailAddress;
	}
	
	public String toString() {
		return "name: " + name + " age: " + age + " email: " + emailAddress;
	}
	
}
