package multiThreading;

public class Threads1 {


	
	public static void main(String[] args) {
		Thread[] threads = new Thread[2];
		for (int i = 0 ; i < 2 ; ++i) {
			// Creating new threads with anonymous inner class.
			threads[i] = new Thread(new Runnable() {
				@Override
				public void run() {
					try {
						for (int i = 0 ; i < 10 ; ++i) {
							System.out.println(i);
							Thread.sleep(200);
						}
					} catch (InterruptedException e) {
						System.out.println("Sleep failed");
					}
				}
			});
			// Starting the threads.
			threads[i].start();
		}
		
		System.out.println("All threads created... waiting for them to finish");
		for (int i = 0 ; i < 2 ; ++i) {
			try {
				threads[i].join();
				System.out.println("Thread " + i + " is done");
			} catch (InterruptedException e) {
				System.out.println("Waiting for thread " + i + " failed");
			}
		}
	}
}
