package day25.colletionday3.listinterface;

import java.util.ArrayList;
import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {
		Vector v1=new Vector();   //default capacity=10, default increment=double
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Size "+v1.size());
		for(int i=1;i<=10;i++)
			v1.add("Apple");
		
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Size "+v1.size());
		
		v1.add("Apple");
		System.out.println("Capacity "+v1.capacity());
		System.out.println("Size "+v1.size());
		
		Vector v2=new Vector(5);   //user def capacity=5, default increment=double
		for(int i=1;i<=6;i++)
			v2.add("Apple");
		
		System.out.println("Capacity "+v2.capacity());
		System.out.println("Size "+v2.size());
		
		
		Vector v3=new Vector(5,3);
		for(int i=1;i<=6;i++)
			v3.add("Apple");
		
		System.out.println("Capacity "+v3.capacity());
		System.out.println("Size "+v3.size());
		
		ArrayList students=new ArrayList();
		students.add("Ben");
		students.add("Chris");
		students.add("Alice");
		students.add("Dom");
		
		Vector v4=new Vector(students);   //convert given collection to a Vector
		System.out.println(v4);
		
		v4.addElement("Frank");
		v4.elementAt(0);
	}

}
