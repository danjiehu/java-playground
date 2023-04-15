package inheritanceMultilevel;

public class B extends A {
	public int x = 4;
	public void methodB(int y) {
		x = x+y;
		System.out.printf("The output from methodB is %d", (x));
		
	}
}
