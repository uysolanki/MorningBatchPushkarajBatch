package day8array2d;

import java.util.Scanner;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		int jarray[][]=new int[3][];
		jarray[0]=new int[2];
		jarray[1]=new int[4];
		jarray[2]=new int[3];
		Scanner sc=new Scanner(System.in);
		for(int rows=0;rows<jarray.length;rows++)
		{
			for(int cols=0;cols<jarray[rows].length; cols++)
			{
				System.out.println("Enter number");
				 jarray[rows][cols]=sc.nextInt();
			}
		}
		
		for(int rows=0;rows<jarray.length;rows++)
		{
			for(int cols=0;cols<jarray[rows].length; cols++)
			{
				System.out.print(jarray[rows][cols] + "\t");
			}
			System.out.println();
		}

	}

}
