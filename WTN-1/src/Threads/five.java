package Threads;

public class five implements Runnable {

	public static void main(String[] args) {
		five assignment3 = new five();
		
		Thread t1 = new Thread(assignment3, "Thread1");
		Thread t2 = new Thread(assignment3, "Thread2");
		Thread t3 = new Thread(assignment3, "Thread3");
		
		t1.setPriority(Thread.MAX_PRIORITY);
		t2.setPriority(Thread.MIN_PRIORITY);
		t3.setPriority(Thread.NORM_PRIORITY);
		
		t1.start();
		t2.start();
		t3.start();
	}

	@Override
	public void run() {
		for (int i = 0; i < 100; i++)
			System.out.println(Thread.currentThread().getName() + ": " + i);		
	}

}
