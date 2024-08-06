package day21.multithreading;

public class Alpha extends Thread
{
	public Alpha() {}
	public Alpha(String s)
	{
		super(s);
	}

	@Override
	public void run() {
		System.out.println("Name of Alpha Thread " +Thread.currentThread().getName());
		for(char i='A';i<='Z';i++)
		{
			System.out.println("\tChar " +i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
