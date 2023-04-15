package multithreadingEssentials;

// ref: https://www.youtube.com/watch?v=A1tnVMpWHh8
// how to achieve communication between two thread: demo of how to use wait() and notify()
// thread 2 start doing something after thread 1 finishes something, thread 1 start doing something after thread two start doing something
// a Runnable class is a module of code that can run in a thread by simply calling classInstanceName.start(), what's inside run() method is what will be executed

class Num {
	int num;
	boolean ifPut = false;
	
	// ! whenever using wait() and notify(), method HAS to be synchronized
	public synchronized void put(int num) {
		
		
		// why use "while(ifPut)" instead of "if(ifPut)":
		// When using wait(), it's always a good practice to use a loop to check the condition that you are waiting for, 
		// This is because, due to a spurious wakeup, 
		// !! a thread can wake up from wait() even if notify() has not been called. 
		
		// if value is already put, asking the thread executing this function "put()" to halt execution being notified by another thread
		
		// !! wait() and notify() methods is called on the same object, and this is why it doesn't need to specify which thread to notify or wait because it is telling WHATEVER thread that is utilizing this object function (that modifies object state) to half or continue
		// can use "wait()" directly, but "this.wait()" just make it clearer that we're asking whatever thread that is modifying THIS object to WAIT
		while(ifPut) {
			try { this.wait(); } catch(Exception e) {}
		}
		
		// then put value
		this.num = num;
		System.out.println("Put: " + num);
		ifPut = true;
		
		// can use "notify()" directly, but "this.notify()" just make it clearer that we're asking whatever thread that is waiting on THIS object to start executing (wake up)
		// !! that's why wait() notify() belongs to Object class and sleep() belongs to Thread class
		this.notify(); // notifying consumer thread "I'm done executing, value is put"
	}
	
	// ! whenever using wait() and notify(), method HAS to be synchronized
	public synchronized void get() {
		
		// if value not put, asking the thread executing this function "get()" to halt execution being notified by another thread
		while(!ifPut) {
			try { wait(); } catch(Exception e) {} 
		}
		
		// then get value
		System.out.println("Get: " + num);
		ifPut = false;
		notify(); // notifying producer thread "I'm done executing, value is consumed"
	}
}

// producer puts a number to a num instance 
class Producer implements Runnable {
	
	Num num;
	
	public Producer(Num num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		int i = 0;
		// infinite loop
		while(true) {
			// no need to check ifSet value because put method itself checks it
			num.put(i);
			try { Thread.sleep(500); } catch (InterruptedException e) {}
			i++;
		}
	}
	
	
} // end of Producer

// consumer prints value to screen
class Consumer implements Runnable {
	
	Num num;
	
	public Consumer(Num num) {
		this.num = num;
	}
	
	@Override
	public void run() {
		while(true) {
			// no need to check ifSet value because get method itself checks it
			num.get();
			try { Thread.sleep(5000); } catch (InterruptedException e) {}
		}
	}
	
} // end of Consumer


public class InterThreadCommunication {
	
	public static void main(String[] args) {
		
		Num num = new Num();
		Producer p = new Producer(num);
		Consumer c = new Consumer(num);
		
		Thread t1 = new Thread(p);
		Thread t2 = new Thread(c);
		
		t1.start();
		t2.start();
		
	} // end of main

} // end of class
