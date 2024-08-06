package day18.exceptionhandling;

public class Person //implements Cloneable 
{
	private long adharNo;
	private String name;
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
	public long getAdharNo() {
		return adharNo;
	}
	public void setAdharNo(long adharNo) {
		this.adharNo = adharNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", age=" + age + "]";
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

}
