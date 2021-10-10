package threadAndNotify;

public class Passenger extends Thread {
	int total = 0;

	public void run() {
		synchronized (this) {
			System.out.println("wait...");
			
			try {
				Thread.sleep(getPriority(), 500);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			for (int i = 0; i < 1000; i++) {
				total=total+i;
				System.out.println("notification call given.");
				notify();
			}
		}

	}
}
