package multithreadingEssentials;

// example of using "extends Thread"
//public class MyThread extends Thread {
//	
//	private int threadNumber;
//	
//	public MyThread(int num){
//		threadNumber = num;
//	}
//
//	@Override
//	public void run() {
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.println(i + " from thread number [" + threadNumber + "]");
//			
//			// pause for 1 second before printing the next number
//			try {
//				Thread.sleep(1000);
//				//Causes the currently executing thread to sleep 
//				// (temporarily cease execution) for the specified number of milliseconds, 
//				// subject to the precision and accuracy of system timers and schedulers. 
//				// The thread does not lose ownership of any monitors
//			}
//			catch(Exception e) {e.printStackTrace();}
//		}
//	} // end of run
//}

// example using implements Runnable
public class MyThread implements Runnable {
	
	private int threadNumber;
	
	public MyThread(int num){
		threadNumber = num;
	}

	@Override
	public void run() {
		
		for (int i = 0; i < 5; i++) {
			System.out.println(i + " from thread number [" + threadNumber + "]");
			
			// pause for 1 second before printing the next number
			try {
				Thread.sleep(1000);
				//Causes the currently executing thread to sleep 
				// (temporarily cease execution) for the specified number of milliseconds, 
				// subject to the precision and accuracy of system timers and schedulers. 
				// The thread does not lose ownership of any monitors
			}
			catch(Exception e) {e.printStackTrace();}
		}
	} // end of run
}
