package day9oopfundamentals;

import java.util.Scanner;

public class Student {
		private int rno;    //instance variable == object
		private String name; //instance variable
		private double per; //instance variable
							//shared
		public void acceptStudent()
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter rno");  //18			45       1
			this.rno=sc.nextInt();
			System.out.println("Enter name");  //Virat      Rohit    Rahul
			this.name=sc.next();
			System.out.println("Enter percentage"); //78.5  88.5     98.5
			this.per=sc.nextDouble();
		}
		
		public void displayStudent()
		{
			System.out.println("rno is "+ this.rno);
			System.out.println("name is" + this.name);
			System.out.println("percentage is "+this.per);
		}
}
