package day25.colletionday4.setinterface;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) 
	{
//		Set<String> names =new HashSet();
//		names.add("Alice");
//		names.add("Ben");
//		names.add("Chris");
//		names.add("Dom");
//		names.add("Chris");
//		names.add("Dom");
//		names.add(null);
//		names.add(null);
//		
//		System.out.println(names);
		
//		Set<Integer> set1=new HashSet(Arrays.asList(1,2,3));
//		Set<Integer> set2=new HashSet(Arrays.asList(3,4,5));
//		System.out.println("SET 1" + set1);
//		System.out.println("SET 2" + set2);
//		set1.addAll(set2);
//		System.out.println("Set 1 U Set 2" + set1);
		
//		Set<Integer> set1=new HashSet(Arrays.asList(1,2,3));
//		Set<Integer> set2=new HashSet(Arrays.asList(3,4,5));
//		System.out.println("SET 1" + set1);
//		System.out.println("SET 2" + set2);
//		set1.retainAll(set2);
//		System.out.println("Set 1 n Set 2" + set1);
		
		
		Set<Person> names =new HashSet();
		names.add(new Person(1111,"Ben",28));
		names.add(new Person(3333,"Alice",25));
		names.add(new Person(2222,"Chris",26));
		
		System.out.println(names);
		
		
	}

}
