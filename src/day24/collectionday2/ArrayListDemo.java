package day24.collectionday2;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
public static void main(String[] args) {
	List<String> studentname=new ArrayList();  //P p=new P()  Parent type ref can point to child class object
	studentname.add("Alice");
	studentname.add("Ben");
	studentname.add("Chris");
	studentname.add("David");
	studentname.add("Elcid");
	
	String student=studentname.get(3);
	System.out.println(student);
	
	//create a list to store the ages of people
	List ages=new ArrayList();
	ages.add(23);
	ages.add(21);
	
//	//of the type that we are providing in the <>
//	List<Person> persons =new ArrayList();
//	Person p1=new Person(111,"Alice",23);
//	Person p2=new Person(222,"Ben",24);
//	Person p3=new Person(333,"Chris",25);
//	
//	persons.add(p1);  //0
//	persons.add(p2);  //1
//	persons.add(p3);  //2
//	
//	System.out.println();
	

}
}
