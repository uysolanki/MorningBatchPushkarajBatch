package day21.multithreading;

public class ThreadMain {

	public static void main(String[] args) {
		
		System.out.println("Name of Main Thread " +Thread.currentThread().getName());
		Number thread1=new Number("Numeric");
		thread1.start(); //1 sleep
		
		Alpha thread2=new Alpha("Alphabetic");
		thread2.start();
		
		for(int i=27;i<=52;i++)
		{
			System.out.println("\t\tMain "+ i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
				//2
		
				//3
	}

}
