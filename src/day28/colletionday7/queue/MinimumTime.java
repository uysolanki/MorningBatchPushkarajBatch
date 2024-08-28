package day28.colletionday7.queue;

import java.util.Collections;
import java.util.Iterator;
import java.util.PriorityQueue;

public class MinimumTime {
PriorityQueue<Integer> pq=new PriorityQueue(Collections.reverseOrder());

	public int calculateMinimumTime(int mangoJuice, int pineappleJuice, int sugarcaneJuice) 
	{
		pq.add(mangoJuice);			
		pq.add(pineappleJuice);
		pq.add(sugarcaneJuice);
		int seconds=0;
																		//5  3  4
		int j1,j2;
		Iterator<Integer> itr=pq.iterator();
		while(!pq.isEmpty())
		{
			j1=0;								//j1=0 , j2=0
			j2=0;
			
			if(itr.hasNext())											
			{
				j1=pq.remove();					//j1=6					//4   4
			}
			
			if(itr.hasNext())											
			{
				j2=pq.remove();                 //j2=4					//4 
			}
			
			if(j1>0 && j2==0)
			{
				seconds+=j1;
				break;	
			}
			
//			if(j1==0 && j2>0)
//			{
//				seconds+=j2;
//				break;	
//			}
			
			if(j1>0 && j2>0)
			{
				seconds++;						//seconds=2
				j1--;							//j1=5
				j2--;							//j2=3	
				
				
			}
			
			if(j1>0)
				pq.add(j1);
			
			if(j2>0)
				pq.add(j2);
		}
		
		return seconds;
		
	}

}
