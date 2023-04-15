package multithreadingEssentials;

// ref: https://www.youtube.com/watch?v=RH7G-N2pa8M
class Counter {
	
	int count;
	
	public synchronized void increment() {
		count++; 
		// count = count + 1;
		// if not synchronized, somewhere along the way, t1 gets the value of count and before it can write back, t2 gets the value of count and adds the same and they both write back to the count, t1's result is lost (both thread are executing the method at the same time)
		// !!! synchronized keyword means only one thread can work with this method at a time: !!!
		// when t1 is working with increment, t2 has to wait; when t2 is working with increment, t1 has to wait;
		// comment out synchronized keyword to see how execution result differs
		// when method is not synchronized, class is NOT thread-safe
	}
	
}

public class SynchronizedKeyword {
	
	public static void main(String[] args) throws Exception {
		
		Counter c = new Counter();
		
		// starting two thread both counting to 1000 
		Thread t1 = new Thread(new Runnable() {
					@Override
					public void run() {
						for(int i=1; i<=1000;i++) {
							c.increment();
						}
					}
				});
		
		Thread t2 = new Thread(new Runnable() {
					@Override
					public void run() {
						for(int i=1; i<=1000;i++) {
							c.increment();
						}
					}
				});	
		
		
		t1.start();
		t2.start();
		t1.join(); // joining the rest of the code after thread finishes executing, other wise, it prints directly and it is not the finaly count we'll be expecting
		t2.join();
		
		System.out.print("Count " + c.count);
		
	} // end of main

} // end of class
