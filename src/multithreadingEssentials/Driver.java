package multithreadingEssentials;

// two ways of creating thread
// 1. class extends thread
// 1.1 class A extents Thread
// 1.2 in main, A a = new A(); a.start(); // if call run it won't create a new thread

// 2. class implements runnable
// 2.1 class A implements Runnable
// 2.2 in main, A a = new A(); Thread currThread = new Thread(a); currThread.start();

public class Driver {

	public static void main(String[] args) throws InterruptedException {
		
//		MyThread thread1 = new MyThread(1);
//		// try thread1.run(); multi-thread doesn't work anymore
//		thread1.start();
//
//		MyThread thread2 = new MyThread(2);
//		thread2.start();
		
		
		// creating 5 threads
		// as soon as the code hits thread.start() it will start the next line of code
		// it will not wait for the thread to close, this is the point of multi-threading
		for (int i = 0; i <= 5; i++) {
			
			MyThread myThread = new MyThread(i);
			Thread thread = new Thread(myThread); // comment out if using "extends Thread"
			thread.start();
			
			// thread.join(); 
			// wait for this thread to die before executing the next line of code, in this code sample, defeats the purpose of multithreading - we can see that only after thread 0 dies, thread 1 starts; and only after thread 1 dies, thread 2 starts... so on and so forth
			
		} // end of for
		
		
	} // end of main
} // end of class
