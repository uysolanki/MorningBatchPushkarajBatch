package day5functions;

public class BikePerfectNumber {

	public static void main(String[] args) {
		
		for(int i=1;i<=9999;i++)    //i=100
		{
			int flag=0;
			for(int j=1;j<=10;j++) 
			{							//flag					//j 			{						
				if(i%j==0)
				{
					
				}
				else
				{
					flag=1;
					break;	
				}
			}
			
			if(flag==0)
			{
				System.out.println(i);
				break;
			}
		}

	}

}
