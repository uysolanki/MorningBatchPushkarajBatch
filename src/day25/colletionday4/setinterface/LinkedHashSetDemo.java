package day25.colletionday4.setinterface;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		Set<Person> names =new LinkedHashSet();
		names.add(new Person(1111,"Ben",28));
		names.add(new Person(3333,"Alice",25));
		names.add(new Person(2222,"Chris",26));
		
		System.out.println(names);
	}
}
