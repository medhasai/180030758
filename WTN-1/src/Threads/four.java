package Threads;

public class four implements Runnable {
	static Thread oddThread;
	static Thread evenThread;

	public static void main(String[] args) {
		four assignment2 = new four();
		
		oddThread = new Thread(assignment2, "OddThread");
		evenThread = new Thread(assignment2, "EvenThread");
		
		oddThread.start();
		evenThread.start();
	}

	@Override
	public void run() {
		try {
			if (Thread.currentThread().getName().equals("OddThread")) 
				evenThread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		for (int i = 1; i <= 20; i++) {
			if (Thread.currentThread().getName().equals("EvenThread")) {
				if (i % 2 == 0) System.out.println(i);
			} 
			
			if (Thread.currentThread().getName().equals("OddThread")) {
				if (i % 2 == 1) System.out.println(i);
			}
		}
	}

}
