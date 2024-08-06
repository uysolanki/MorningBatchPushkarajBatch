package day6recursionfunctions;

public class IterationDemo {

	public static void main(String[] args) {
		int n=5;
		int ans=factorial(n);
		System.out.println(ans);

	}

	private static int factorial(int n) {
		int fact=1;
		for(int i=n;i>=1;i--)
			fact=fact*i;
		return fact;
		
	}	

}
