package day28.colletionday7.queue;

import java.util.Scanner;

public class JuiceWorld {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number of Mango Juices");
		int mangoJuice=sc.nextInt();
		System.out.println("Enter Number of Pineapple Juices");
		int pineappleJuice=sc.nextInt();
		System.out.println("Enter Number of Sugarcane Juices");
		int sugarcaneJuice=sc.nextInt();
		
		MinimumTime mt=new MinimumTime();
		int minimumTime=mt.calculateMinimumTime(mangoJuice,pineappleJuice,sugarcaneJuice);
		System.out.println("Minimum time taken to prepare the order is " +minimumTime +  " seconds");
}

}
