package day25.colletionday4.setinterface;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
//		Set<String> names =new TreeSet();
//		names.add("Alice");
//		names.add("Chris");
//		names.add("Ben");
//		names.add("Dom");
//		names.add(null);
//		
//		System.out.println(names);
		
//		Set<Integer> numbers =new TreeSet(Arrays.asList(100,50,150,200,175,25,75));
//		numbers.add(35);
//		System.out.println(numbers);
		
		Set<Person> ageWiseNames =new TreeSet(new AgeComparator());
		ageWiseNames.add(new Person(1111,"Ben",28));
		ageWiseNames.add(new Person(3333,"Alice",25));
		ageWiseNames.add(new Person(2222,"Chris",25));
		
		System.out.println("Age Wise" +ageWiseNames);
		
		Set<Person> adharWiseNames =new TreeSet(new AdharComparator());
		adharWiseNames.add(new Person(1111,"Ben",28));
		adharWiseNames.add(new Person(3333,"Alice",25));
		adharWiseNames.add(new Person(2222,"Chris",26));
		
		System.out.println("Adhar wise " +adharWiseNames);
		
		Set<Person> nameWiseNames =new TreeSet(new NameComparator());
		nameWiseNames.add(new Person(1111,"Ben",28));
		nameWiseNames.add(new Person(3333,"Alice",25));
		nameWiseNames.add(new Person(2222,"Chris",26));
		
		System.out.println("Name wise "+nameWiseNames);

	}

}
