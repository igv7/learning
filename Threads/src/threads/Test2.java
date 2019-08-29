package threads;

public class Test2 {

	public static void main(String[] args) {
		Thread t1 = new Thread(new ClapHands());
		Thread t2 = new Thread(new PushUps());
		
		t1.run();
		t2.run();
		
	}

}
