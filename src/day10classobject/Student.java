package day10classobject;

import java.util.Scanner;

public class Student {
		
	int rno;					//instance variable/scope
	String sname;
	static int strength;
	
	static
	{
		strength=100;
	}
	public Student()
	{
		this.rno=1;
		this.sname="Rahul";
		strength++;
	}
	
	public Student(int a, String b)
	{
		this.rno=a;
		this.sname=b;
		strength++;
	}
	
	public void acceptStudent()
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter rno");
		rno=sc.nextInt();
		System.out.println("Enter name");
		sname=sc.next();
		
	}
	
	void displayStudent()
	{
		System.out.println("Rno is "+rno);
		System.out.println("Name is "+sname);
	}
	
	static void displayStrength()
	{
		int a;
		System.out.println("Strength of class is "+strength);	
	}
	
	
}
