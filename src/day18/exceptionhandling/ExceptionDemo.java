package day18.exceptionhandling;

public class ExceptionDemo {

	public static void main(String[] args) {
		int n=10;
		int d=0;
		double n1=10.0;
		double d1=0.0;
		
		try
		{
		double ans=n1/d1;
		System.out.println(ans);
		}
		catch(ArithmeticException e1)
		{
			System.out.println(e1.getMessage());;
		}
		finally
		{
		System.out.println("Thank You!!!");
		}

	}

}
