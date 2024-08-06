package day24.collectionday2;

import java.util.ArrayList;
import java.util.List;

public class NestedCollectionDemo {

	public static void main(String[] args) {
		List<String> rj=new ArrayList();
		rj.add("Jaipur");
		rj.add("Fatehpur");
		rj.add("Kota");
		System.out.println("Does RJ contain Kota? " +rj.contains("Kota"));
		System.out.println("Does RJ contain Udaipur? " +rj.contains("Udaipur"));
		//System.out.println(rj);   //[Jaipur,Fatehpur,Kota]
		List<String> mh=new ArrayList();
		mh.add("Nanded");
		mh.add("Pune");
		mh.add("Mumbai");
		//System.out.println(mh);   //[Nanded,Pune,Mumbai]
		List<List<String>> India=new ArrayList();
		India.add(mh);
		System.out.println(mh);
		System.out.println(India);
		India.add(rj);
		System.out.println("Does India contain the  whole of Mh? " + India.contains(rj));
		//System.out.println(India);   //[[Nanded,Pune,Mumbai],[Jaipur,Fatehpur,Kota]]
//		System.out.println(rj.get(0));
//		System.out.println(mh.get(0));
//		System.out.println(India.get(0));
		
		
		List<String> Alaska=new ArrayList();
		Alaska.add("New York");
		Alaska.add("New Jersey");
		Alaska.add("California");



		List<String> Texas=new ArrayList();
		Texas.add("Washington");
		Texas.add("New Orleans");
		Texas.add("Hollywood");


		List<List<String>> USA=new ArrayList();
		USA.add(Alaska);
		USA.add(Texas);
		
		List<List<List<String>>>  Earth=new ArrayList();
		Earth.add(India);
		Earth.add(USA);

		System.out.println(mh.get(1));   //Pune
		System.out.println(India.get(0).get(1));   //Pune
		System.out.println(Earth.get(0).get(0).get(1));
		

	}

}
