package day8array2d;

import java.util.Scanner;

public class StringDemo {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");   //01234
		String name=sc.next();					//Alice
		int counterA=0;
		for(int i=0;i<name.length();i++)
		{
			if(name.charAt(i)=='a' || name.charAt(i)=='A')
			{
				counterA++;
			}
		}
		System.out.println("count of A is "+counterA);
		

	}

}
