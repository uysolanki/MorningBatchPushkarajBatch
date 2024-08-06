package day17.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NestedTryDemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int arr[]=new int[2];									//0      1
		try
		{														//100    50
		System.out.println("enter value for index 0");
		arr[0] = sc.nextInt(); 					       // java.util.InputMismatchException
		System.out.println("enter value for index 1"); // new InputMismatchException
		arr[1] = sc.nextInt();
		
					try
					{
					System.out.println("enter index of Numerator");
					int n=sc.nextInt();			//apple  InputMismatch
					System.out.println("enter index of Denominator");
					int d=sc.nextInt();			//d=1
					double result=arr[n]/arr[d]; //   100/0
					System.out.println(result);
					}
					catch(ArrayIndexOutOfBoundsException e1)
					{
						System.out.println("please enter valid index values 0 & 1 only");
					}
					catch(ArithmeticException e2)
					{
						System.out.println("Denominator cannot be zero");
					}
		}
		catch(InputMismatchException e1)
		{
			System.out.println("Please enter integer values only");
		}
		System.out.println("hii");
	}

}
