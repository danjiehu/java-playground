package typeSafety;

public class Driver {
	
    public static void main(String[] args) {
        Animal a = new Dog(); // Upcasting
        a.eat(); // OK // calling overrided eat() from Dog even if a is a type of "Animal"
        // a.bark(); // the method bark() is undefined for Animal
    }
    
    // the correct way to use it is to cast the object back to Dog first 
	//    Animal a = new Dog(); // Upcasting
	//    a.eat(); // OK
	//    
	//    if (a instanceof Dog) {
	//        Dog d = (Dog) a; // cast to dog
	//        d.bark(); 
    //    }
    

} // end of class	
