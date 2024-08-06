package day19.exceptionhandlingthrows;

import java.io.IOException;
import java.util.Scanner;

public class ThrowsDemo {

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Numerator");
		int num=sc.nextInt();
		System.out.println("Enter Denominator");
		int den=sc.nextInt();
		
		double result;
		try {
			result = divide(num,den);
			System.out.println("Result is "+result);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
			

	}

	private static double divide(int num,int den) throws IOException
	{
	return num/den;   //core business logic 
	}	
		
}