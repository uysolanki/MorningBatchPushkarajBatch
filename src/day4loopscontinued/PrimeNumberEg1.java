package day4loopscontinued;

import java.util.Scanner;

public class PrimeNumberEg1 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter  a Number ");
		int n=sc.nextInt();
		int i;
		int counter =0;
		int loopCounter=0;
		for(i=1;i<=n;i++)
		{
			loopCounter++;
			if(n%i==0)
				counter++;
		}
		
		if(counter==2)
			System.out.println("Prime");
		else
			System.out.println("Not Prime");
		
		System.out.println("Iterations Count "+loopCounter);
	}
}