package day26.colletionday5.mapinterface;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) 
	{
		//int arr[]= {45,18,63,10,20};
//		int oddCounter=0;
//		int evenCounter=0;
//		
//		for(int n:arr)
//		{
//			if(n%2==0)
//				evenCounter++;
//			else
//				oddCounter++;
//		}
//		
//		System.out.println("Number of Odd Elements "+oddCounter);
//		System.out.println("Number of Even Elements "+evenCounter);
		
		
		int arr[]= {45,18,63,10,20};
		Map<String,Integer>  oddeven=new HashMap();
		oddeven.put("oddc",0);
		oddeven.put("evenc",0);
		
		for(int n:arr)
		{
			if(n%2==0)
			{
				oddeven.put("evenc", oddeven.get("evenc")+1);
			}
			else
			{
				oddeven.put("oddc", oddeven.get("oddc")+1);
			}
		}
		
		System.out.println(oddeven);
		
		
		
		
		
		
		
		
		
		/*String sentance="one two one one two three two three four five five six four one seventeen";
		
		
		
		
		
		
		
		one : 4
		two : 3
		three : 2
		four : 2
		five : 2
		six : 1
		seventeen : 1 */
		
		
		
	}

}
