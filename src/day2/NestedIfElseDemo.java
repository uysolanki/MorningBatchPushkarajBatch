package day2;

import java.util.Scanner;

public class NestedIfElseDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Salary");
		double salary=sc.nextDouble();
		
		//70 and above dist					100,000 and above excellent	
		//60 and above FC					75,000 and above v good
		//50 and above SC					50,000 and good
		//40 and above PC					25,000 and above ok
		//below 40 NP						not ok
		
		if(salary>=100000)   //is 34>=70 false
					System.out.println("Excellent");		
		else if(salary>=75000)  //is 34>=60 false
					System.out.println("V Good");
		
		else if(salary>=50000) //is 34>=50 false
					System.out.println("Good");
		
		else if(salary>=25000) //is 34>=40 false
					System.out.println("OK");

		else
					System.out.println("NOT OK");
					System.out.println("Good Luck!!");
		/*Sop("1. English");     // call routed to london
		Sop("2.HIndi");        // call routed to Delhi
		Sop("3. Marathi");  //call routed to Pune

		Sop("enter choice");
		choice = sc.nextInt();*/

		
		

	}

}
