package day8array2d;

import java.util.Scanner;

public class ForEach2DArray {

	public static void main(String[] args) {
		int matrix[][] = new int[2][2];
		Scanner sc=new Scanner(System.in);
		for(int rows=0;rows<matrix.length;rows++)
		{
		 for(int cols=0;cols<matrix[rows].length;cols++)
		 {
		 System.out.println("Enter number");
		 matrix[rows][cols]=sc.nextInt();
		 }
		}
		
		for(int arr[] : matrix)
		{
			for(int n:arr)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
		
		
		for(int arr[] : matrix)
		{
			int sumRow=0;
			for(int n:arr)
			{
				sumRow+=n;
			}
			System.out.println("Sum is "+sumRow);
		}

	}

}
