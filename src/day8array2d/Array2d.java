package day8array2d;

import java.util.Scanner;

public class Array2d {

	public static void main(String[] args) {
		int matrix[][] = new int[3][3];
		Scanner sc=new Scanner(System.in);
		for(int rows=0;rows<matrix.length;rows++)
		{
		 for(int cols=0;cols<matrix[rows].length;cols++)
		 {
		 System.out.println("Enter number");
		 matrix[rows][cols]=sc.nextInt();
		 }
		}
		
		for(int rows=0;rows<matrix.length;rows++)
		{
		 for(int cols=0;cols<matrix[rows].length;cols++)
		 {
		 System.out.print(matrix[rows][cols] +"\t");
		 }
		 System.out.println();
		}
		
//		int sum=0;
//		for(int rows=0;rows<matrix.length;rows++)
//		{
//		 for(int cols=0;cols<matrix[rows].length;cols++)
//		 {
//		sum+=matrix[rows][cols];
//		 }
//		}
//		System.out.println(sum);
		
		int sum=0;
		for(int arr[]:matrix)
		{
			
		}
	}

}
