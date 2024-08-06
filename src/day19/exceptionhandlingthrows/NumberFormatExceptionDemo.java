package day19.exceptionhandlingthrows;

public class NumberFormatExceptionDemo {

	public static void main(String[] args) {
		String sentance="one two 1 2 one two 1.2 1 one 2.3 2 three 3";
		String arr[]=sentance.split(" ");
		int intCounter=0;
		//int nonIntCounter=0;
		for(String s:arr)
		{
			try
			{
			int x=Integer.parseInt(s);
			intCounter++;
			}
			catch(NumberFormatException e1) {
			//	nonIntCounter++;
			}
		}
		System.out.println("Number of integer values are "+intCounter);
		System.out.println("Number of non integer values are "+(arr.length-intCounter));
	}

}
