package day20.filehandling;

import java.io.Serializable;

public class Person implements Serializable
{
	private static final long serialVersionUID =123456789L;
	private int adharNo;
	private String name;
	private int age;
	int x,y;
	
	public Person() {}
	
	public Person(int adharNo, String name, int age) {
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
	}

	public int getAdharNo() {
		return adharNo;
	}

	public void setAdharNo(int adharNo) {
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
	
	
}
