package day7arraystrings;

import java.util.Scanner;

public class MobileArray {

	public static void main(String[] args) {
		//long mobiles[]=new long[5];
		long mobiles[]= {9890123123L,8888111222L,9822456789L,7670235417L,9850668812L};
//		Scanner sc=new Scanner(System.in);
//		for (int i = 0; i < mobiles.length; i++) 
//		{
//			System.out.println("Enter mobile number");
//			mobiles[i]=sc.nextLong();   //mobile numbers accepted from user
//		}
		for (int i = 0; i < mobiles.length; i++) 
		{
			System.out.print(mobiles[i]+",");  //mobile numbers displayed
		}
		System.out.println();
		for (int i = 0; i < mobiles.length; i++) 
		{
			long n=mobiles[i];    //n				oddCount    evenCount      r
			int oddCount=0;		  //9890123123      0			0              3
			int evenCount=0;      //989012312       1           1              2
			int r;                //98901231        2                          1
				while(n>0)
				{
					r=(int) (n%10);
					if(r%2==0)
					{
						evenCount++;
					}
					else
					{
						oddCount++;
					}
				n=n/10;	
				}
				if(evenCount>oddCount)
			System.out.println("Number " + (i+1) + "which is " +mobiles[i]+ " has "+ oddCount+ "Odd Digits"+ " has "+ evenCount+ "Even Digits" + "It is EvenBiased Number");
				else if(evenCount<oddCount)
			System.out.println("Number " + (i+1) + "which is " +mobiles[i]+ " has "+ oddCount+ "Odd Digits"+ " has "+ evenCount+ "Even Digits" + "It is OddBiased Number");
				else
			System.out.println("Number " + (i+1) + "which is " +mobiles[i]+ " has "+ oddCount+ "Odd Digits"+ " has "+ evenCount+ "Even Digits" + "It is Neutral Number");

		}

	}

}
