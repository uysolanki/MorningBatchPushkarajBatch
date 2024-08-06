package day5functions;

import java.util.Scanner;

public class FunctionScenerio2 {

	public static void main(String[] args) {
		int result;
		result=areaRect();										//call
		System.out.println("Area of Rectangle is "+result);   //serve

	}

	private static int areaRect() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  Length ");
		int length=sc.nextInt();	
		System.out.println("Enter  Breadth ");
		int breadth=sc.nextInt();					//buy
		
		int ans=length*breadth;						//cook
		
		return(ans);
		
	}

}
