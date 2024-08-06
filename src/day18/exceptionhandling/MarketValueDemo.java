package day18.exceptionhandling;

public class MarketValueDemo {

	public static void main(String[] args) {
		
		boolean ans=test();
		System.out.println(ans);

	}

	private static boolean test() {
		try
		{
			int ans=10/0;
			return true;
		}
		catch(ArithmeticException e1)
		{
			System.exit(0);
			return false;
		}
		finally
		{
			return false;
		}
		
	}

}
