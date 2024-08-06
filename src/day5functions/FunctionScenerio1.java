package day5functions;

import java.util.Scanner;

public class FunctionScenerio1 {

	public static void main(String[] args) {
		eventManagementCompany();								//call

	}

	private static void eventManagementCompany() {
		areaRect();
		areaCircle();
		
	}

	private static void areaCircle() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  Radius ");
		int radius=sc.nextInt();	
							//buy
		
		double ans=3.14*radius*radius;						//cook
		
		System.out.println("Area Of Circle is" + ans); //serve
		
	}

	private static void areaRect() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  Length ");
		int length=sc.nextInt();	
		System.out.println("Enter  Breadth ");
		int breadth=sc.nextInt();					//buy
		
		int ans=length*breadth;						//cook
		
		System.out.println("Area Of Rectangle is" + ans); //serve
	}

}
