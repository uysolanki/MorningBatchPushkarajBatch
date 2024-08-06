package day25.colletionday3.listinterface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ContainsAllDemo {

	public static void main(String[] args) {
		List<String> mh=new ArrayList(Arrays.asList("Nanded","Pune","Mumbai"));
		System.out.println(mh);
		
		List<String> rj=new ArrayList(Arrays.asList("Jaipur","Fatehpur","Kota"));
		System.out.println(rj);
		
		List<String> mp=new ArrayList(Arrays.asList("Gwalior","Ratlam","Indore"));
		System.out.println(mp);
		
		List<String> India=new ArrayList();
		India.addAll(mh);
		India.addAll(rj);
		India.addAll(mp);
		System.out.println(India);
		India.retainAll(mh);
		System.out.println(India);
		
		
//		India.removeAll(rj);
//		System.out.println(India);
//		
//		System.out.println("Does India contain the  whole of Mh? " + India.containsAll(mh));
//		mh.add("Pimpri");
//		System.out.println("Does India contain the  whole of Mh? " + India.containsAll(mh));
//		India.add("Pimpri");
//		System.out.println("Does India contain the  whole of Mh? " + India.containsAll(mh));
	}

}
