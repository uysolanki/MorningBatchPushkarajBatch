package day21.multithreading;

public class Soak extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("SOAK " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
