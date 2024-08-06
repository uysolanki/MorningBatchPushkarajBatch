package day25.colletionday4.setinterface;

public class Person// implements Comparable<Person>
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
//	@Override
//	public int compareTo(Person p) {
//		return this.name.compareTo(p.name);
//	}
	
//	@Override
//	public int compareTo(Person p) {
//		if(this.adharNo > p.adharNo)
//		return 1;
//		else if(this.adharNo < p.adharNo)
//		return -1;
//		else
//		return 0;	
//	}
	
//	@Override
//	public int compareTo(Person p) {
//		if(this.age > p.age)
//		return 1;
//		else if(this.age < p.age)
//		return -1;
//		else
//		return 0;	
//	}


}
