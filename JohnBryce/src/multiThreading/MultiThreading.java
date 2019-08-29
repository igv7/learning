package multiThreading;

import java.util.Random;

public class MultiThreading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random random = new Random();
		Worker[] workers = new Worker[3];
		for (int i = 0; i < workers.length; i++) {
			workers[i]= new Worker(1 + random.nextInt(5),1+random.nextInt(3));
			workers[i].start();
		}
		
		 System.out.println("All workers started, waiting for them to finish");
	        for (int i = 0 ; i < workers.length ; ++i) {
	            workers[i].waitUntilFinished();
	        }
	        System.out.println("All workers are done");
		
	}

}
