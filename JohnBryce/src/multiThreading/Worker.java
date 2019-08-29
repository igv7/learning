package multiThreading;

public class Worker implements Runnable {
	
	// Name template for workers.
	private static final String BASE_NAME = "Worker";
	
	// Total workers created.
	private static int totalWorkers = 0;
	
	// Worker's thread reference.
	private Thread m_thread;
	
	// Worker's name.
	private String m_name;
	
	// Worker's ID.
	private int m_id;
	// Worker's total number of actions.
	private int m_numOfActions;
	// Worker's milliseconds to sleep between each action.
	private int m_millisToRest;
	
	/**
	 * Creates a new Worker.
	 * @param numOfActions Number of actions this worker is going to do.
	 * @param secondsOfRest Number of seconds this worker will sleep between each action.
	 */
	public Worker(int numOfActions, int secondsOfRest) {
		m_numOfActions = numOfActions;
		// 1 second = 1000 milliseconds.
		m_millisToRest = secondsOfRest * 1000;
		m_id = totalWorkers++;
		// The name will be in a form of: "WorkerX" where X is the worker ID.
		m_name = BASE_NAME + m_id;
		System.out.println(m_name + " has been created (actions = " + m_numOfActions + 
				", resting for = " + m_millisToRest + ")");
	}
	
	/**
	 * Starts this worker.
	 */
	public void start() {
		if (m_thread == null) {
			m_thread = new Thread(this, m_name);
			m_thread.start();
		}  else {
			// We'll get here if the user has tried to start the worker more than once.
			throw new UnsupportedOperationException("Worker has already been started");
		}
	}
	
	/**
	 * Blocks until this worker is finished.
	 */
	public void waitUntilFinished() {
		try {
			m_thread.join();
		} catch (InterruptedException e) {
			System.out.println(m_name + " died horribly..");
		} 
	}
	
	/**
	 * Actual worker's job.
	 */
	@Override
	public void run() {
		System.out.println("Running " + m_name);
		try {
			for (int i = 0 ; i < m_numOfActions ; ++i) {
				System.out.println(m_name + " is now working.");
				Thread.sleep(m_millisToRest);
			}
		} catch (InterruptedException e) {
			System.out.println(m_name + " died horribly..");
		} 
		System.out.println(m_name + " is done.");
	}

}
