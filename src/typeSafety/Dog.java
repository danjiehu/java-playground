package typeSafety;

public class Dog extends Animal {
	
	@Override
	public void eat() {
		System.out.println("overrired eat from Dog class");
	}
	
	
    public void bark() {
        System.out.println("Dog is barking");
    }
}

