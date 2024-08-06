package day27.colletionday6.mapinterfacecont;

public class Athlete
{
	private long adharNo;
	private String name;
	private int age;
	Address address;
	
	public Athlete() {}
	public Athlete(long adharNo, String name, int age, Address address) 
	{
		this.adharNo = adharNo;
		this.name = name;
		this.age = age;
		this.address = address;
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
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "Athlete [adharNo=" + adharNo + ", name=" + name + ", age=" + age + ", address=" + address + "]";
	}
	
	

}
