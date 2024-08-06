package day4loopscontinued;

import java.util.Scanner;

public class PrimeNumberEg2 {

	public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  a Number ");
		int n=sc.nextInt();
		
		int flag=0; //assuming number is Prime
		int i;
		int loopCounter=0;
		for(i=2;i<n;i++)
		{
			loopCounter++;
			if(n%i==0)
			{
				flag=1;
				System.out.println("NOT Prime");
				break;
			}
		}
		
		if(flag==0)
			System.out.println("Prime");
		System.out.println("Iteration :"+loopCounter);
	}
	
	
}
