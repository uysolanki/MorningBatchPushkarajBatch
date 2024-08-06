package day21.multithreading;

public class Wash extends Thread {
	public void run() {
		for (int i = 1; i <= 5; i++) {
			System.out.println("\tWASH " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
