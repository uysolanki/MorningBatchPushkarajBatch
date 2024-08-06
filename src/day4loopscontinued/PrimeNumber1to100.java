package day4loopscontinued;

public class PrimeNumber1to100 {
public static void main(String[] args) {

	for(int n=1;n<=100;n++)
	{
		int i;
		int counter=0;
		for(i=1;i<=n;i++)
		{
		if(n%i==0)
			counter++;
		}
	
		if(counter==2)
		System.out.println(n);
	}
}
}
