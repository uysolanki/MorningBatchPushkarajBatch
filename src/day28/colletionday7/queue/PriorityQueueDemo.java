package day28.colletionday7.queue;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class PriorityQueueDemo {

	public static void main(String[] args) {
//		PriorityQueue<Integer> ages=new PriorityQueue<Integer>(Collections.reverseOrder());
//		ages.add(10);
//		ages.add(8);
//		ages.add(25);
//		ages.add(17);
//		System.out.println(ages);
//		System.out.println(ages.size());
//		System.out.println(ages.remove());
//		System.out.println(ages.size());
//		System.out.println(ages.remove());
		
		ArrayList<String> names=new ArrayList();
		names.add("Alice");
		names.add("Tom");
		names.add("Chris");
		names.add("Ben");
		System.out.println(names);
		
		ListIterator<String> namesListIterator=names.listIterator();
		namesListIterator.next();
		namesListIterator.remove();
		System.out.println(names);
//		while(namesListIterator.hasNext())
//		{
//			if(namesListIterator.next().equals("Tom"))
//			{
//				break;
//			}
//		}
//		namesListIterator.remove();
//		System.out.println(names);
		
		
}
}
