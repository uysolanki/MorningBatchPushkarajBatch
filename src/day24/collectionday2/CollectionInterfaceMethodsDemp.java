package day24.collectionday2;

import java.util.ArrayList;
import java.util.List;

public class CollectionInterfaceMethodsDemp {

	public static void main(String[] args) {
		List a1=new ArrayList();  //P p=new P()  Parent type ref can point to child class object
		System.out.println(a1.add("Alice")); //String
		System.out.println(a1.add(123));    //Integer
		System.out.println(a1.add(12.3));   //Double
		System.out.println(a1.add(true));   //Boolean
		System.out.println(a1.add('a'));    //Character
		System.out.println("After creating Arraylist" +a1);
		a1.clear();
		System.out.println("Size "+a1.size());
		System.out.println("Is Empty " +a1.isEmpty());
		List a2=new ArrayList(); 
		System.out.println(a2.isEmpty());
		//a1.add
//		try
//		{
//		System.out.println(a1.remove(8));
//		}
//		catch (IndexOutOfBoundsException e) {
//			System.out.println(e.getMessage());
//			// TODO: handle exception
//		}
//		System.out.println("After creating Arraylist" +a1);
//		a1.add(2, "Frank");
//		System.out.println("After Adding Frank at index 2" +a1);
//		
//		System.out.println(a1.remove("Krish"));
//		System.out.println("After removing Chris" + a1);
//		a1.remove(3);
//		System.out.println("After removing element at index 3" + a1);
		
		
		
	}

}
