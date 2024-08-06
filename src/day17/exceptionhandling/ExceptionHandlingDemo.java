package day17.exceptionhandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		int flag = 0;
		Scanner sc = new Scanner(System.in);
		do {
			try {
				
				System.out.println("enter Numerator");
				int n = sc.nextInt(); 					 // java.util.InputMismatchException
				System.out.println("enter Denominator"); // new InputMismatchException
				int d = sc.nextInt(); 					 // throw

				double result = n / d; 					// ArithmeticException
				System.out.println(result); 			// new ArithmeticException
				flag = 1;
			}

			catch (ArithmeticException | InputMismatchException e1) {
				System.out.println("Please check your input");
				sc.next();
			} 
//			catch (InputMismatchException e2) 
//			{
//				System.out.println("Please enter valid integer value");
//			} 
			catch (Exception e3) 					// Default EH switch case
			{
				System.out.println("Some Exception occured");
			}
		} while (flag == 0);
		System.out.println("hiiii");
	}

}
