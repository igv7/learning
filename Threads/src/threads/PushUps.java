package threads;

public class PushUps implements Runnable {

	public PushUps() {
		
	}
	@Override
	public void run() {
		for(int i=0;i<10;i++) {
			System.out.println("Push up");
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}

}
