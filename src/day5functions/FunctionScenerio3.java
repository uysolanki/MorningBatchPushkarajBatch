package day5functions;

import java.util.Scanner;

public class FunctionScenerio3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter  Length ");
	int length=sc.nextInt(); //10	
	System.out.println("Enter  Breadth ");
	int breadth=sc.nextInt(); //5					//buy
	
	int result=areaRect(length,breadth); 		//call Actual Parameters
	System.out.println("Area Of Rectangle is "+result);  //serve
}

private static int areaRect(int length, int breadth)  //Formal Parameters
{
	int ans=length*breadth;                     //cook
	return ans;
}
}
