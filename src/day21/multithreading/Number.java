package day21.multithreading;

public class Number extends Thread
{
	public Number() {}
	public Number(String s)
	{
		super(s);
	}

@Override
public void run() {
	System.out.println("Name of Number Thread " +Thread.currentThread().getName());
	for(int i=1;i<=26;i++)
	{
		System.out.println("Number " +i);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
}
