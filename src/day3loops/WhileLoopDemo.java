package day3loops;

import java.util.Scanner;

public class WhileLoopDemo {

	public static void main(String[] args) {
		//System.out.println("ExcleR");
		
//		int i;
//		i=1;
//		while(i<=5)											//i
//		{													//1   is 1<=5 true			ExcelR1
//			System.out.println("ExcleR"+i);					//3   is 3<=5 true			ExcelR3
//			i=i+2;											//5   is 5<=5 true			ExcelR5
//		}													//7   is 7<=5 false  
//																					//	7
//		System.out.println(i);// after the loop output of this line    
//	
		
	
//		int i;
//		i=1;				//initialization
//		while(i<=20)        //condition								//1Excer
//		{															//2Excelr
//			if(i%3==0 && i%5==0)				
//			{
//				System.out.println(i+"ViratKohli");
//			}
//			else if(i%3==0)												//3Virat
//			{
//				System.out.println(i+"Virat");
//			}
//			else if(i%5==0)
//			{
//				System.out.println(i+"Kohli");
//			}
//			else
//			{
//				System.out.println(i+"ExcelR");
//			}
//			
//			i=i+1;			//increment
//		}
//																//rno		n		sum
																//1			10		0
//		Scanner sc=new Scanner(System.in);						//2			30		10   has target ach? No
//		int rno=1; 												//3			15		40   has target ach?No
//		int sum=0;												//loop				55   has target ach?Yes					
//		int n;                                                  //terminate
//		int target=50;										//count of student who contributed : 3
//		while(rno<=6)											//Surplus Chocolates : 5
//		{
//		System.out.println("Roll Number "+rno +", how many chocolates have you bought?");
//		n=sc.nextInt();
//		sum=sum+n;
//					if(sum>=target)
//					{
//						break;
//					}
//		rno=rno+1;
//		}
//		System.out.println("Total chocolates collected "+sum);
//		System.out.println("count of student who contributed "+rno);
//		System.out.println("Surplus  "+(sum-target));
//	}
	
//		//question :  display numbers from 1 to 5
//		int i=1;
//		while(i<=3)										//i					output
//		{												//1					1			is 1==3 False
//			System.out.println(i);						//2					2			is 2==3 False
//			i++;
//		}
		
		
	
		
		
		for(int i=1;i<=10;i++)							//i
		{												//1			is 1%2==1 true		
			if(i%2==1)									//2			is 2%2==1 false			j
			{																		//		1 Ex
				continue;															//      2 Ex
			}																		//		****
														//3         is 3%2==1 true
			for(int j=1;j<=i;j++)						//4         is 4%2==1 false			1 Ex
			{																		//		2 Ex
				System.out.println("ExcelR");										//		3 Ex
			}																		//		4 Ex
			System.out.println("*******");											//		****
		}
}
}


