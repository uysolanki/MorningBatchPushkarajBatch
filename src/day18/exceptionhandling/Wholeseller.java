package day18.exceptionhandling;

import java.util.Scanner;

public class Wholeseller {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter order quantity");
		int qty = sc.nextInt();

		orderproduct(qty);
				//throws is used to delegate the exception handling to the caller method
				//throw is used to explicitly throw an exception, majority of the time used 
				//to throw User Defined Exception
	}

	private static void orderproduct(int qty) {
		try {
			if (qty < 500)
				throw new LowQtyException("min order quantity is 500 units");
			else
				System.out.println("Order delivered");
		} catch (LowQtyException e1) {
			System.out.println(e1.getMessage());
		}
	}

}
