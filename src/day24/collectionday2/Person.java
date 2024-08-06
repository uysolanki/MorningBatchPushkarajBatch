package day24.collectionday2;

public class Person {
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
	
	@Override
	public String toString() {
		return "Person [adharNo=" + adharNo + ", name=" + name + ", age=" + age + "]";
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


}
