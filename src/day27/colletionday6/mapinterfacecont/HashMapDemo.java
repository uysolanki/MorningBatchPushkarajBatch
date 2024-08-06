package day27.colletionday6.mapinterfacecont;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {
	
		HashMap<String,Athlete> m100=new HashMap();
		m100.put("first", new Athlete(18,"Virat",32,new Address(15, "17 Bund Garden Road","Opp Residency Club", 411001)));
		m100.put("third", new Athlete(77,"Shubman",24, new Address(15, "Dhole Patil Road","Opp Pancard Club", 411002)));
		m100.put("second", new Athlete(45,"Rohit",35, new Address(15, "Koregaon Park","Opp Jehangir Hospital", 411003)));
		//System.out.println(m100);
		HashMap<String,Athlete> m200=new HashMap();
		m200.put("first", new Athlete(63,"Surya",32, new Address(15, "MG Road","Above Yeti Restaurant", 411004)));
		m200.put("third", new Athlete(1,"Rahul",24,new Address(15, "FC Road","Opp Boat Club", 411005)));
		m200.put("second", new Athlete(17,"Rishab",35,new Address(15, "JM Road","Opp Conrad Club", 411045)));
		//System.out.println(m200);
		//System.out.println(m200.get("second").getName());
		HashMap<String,Athlete> m400=new HashMap();
		m400.put("first", new Athlete(11,"Alice",32, new Address(15, "MG Road","Above Yeti Restaurant", 411004)));
		m400.put("third", new Athlete(21,"Ben",24,new Address(15, "FC Road","Opp Boat Club", 411005)));
		m400.put("second", new Athlete(31,"Chris",35,new Address(15, "JM Road","Opp Conrad Club", 411045)));
		
		List<HashMap<String,Athlete>> olympics=new ArrayList();
		
		olympics.add(m200);
		olympics.add(m100);
		olympics.add(m400);
		
//		System.out.println(olympics.get(0).get("second").getName());
//		System.out.println(olympics.get(1).get("first").getAge());
//		// I wish to see the pincode of the Athlete who has come second in the 200 m race
//		
//		System.out.println(olympics.get(0).get("second").getAddress().getPinCode());
//		System.out.println(olympics);
//		
		for(int i=0;i<olympics.size();i++)
		{
			System.out.println(olympics.get(i).get("first").getName());
		}
		

	}

}
