package boundedType;

public class Driver {
	
	public static void main(String[] args) {
	    classDemo<Double> arr = new classDemo<>();
	    arr.set(4.0);
		System.out.println(arr.toString());
	} // end of main
	
	
	// The type parameter T should not be bounded by the final type Double. Final types cannot be further extended
	// static class classDemo <T extends Double>{
	static class classDemo <T extends Number>{
		private T a;
		
		public void set(T a) {
		this.a = a; }
		
		public T get() {
		return a; }
		
		@Override
		public String toString() {
		return "classDemo [a=" + a + "]";
		} 

	}

		
		
} // end of driver



