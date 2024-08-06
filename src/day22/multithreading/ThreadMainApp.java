package day22.multithreading;

public class ThreadMainApp {

	public static void main(String[] args) {
		Number thread1=new Number();
		Thread tx=new Thread(thread1);
		Thread tx1=new Thread();
		tx.start();
	}

}
