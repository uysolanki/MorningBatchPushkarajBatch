package day6recursionfunctions;

public class RecursionDemo {

	public static void main(String[] args) 
	{
		int n=3;
		int ans=factorial(n);
		System.out.println(ans);

	}

	private static int factorial(int n) {
		if(n==1)
		{
			return 1;
		}
		else
		{
			return n*factorial(n-1);
		}
	}

}
