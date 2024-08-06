package day4loopscontinued;

import java.util.Scanner;

public class DoWhileDemo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		int choice;
		
		System.out.println("Enter Number 1 :");
		int n1=sc.nextInt();
		System.out.println("Enter Number 2 :");
		int n2=sc.nextInt();
		
		do
		{
		System.out.println("1. Addition" +"\n" + "2. Substraction" + "\n" +"3. Multiplication" +"\n" + "4. Division" +"\n" + "0. Exit" );
		System.out.println("Enter choice");
		choice=sc.nextInt();
		double result;
		switch(choice)
		{
		case 1 : result=n1+n2;
		         System.out.println(result);
		         break;
		case 2 : result=n1-n2;
        		 System.out.println(result);
        		 break;
		case 3 : result=n1*n2;
        		 System.out.println(result);
        		 break;
		case 4 : result=n1/n2;
        		 System.out.println(result);
        		 break;
		case 0 : System.out.println("System Shutdown...."); System.exit(0);
		default : System.out.println("Invalid Input");
		}
		}while(choice!=0);
	}

}
