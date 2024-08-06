package day18.exceptionhandling;

public class ClonableDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		Person p1=new Person(123412341234L,"Alice", 23);
		
//		Person p2=p1;
//		p2.setName("Ben");
//		
//		System.out.println(p1);
		
		Person p2=(Person) p1.clone();
		p2.setName("Ben");
		System.out.println(p1);
	}

}
