package array;

public class Main {

	public static void main(String[] args) {
		
		// array creation
		int[] nums;
		
		nums = new int[2];
		
	    nums[0] = 11;
	    nums[1] = 12;
	    
	    // array creation 
		int[] anotherNums = new int[3];
		
		anotherNums[0] = 22;
		anotherNums[1] = 23;
		anotherNums[2] = 24;
		
		for (int num : nums) {
			System.out.println(num);
		}
		
		System.out.println();
		
		for (int num : anotherNums) {
			System.out.println(num);
		}
		
		System.out.println();
		
		// passing array to a method
		rewrite(0,10,nums);
		// reference is passed, method WILL change the array passed in as argument
		for (int num : nums) {
			System.out.println(num);
		}
		
	}
	
	public static void rewrite(int index, int newValue, int[] arr) {
		arr[index] = newValue;
		System.out.println("rewrite() invoked. ");
	}
	
}
