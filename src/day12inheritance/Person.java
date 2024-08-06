package day12inheritance;

public class Person {
	public long adharNo;
	public String name;
	private int age;
	
	public Person()
	{
	this.adharNo=111122223333L;
	this.name="Alice";
	this.age=21;
	}
	public Person(long a,String b,int c)
	{
	this.adharNo=a;
	this.name=b;
	this.age=c;
	}
	public void displayPersonalDetails()
	{
	System.out.println("Adhar No is" + this.adharNo);
	System.out.println("Name is" + this.name);
	System.out.println("Age is" + this.age);
	}


}
