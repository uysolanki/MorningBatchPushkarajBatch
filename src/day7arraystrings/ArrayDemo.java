package day7arraystrings;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
		int arr[]=new int[5];  // Declare
		
		Scanner sc=new Scanner(System.in);
//		System.out.println("Please enter Array size");
//		int size=sc.nextInt();
//		
//		int brr[]=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("Please enter a number");   //123  153  150  370  199
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		System.out.println("Entered Numbers are as follows");
		for(int i=0;i<arr.length;i++)
		{                                                  // 0    1   2    3     4
			System.out.println(arr[i]);                    //123  153  150  370  199
		}
		
		
		armstrong(arr);										//i		arr[i]	 n		sum	  r	
	}

	private static void armstrong(int[] arr) {
		int n;
		System.out.println("Armstrong Numbers are as follows");
		for(int i=0;i<arr.length;i++)			//0		123		 123    0     3
		{										//				 12		27    2
			n=arr[i];							//				 1		35    1
			int sum=0;							//				 0		36
			while(n>0)
			{
				int r=n%10;
				sum=sum+r*r*r;
				n=n/10;
			}
			if(arr[i]==sum)
				System.out.println(arr[i]);
		}
		
	}
}
