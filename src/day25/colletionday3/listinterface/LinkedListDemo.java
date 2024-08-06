package day25.colletionday3.listinterface;

import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
//		LinkedList<String> students=new LinkedList();
//		students.add("Ben");
//		students.add("Chris");
//		students.addFirst("Alice");
//		students.addLast("Dom");
//		System.out.println(students);
//		
//		System.out.println(students.peekFirst());  //only returns the first element does not remove
//		System.out.println(students);
//		
//		System.out.println(students.pollFirst()); //will remove n return
//		System.out.println(students);
		
		ArrayList students=new ArrayList();
		students.add("Ben");
		students.add("Chris");
		students.add("Alice");
		students.add("Dom");
		
		LinkedList listOfStudents=new LinkedList(students);
		

	}

}
