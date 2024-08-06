package day22.bankingapp;

import java.util.Scanner;

public class BankMainApp {

	public static void main(String[] args) {
		Customer customer=new Customer("Virat","Virat@123");
		HDFCBank bank=new HDFCBank();
		
		Scanner sc=new Scanner(System.in);
		int choice;
		System.out.println("Enter Username"); //Virat
		String un=sc.next();
		System.out.println("Enter Password"); //Virat@123
		String pw=sc.next();

		if(customer.login(un, pw))
		{
			System.out.println("***Welcome to HDFC BANK***");
			do
			{
			System.out.println("****Banking Menu****");
			System.out.println("1. CheckBal");
			System.out.println("2. Withdraw");
			System.out.println("3. Deposit");
			System.out.println("4. Funds Transfer");
			System.out.println("5. Exit");
			
			
			System.out.println("Enter Choice"); 
			choice=sc.nextInt();
			
			switch(choice)
			{
			case 1:  double balance=bank.getBalance();
					 System.out.println("Your current balance is :"+balance);
					 break;
					 
			case 2:  
					 System.out.println("Enter Amount to Withdraw"); 
					 double wAmt=sc.nextDouble();
					 bank.withdraw(wAmt);
					 break;
					 
			case 3:  
				 	System.out.println("Enter Amount to Deposit"); 
				 	double dAmt=sc.nextDouble();
				 	bank.deposit(dAmt);
				 	break;
				 	
			case 4:  
			 		bank.fundsTransfer();
			 		break;
			 
			case 5 : System.exit(0);
			
			default : System.out.println("Invalid Input");
				 
			}
			}while(choice!=5);
			
		}
		else
		{
			System.out.println("Inavlid Customer");
		}

	}

}
