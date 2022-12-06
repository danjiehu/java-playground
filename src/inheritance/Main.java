package inheritance;

public class Main {

	public static void  main(String[] args) {
		
		Beagle bailey = new Beagle();
		
		bailey.fetch("ball"); // calling parent method
		
		System.out.println(bailey.sound()); // calling overridden method
		
	}
}
