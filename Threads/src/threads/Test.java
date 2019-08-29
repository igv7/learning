package threads;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Thread t1 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
					for(int i=0;i<10;i++) {
						System.out.println("Clap");
						try {
							Thread.sleep(1000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				}
			});
			
			Thread t2 = new Thread(new Runnable() {
				
				@Override
				public void run() {
					// TODO Auto-generated method stub
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
			});
			
			t1.run();
			t2.run();
	}

}
