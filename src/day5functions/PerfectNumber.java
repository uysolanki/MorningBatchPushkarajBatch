package day5functions;

import java.util.Scanner;

public class PerfectNumber {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter  a Number ");
	int n=sc.nextInt();					//n		SUM					i    N D
	int sum=0;							//6		0					1    6%1==0
	for(int i=1;i<n;i++)				//		1					2    6%2==0
	{									//		3					3    6%3==0
		if(n%i==0)						//		6					4
		  sum+=i;
	}									//							5	
	
	if(sum==n)
		System.out.println("PERFECT");
	else
		System.out.println("NOT PERFECT");
}
}
